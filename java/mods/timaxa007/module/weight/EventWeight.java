package mods.timaxa007.module.weight;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.EntityEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.relauncher.Side;

public class EventWeight {
	//-------------------------------------------------------------------------V
	public static class Player {

		@SubscribeEvent
		public void addPlayerConstructingWeight(EntityEvent.EntityConstructing event) {
			if (event.entity instanceof EntityPlayer)
				if (PlayerWeight.get((EntityPlayer)event.entity) == null)
					PlayerWeight.reg((EntityPlayer)event.entity);
		}

	}
	//-------------------------------------------------------------------------V
	public static class Common {

		@SubscribeEvent(priority = EventPriority.LOWEST)
		public void updatePlayer(TickEvent.PlayerTickEvent event) {
			if (event.phase == TickEvent.Phase.START) {
				EntityPlayer player = event.player;
				SystemWeight.sumMoving(player);
			}
		}

	}
	//-------------------------------------------------------------------------X
}
