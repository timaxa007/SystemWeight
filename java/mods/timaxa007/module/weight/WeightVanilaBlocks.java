package mods.timaxa007.module.weight;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

public class WeightVanilaBlocks {

	public static float getVanilaBlock(Block block, int metadata) {
		if (block == Blocks.stone) return IWeightVanilaBlock.stone;
		else if (block == Blocks.grass) return IWeightVanilaBlock.grass;
		else if (block == Blocks.dirt && metadata == 0) return IWeightVanilaBlock.dirt_0;
		else if (block == Blocks.dirt && metadata == 1) return IWeightVanilaBlock.dirt_1;
		else if (block == Blocks.dirt && metadata == 2) return IWeightVanilaBlock.dirt_2;
		else if (block == Blocks.cobblestone) return IWeightVanilaBlock.cobblestone;
		else if (block == Blocks.planks && metadata == 0) return IWeightVanilaBlock.planks_0;
		else if (block == Blocks.planks && metadata == 1) return IWeightVanilaBlock.planks_1;
		else if (block == Blocks.planks && metadata == 2) return IWeightVanilaBlock.planks_2;
		else if (block == Blocks.planks && metadata == 3) return IWeightVanilaBlock.planks_3;
		else if (block == Blocks.planks && metadata == 4) return IWeightVanilaBlock.planks_4;
		else if (block == Blocks.planks && metadata == 5) return IWeightVanilaBlock.planks_5;
		else if (block == Blocks.sapling && metadata == 0) return IWeightVanilaBlock.sapling_0;
		else if (block == Blocks.sapling && metadata == 1) return IWeightVanilaBlock.sapling_1;
		else if (block == Blocks.sapling && metadata == 2) return IWeightVanilaBlock.sapling_2;
		else if (block == Blocks.sapling && metadata == 3) return IWeightVanilaBlock.sapling_3;
		else if (block == Blocks.sapling && metadata == 4) return IWeightVanilaBlock.sapling_4;
		else if (block == Blocks.sapling && metadata == 5) return IWeightVanilaBlock.sapling_5;
		else if (block == Blocks.bedrock) return IWeightVanilaBlock.bedrock;
		else if (block == Blocks.flowing_water) return IWeightVanilaBlock.flowing_water;
		else if (block == Blocks.water) return IWeightVanilaBlock.water;
		else if (block == Blocks.flowing_lava) return IWeightVanilaBlock.flowing_lava;
		else if (block == Blocks.lava) return IWeightVanilaBlock.lava;
		else if (block == Blocks.sand && metadata == 0) return IWeightVanilaBlock.sand_0;
		else if (block == Blocks.sand && metadata == 1) return IWeightVanilaBlock.sand_1;
		else if (block == Blocks.gravel) return IWeightVanilaBlock.gravel;
		else if (block == Blocks.gold_ore) return IWeightVanilaBlock.gold_ore;
		else if (block == Blocks.iron_ore) return IWeightVanilaBlock.iron_ore;
		else if (block == Blocks.coal_ore) return IWeightVanilaBlock.coal_ore;
		else if (block == Blocks.log && metadata == 0) return IWeightVanilaBlock.log_0;
		else if (block == Blocks.log && metadata == 1) return IWeightVanilaBlock.log_1;
		else if (block == Blocks.log && metadata == 2) return IWeightVanilaBlock.log_2;
		else if (block == Blocks.log && metadata == 3) return IWeightVanilaBlock.log_3;
		else if (block == Blocks.log2 && metadata == 0) return IWeightVanilaBlock.log2_0;
		else if (block == Blocks.log2 && metadata == 1) return IWeightVanilaBlock.log2_1;
		else if (block == Blocks.leaves && metadata == 0) return IWeightVanilaBlock.leaves_0;
		else if (block == Blocks.leaves && metadata == 1) return IWeightVanilaBlock.leaves_1;
		else if (block == Blocks.leaves && metadata == 2) return IWeightVanilaBlock.leaves_2;
		else if (block == Blocks.leaves && metadata == 3) return IWeightVanilaBlock.leaves_3;
		else if (block == Blocks.leaves2 && metadata == 0) return IWeightVanilaBlock.leaves2_0;
		else if (block == Blocks.leaves2 && metadata == 1) return IWeightVanilaBlock.leaves2_1;
		else if (block == Blocks.sponge) return IWeightVanilaBlock.sponge;
		else if (block == Blocks.glass) return IWeightVanilaBlock.glass;
		else if (block == Blocks.lapis_ore) return IWeightVanilaBlock.lapis_ore;
		else if (block == Blocks.lapis_block) return IWeightVanilaBlock.lapis_block;
		else if (block == Blocks.dispenser) return IWeightVanilaBlock.dispenser;
		else if (block == Blocks.sandstone && metadata == 0) return IWeightVanilaBlock.sandstone_0;
		else if (block == Blocks.sandstone && metadata == 1) return IWeightVanilaBlock.sandstone_1;
		else if (block == Blocks.sandstone && metadata == 2) return IWeightVanilaBlock.sandstone_2;
		else if (block == Blocks.noteblock) return IWeightVanilaBlock.noteblock;
		else if (block == Blocks.bed) return IWeightVanilaBlock.bed;
		else if (block == Blocks.golden_rail) return IWeightVanilaBlock.golden_rail;
		else if (block == Blocks.detector_rail) return IWeightVanilaBlock.detector_rail;
		else if (block == Blocks.sticky_piston) return IWeightVanilaBlock.sticky_piston;
		else if (block == Blocks.web) return IWeightVanilaBlock.web;
		else if (block == Blocks.tallgrass && metadata == 0) return IWeightVanilaBlock.tallgrass_0;
		else if (block == Blocks.tallgrass && metadata == 1) return IWeightVanilaBlock.tallgrass_1;
		else if (block == Blocks.tallgrass && metadata == 2) return IWeightVanilaBlock.tallgrass_2;
		else if (block == Blocks.tallgrass && metadata == 3) return IWeightVanilaBlock.tallgrass_3;
		else if (block == Blocks.deadbush) return IWeightVanilaBlock.deadbush;
		else if (block == Blocks.piston) return IWeightVanilaBlock.piston;
		else if (block == Blocks.piston_head) return IWeightVanilaBlock.piston_head;
		else if (block == Blocks.wool && metadata == 0) return IWeightVanilaBlock.wool_0;
		else if (block == Blocks.wool && metadata == 1) return IWeightVanilaBlock.wool_1;
		else if (block == Blocks.wool && metadata == 2) return IWeightVanilaBlock.wool_2;
		else if (block == Blocks.wool && metadata == 3) return IWeightVanilaBlock.wool_3;
		else if (block == Blocks.wool && metadata == 4) return IWeightVanilaBlock.wool_4;
		else if (block == Blocks.wool && metadata == 5) return IWeightVanilaBlock.wool_5;
		else if (block == Blocks.wool && metadata == 6) return IWeightVanilaBlock.wool_6;
		else if (block == Blocks.wool && metadata == 7) return IWeightVanilaBlock.wool_7;
		else if (block == Blocks.wool && metadata == 8) return IWeightVanilaBlock.wool_8;
		else if (block == Blocks.wool && metadata == 9) return IWeightVanilaBlock.wool_9;
		else if (block == Blocks.wool && metadata == 10) return IWeightVanilaBlock.wool_10;
		else if (block == Blocks.wool && metadata == 11) return IWeightVanilaBlock.wool_11;
		else if (block == Blocks.wool && metadata == 12) return IWeightVanilaBlock.wool_12;
		else if (block == Blocks.wool && metadata == 13) return IWeightVanilaBlock.wool_13;
		else if (block == Blocks.wool && metadata == 14) return IWeightVanilaBlock.wool_14;
		else if (block == Blocks.wool && metadata == 15) return IWeightVanilaBlock.wool_15;
		else if (block == Blocks.piston_extension) return IWeightVanilaBlock.piston_extension;
		else if (block == Blocks.yellow_flower) return IWeightVanilaBlock.yellow_flower;
		else if (block == Blocks.red_flower && metadata == 0) return IWeightVanilaBlock.red_flower_0;
		else if (block == Blocks.red_flower && metadata == 1) return IWeightVanilaBlock.red_flower_1;
		else if (block == Blocks.red_flower && metadata == 2) return IWeightVanilaBlock.red_flower_2;
		else if (block == Blocks.red_flower && metadata == 3) return IWeightVanilaBlock.red_flower_3;
		else if (block == Blocks.red_flower && metadata == 4) return IWeightVanilaBlock.red_flower_4;
		else if (block == Blocks.red_flower && metadata == 5) return IWeightVanilaBlock.red_flower_5;
		else if (block == Blocks.red_flower && metadata == 6) return IWeightVanilaBlock.red_flower_6;
		else if (block == Blocks.red_flower && metadata == 7) return IWeightVanilaBlock.red_flower_7;
		else if (block == Blocks.red_flower && metadata == 8) return IWeightVanilaBlock.red_flower_8;
		else if (block == Blocks.brown_mushroom) return IWeightVanilaBlock.brown_mushroom;
		else if (block == Blocks.red_mushroom) return IWeightVanilaBlock.red_mushroom;
		else if (block == Blocks.gold_block) return IWeightVanilaBlock.gold_block;
		else if (block == Blocks.iron_block) return IWeightVanilaBlock.iron_block;
		else if (block == Blocks.double_stone_slab && metadata == 0) return IWeightVanilaBlock.double_stone_slab_0;
		else if (block == Blocks.double_stone_slab && metadata == 1) return IWeightVanilaBlock.double_stone_slab_1;
		else if (block == Blocks.double_stone_slab && metadata == 2) return IWeightVanilaBlock.double_stone_slab_2;
		else if (block == Blocks.double_stone_slab && metadata == 3) return IWeightVanilaBlock.double_stone_slab_3;
		else if (block == Blocks.double_stone_slab && metadata == 4) return IWeightVanilaBlock.double_stone_slab_4;
		else if (block == Blocks.double_stone_slab && metadata == 5) return IWeightVanilaBlock.double_stone_slab_5;
		else if (block == Blocks.double_stone_slab && metadata == 6) return IWeightVanilaBlock.double_stone_slab_6;
		else if (block == Blocks.double_stone_slab && metadata == 7) return IWeightVanilaBlock.double_stone_slab_7;
		else if (block == Blocks.double_stone_slab && metadata == 8) return IWeightVanilaBlock.double_stone_slab_8;
		else if (block == Blocks.double_stone_slab && metadata == 9) return IWeightVanilaBlock.double_stone_slab_9;
		else if (block == Blocks.stone_slab && metadata == 0) return IWeightVanilaBlock.stone_slab_0;
		else if (block == Blocks.stone_slab && metadata == 1) return IWeightVanilaBlock.stone_slab_1;
		else if (block == Blocks.stone_slab && metadata == 2) return IWeightVanilaBlock.stone_slab_2;
		else if (block == Blocks.stone_slab && metadata == 3) return IWeightVanilaBlock.stone_slab_3;
		else if (block == Blocks.stone_slab && metadata == 4) return IWeightVanilaBlock.stone_slab_4;
		else if (block == Blocks.stone_slab && metadata == 5) return IWeightVanilaBlock.stone_slab_5;
		else if (block == Blocks.stone_slab && metadata == 6) return IWeightVanilaBlock.stone_slab_6;
		else if (block == Blocks.stone_slab && metadata == 7) return IWeightVanilaBlock.stone_slab_7;
		else if (block == Blocks.brick_block) return IWeightVanilaBlock.brick_block;
		else if (block == Blocks.tnt) return IWeightVanilaBlock.tnt;
		else if (block == Blocks.bookshelf) return IWeightVanilaBlock.bookshelf;
		else if (block == Blocks.mossy_cobblestone) return IWeightVanilaBlock.mossy_cobblestone;
		else if (block == Blocks.obsidian) return IWeightVanilaBlock.obsidian;
		else if (block == Blocks.torch) return IWeightVanilaBlock.torch;
		else if (block == Blocks.fire) return IWeightVanilaBlock.fire;
		else if (block == Blocks.mob_spawner) return IWeightVanilaBlock.mob_spawner;
		else if (block == Blocks.oak_stairs) return IWeightVanilaBlock.oak_stairs;
		else if (block == Blocks.chest) return IWeightVanilaBlock.chest;
		else if (block == Blocks.redstone_wire) return IWeightVanilaBlock.redstone_wire;
		else if (block == Blocks.diamond_ore) return IWeightVanilaBlock.diamond_ore;
		else if (block == Blocks.diamond_block) return IWeightVanilaBlock.diamond_block;
		else if (block == Blocks.crafting_table) return IWeightVanilaBlock.crafting_table;
		else if (block == Blocks.wheat) return IWeightVanilaBlock.wheat;
		else if (block == Blocks.farmland) return IWeightVanilaBlock.farmland;
		else if (block == Blocks.furnace) return IWeightVanilaBlock.furnace;
		else if (block == Blocks.lit_furnace) return IWeightVanilaBlock.lit_furnace;
		else if (block == Blocks.standing_sign) return IWeightVanilaBlock.standing_sign;
		else if (block == Blocks.wooden_door) return IWeightVanilaBlock.wooden_door;
		else if (block == Blocks.ladder) return IWeightVanilaBlock.ladder;
		else if (block == Blocks.rail) return IWeightVanilaBlock.rail;
		else if (block == Blocks.stone_stairs) return IWeightVanilaBlock.stone_stairs;
		else if (block == Blocks.wall_sign) return IWeightVanilaBlock.wall_sign;
		else if (block == Blocks.lever) return IWeightVanilaBlock.lever;
		else if (block == Blocks.stone_pressure_plate) return IWeightVanilaBlock.stone_pressure_plate;
		else if (block == Blocks.iron_door) return IWeightVanilaBlock.iron_door;
		else if (block == Blocks.wooden_pressure_plate) return IWeightVanilaBlock.wooden_pressure_plate;
		else if (block == Blocks.redstone_ore) return IWeightVanilaBlock.redstone_ore;
		else if (block == Blocks.lit_redstone_ore) return IWeightVanilaBlock.lit_redstone_ore;
		else if (block == Blocks.unlit_redstone_torch) return IWeightVanilaBlock.unlit_redstone_torch;
		else if (block == Blocks.redstone_torch) return IWeightVanilaBlock.redstone_torch;
		else if (block == Blocks.stone_button) return IWeightVanilaBlock.stone_button;
		else if (block == Blocks.snow_layer) return IWeightVanilaBlock.snow_layer;
		else if (block == Blocks.ice) return IWeightVanilaBlock.ice;
		else if (block == Blocks.snow) return IWeightVanilaBlock.snow;
		else if (block == Blocks.cactus) return IWeightVanilaBlock.cactus;
		else if (block == Blocks.clay) return IWeightVanilaBlock.clay;
		else if (block == Blocks.reeds) return IWeightVanilaBlock.reeds;
		else if (block == Blocks.jukebox) return IWeightVanilaBlock.jukebox;
		else if (block == Blocks.pumpkin) return IWeightVanilaBlock.pumpkin;
		else if (block == Blocks.netherrack) return IWeightVanilaBlock.netherrack;
		else if (block == Blocks.soul_sand) return IWeightVanilaBlock.soul_sand;
		else if (block == Blocks.glowstone) return IWeightVanilaBlock.glowstone;
		else if (block == Blocks.portal) return IWeightVanilaBlock.portal;
		else if (block == Blocks.lit_pumpkin) return IWeightVanilaBlock.lit_pumpkin;
		else if (block == Blocks.cake) return IWeightVanilaBlock.cake;
		else if (block == Blocks.unpowered_repeater) return IWeightVanilaBlock.unpowered_repeater;
		else if (block == Blocks.powered_repeater) return IWeightVanilaBlock.powered_repeater;
		else if (block == Blocks.trapdoor) return IWeightVanilaBlock.trapdoor;
		else if (block == Blocks.monster_egg && metadata == 0) return IWeightVanilaBlock.monster_egg_0;
		else if (block == Blocks.monster_egg && metadata == 1) return IWeightVanilaBlock.monster_egg_1;
		else if (block == Blocks.monster_egg && metadata == 2) return IWeightVanilaBlock.monster_egg_2;
		else if (block == Blocks.stonebrick && metadata == 0) return IWeightVanilaBlock.stonebrick_0;
		else if (block == Blocks.stonebrick && metadata == 1) return IWeightVanilaBlock.stonebrick_1;
		else if (block == Blocks.stonebrick && metadata == 2) return IWeightVanilaBlock.stonebrick_2;
		else if (block == Blocks.stonebrick && metadata == 3) return IWeightVanilaBlock.stonebrick_3;
		else if (block == Blocks.brown_mushroom_block) return IWeightVanilaBlock.brown_mushroom_block;
		else if (block == Blocks.red_mushroom_block) return IWeightVanilaBlock.red_mushroom_block;
		else if (block == Blocks.iron_bars) return IWeightVanilaBlock.iron_bars;
		else if (block == Blocks.glass_pane) return IWeightVanilaBlock.glass_pane;
		else if (block == Blocks.melon_block) return IWeightVanilaBlock.melon_block;
		else if (block == Blocks.pumpkin_stem) return IWeightVanilaBlock.pumpkin_stem;
		else if (block == Blocks.melon_stem) return IWeightVanilaBlock.melon_stem;
		else if (block == Blocks.vine) return IWeightVanilaBlock.vine;
		else if (block == Blocks.fence_gate) return IWeightVanilaBlock.fence_gate;
		else if (block == Blocks.brick_stairs) return IWeightVanilaBlock.brick_stairs;
		else if (block == Blocks.stone_brick_stairs) return IWeightVanilaBlock.stone_brick_stairs;
		else if (block == Blocks.mycelium) return IWeightVanilaBlock.mycelium;
		else if (block == Blocks.waterlily) return IWeightVanilaBlock.waterlily;
		else if (block == Blocks.nether_brick) return IWeightVanilaBlock.nether_brick;
		else if (block == Blocks.nether_brick_fence) return IWeightVanilaBlock.nether_brick_fence;
		else if (block == Blocks.nether_brick_stairs) return IWeightVanilaBlock.nether_brick_stairs;
		else if (block == Blocks.nether_wart) return IWeightVanilaBlock.nether_wart;
		else if (block == Blocks.enchanting_table) return IWeightVanilaBlock.enchanting_table;
		else if (block == Blocks.brewing_stand) return IWeightVanilaBlock.brewing_stand;
		else if (block == Blocks.cauldron) return IWeightVanilaBlock.cauldron;
		else if (block == Blocks.end_portal) return IWeightVanilaBlock.end_portal;
		else if (block == Blocks.end_portal_frame) return IWeightVanilaBlock.end_portal_frame;
		else if (block == Blocks.end_stone) return IWeightVanilaBlock.end_stone;
		else if (block == Blocks.dragon_egg) return IWeightVanilaBlock.dragon_egg;
		else if (block == Blocks.redstone_lamp) return IWeightVanilaBlock.redstone_lamp;
		else if (block == Blocks.lit_redstone_lamp) return IWeightVanilaBlock.lit_redstone_lamp;
		else if (block == Blocks.double_wooden_slab && metadata == 0) return IWeightVanilaBlock.double_wooden_slab_0;
		else if (block == Blocks.double_wooden_slab && metadata == 1) return IWeightVanilaBlock.double_wooden_slab_1;
		else if (block == Blocks.double_wooden_slab && metadata == 2) return IWeightVanilaBlock.double_wooden_slab_2;
		else if (block == Blocks.double_wooden_slab && metadata == 3) return IWeightVanilaBlock.double_wooden_slab_3;
		else if (block == Blocks.wooden_slab && metadata == 0) return IWeightVanilaBlock.wooden_slab_0;
		else if (block == Blocks.wooden_slab && metadata == 1) return IWeightVanilaBlock.wooden_slab_1;
		else if (block == Blocks.wooden_slab && metadata == 2) return IWeightVanilaBlock.wooden_slab_2;
		else if (block == Blocks.wooden_slab && metadata == 3) return IWeightVanilaBlock.wooden_slab_3;
		else if (block == Blocks.cocoa) return IWeightVanilaBlock.cocoa;
		else if (block == Blocks.sandstone_stairs) return IWeightVanilaBlock.sandstone_stairs;
		else if (block == Blocks.emerald_ore) return IWeightVanilaBlock.emerald_ore;
		else if (block == Blocks.ender_chest) return IWeightVanilaBlock.ender_chest;
		else if (block == Blocks.tripwire_hook) return IWeightVanilaBlock.tripwire_hook;
		else if (block == Blocks.tripwire) return IWeightVanilaBlock.tripwire;
		else if (block == Blocks.emerald_block) return IWeightVanilaBlock.emerald_block;
		else if (block == Blocks.spruce_stairs) return IWeightVanilaBlock.spruce_stairs;
		else if (block == Blocks.birch_stairs) return IWeightVanilaBlock.birch_stairs;
		else if (block == Blocks.jungle_stairs) return IWeightVanilaBlock.jungle_stairs;
		else if (block == Blocks.command_block) return IWeightVanilaBlock.command_block;
		else if (block == Blocks.beacon) return IWeightVanilaBlock.beacon;
		else if (block == Blocks.cobblestone_wall && metadata == 0) return IWeightVanilaBlock.cobblestone_wall_0;
		else if (block == Blocks.cobblestone_wall && metadata == 1) return IWeightVanilaBlock.cobblestone_wall_1;
		else if (block == Blocks.flower_pot) return IWeightVanilaBlock.flower_pot;
		else if (block == Blocks.carrots) return IWeightVanilaBlock.carrots;
		else if (block == Blocks.potatoes) return IWeightVanilaBlock.potatoes;
		else if (block == Blocks.wooden_button) return IWeightVanilaBlock.wooden_button;
		else if (block == Blocks.skull) return IWeightVanilaBlock.skull;
		else if (block == Blocks.anvil && metadata == 0) return IWeightVanilaBlock.anvil_0;
		else if (block == Blocks.anvil && metadata == 1) return IWeightVanilaBlock.anvil_1;
		else if (block == Blocks.anvil && metadata == 2) return IWeightVanilaBlock.anvil_2;
		else if (block == Blocks.trapped_chest) return IWeightVanilaBlock.trapped_chest;
		else if (block == Blocks.light_weighted_pressure_plate) return IWeightVanilaBlock.light_weighted_pressure_plate;
		else if (block == Blocks.heavy_weighted_pressure_plate) return IWeightVanilaBlock.heavy_weighted_pressure_plate;
		else if (block == Blocks.unpowered_comparator) return IWeightVanilaBlock.unpowered_comparator;
		else if (block == Blocks.powered_comparator) return IWeightVanilaBlock.powered_comparator;
		else if (block == Blocks.daylight_detector) return IWeightVanilaBlock.daylight_detector;
		else if (block == Blocks.redstone_block) return IWeightVanilaBlock.redstone_block;
		else if (block == Blocks.quartz_ore) return IWeightVanilaBlock.quartz_ore;
		else if (block == Blocks.hopper) return IWeightVanilaBlock.hopper;
		else if (block == Blocks.quartz_block && metadata == 0) return IWeightVanilaBlock.quartz_block_0;
		else if (block == Blocks.quartz_block && metadata == 1) return IWeightVanilaBlock.quartz_block_1;
		else if (block == Blocks.quartz_block && metadata == 2) return IWeightVanilaBlock.quartz_block_2;
		else if (block == Blocks.quartz_block && metadata == 3) return IWeightVanilaBlock.quartz_block_3;
		else if (block == Blocks.quartz_block && metadata == 4) return IWeightVanilaBlock.quartz_block_4;
		else if (block == Blocks.quartz_stairs) return IWeightVanilaBlock.quartz_stairs;
		else if (block == Blocks.activator_rail) return IWeightVanilaBlock.activator_rail;
		else if (block == Blocks.dropper) return IWeightVanilaBlock.dropper;
		else if (block == Blocks.stained_hardened_clay && metadata == 0) return IWeightVanilaBlock.stained_hardened_clay_0;
		else if (block == Blocks.stained_hardened_clay && metadata == 1) return IWeightVanilaBlock.stained_hardened_clay_1;
		else if (block == Blocks.stained_hardened_clay && metadata == 2) return IWeightVanilaBlock.stained_hardened_clay_2;
		else if (block == Blocks.stained_hardened_clay && metadata == 3) return IWeightVanilaBlock.stained_hardened_clay_3;
		else if (block == Blocks.stained_hardened_clay && metadata == 4) return IWeightVanilaBlock.stained_hardened_clay_4;
		else if (block == Blocks.stained_hardened_clay && metadata == 5) return IWeightVanilaBlock.stained_hardened_clay_5;
		else if (block == Blocks.stained_hardened_clay && metadata == 6) return IWeightVanilaBlock.stained_hardened_clay_6;
		else if (block == Blocks.stained_hardened_clay && metadata == 7) return IWeightVanilaBlock.stained_hardened_clay_7;
		else if (block == Blocks.stained_hardened_clay && metadata == 8) return IWeightVanilaBlock.stained_hardened_clay_8;
		else if (block == Blocks.stained_hardened_clay && metadata == 9) return IWeightVanilaBlock.stained_hardened_clay_9;
		else if (block == Blocks.stained_hardened_clay && metadata == 10) return IWeightVanilaBlock.stained_hardened_clay_10;
		else if (block == Blocks.stained_hardened_clay && metadata == 11) return IWeightVanilaBlock.stained_hardened_clay_11;
		else if (block == Blocks.stained_hardened_clay && metadata == 12) return IWeightVanilaBlock.stained_hardened_clay_12;
		else if (block == Blocks.stained_hardened_clay && metadata == 13) return IWeightVanilaBlock.stained_hardened_clay_13;
		else if (block == Blocks.stained_hardened_clay && metadata == 14) return IWeightVanilaBlock.stained_hardened_clay_14;
		else if (block == Blocks.stained_hardened_clay && metadata == 15) return IWeightVanilaBlock.stained_hardened_clay_15;
		else if (block == Blocks.hay_block) return IWeightVanilaBlock.hay_block;
		else if (block == Blocks.carpet && metadata == 0) return IWeightVanilaBlock.carpet_0;
		else if (block == Blocks.carpet && metadata == 1) return IWeightVanilaBlock.carpet_1;
		else if (block == Blocks.carpet && metadata == 2) return IWeightVanilaBlock.carpet_2;
		else if (block == Blocks.carpet && metadata == 3) return IWeightVanilaBlock.carpet_3;
		else if (block == Blocks.carpet && metadata == 4) return IWeightVanilaBlock.carpet_4;
		else if (block == Blocks.carpet && metadata == 5) return IWeightVanilaBlock.carpet_5;
		else if (block == Blocks.carpet && metadata == 6) return IWeightVanilaBlock.carpet_6;
		else if (block == Blocks.carpet && metadata == 7) return IWeightVanilaBlock.carpet_7;
		else if (block == Blocks.carpet && metadata == 8) return IWeightVanilaBlock.carpet_8;
		else if (block == Blocks.carpet && metadata == 9) return IWeightVanilaBlock.carpet_9;
		else if (block == Blocks.carpet && metadata == 10) return IWeightVanilaBlock.carpet_10;
		else if (block == Blocks.carpet && metadata == 11) return IWeightVanilaBlock.carpet_11;
		else if (block == Blocks.carpet && metadata == 12) return IWeightVanilaBlock.carpet_12;
		else if (block == Blocks.carpet && metadata == 13) return IWeightVanilaBlock.carpet_13;
		else if (block == Blocks.carpet && metadata == 14) return IWeightVanilaBlock.carpet_14;
		else if (block == Blocks.carpet && metadata == 15) return IWeightVanilaBlock.carpet_15;
		else if (block == Blocks.hardened_clay) return IWeightVanilaBlock.hardened_clay;
		else if (block == Blocks.coal_block) return IWeightVanilaBlock.coal_block;
		else if (block == Blocks.packed_ice) return IWeightVanilaBlock.packed_ice;
		else if (block == Blocks.acacia_stairs) return IWeightVanilaBlock.acacia_stairs;
		else if (block == Blocks.dark_oak_stairs) return IWeightVanilaBlock.dark_oak_stairs;
		else if (block == Blocks.double_plant && metadata == 0) return IWeightVanilaBlock.double_plant_0;
		else if (block == Blocks.double_plant && metadata == 1) return IWeightVanilaBlock.double_plant_1;
		else if (block == Blocks.double_plant && metadata == 2) return IWeightVanilaBlock.double_plant_2;
		else if (block == Blocks.double_plant && metadata == 3) return IWeightVanilaBlock.double_plant_3;
		else if (block == Blocks.double_plant && metadata == 4) return IWeightVanilaBlock.double_plant_4;
		else if (block == Blocks.double_plant && metadata == 5) return IWeightVanilaBlock.double_plant_5;
		else if (block == Blocks.stained_glass && metadata == 0) return IWeightVanilaBlock.stained_glass_0;
		else if (block == Blocks.stained_glass && metadata == 1) return IWeightVanilaBlock.stained_glass_1;
		else if (block == Blocks.stained_glass && metadata == 2) return IWeightVanilaBlock.stained_glass_2;
		else if (block == Blocks.stained_glass && metadata == 3) return IWeightVanilaBlock.stained_glass_3;
		else if (block == Blocks.stained_glass && metadata == 4) return IWeightVanilaBlock.stained_glass_4;
		else if (block == Blocks.stained_glass && metadata == 5) return IWeightVanilaBlock.stained_glass_5;
		else if (block == Blocks.stained_glass && metadata == 6) return IWeightVanilaBlock.stained_glass_6;
		else if (block == Blocks.stained_glass && metadata == 7) return IWeightVanilaBlock.stained_glass_7;
		else if (block == Blocks.stained_glass && metadata == 8) return IWeightVanilaBlock.stained_glass_8;
		else if (block == Blocks.stained_glass && metadata == 9) return IWeightVanilaBlock.stained_glass_9;
		else if (block == Blocks.stained_glass && metadata == 10) return IWeightVanilaBlock.stained_glass_10;
		else if (block == Blocks.stained_glass && metadata == 11) return IWeightVanilaBlock.stained_glass_11;
		else if (block == Blocks.stained_glass && metadata == 12) return IWeightVanilaBlock.stained_glass_12;
		else if (block == Blocks.stained_glass && metadata == 13) return IWeightVanilaBlock.stained_glass_13;
		else if (block == Blocks.stained_glass && metadata == 14) return IWeightVanilaBlock.stained_glass_14;
		else if (block == Blocks.stained_glass && metadata == 15) return IWeightVanilaBlock.stained_glass_15;
		else if (block == Blocks.stained_glass_pane && metadata == 0) return IWeightVanilaBlock.stained_glass_pane_0;
		else if (block == Blocks.stained_glass_pane && metadata == 1) return IWeightVanilaBlock.stained_glass_pane_1;
		else if (block == Blocks.stained_glass_pane && metadata == 2) return IWeightVanilaBlock.stained_glass_pane_2;
		else if (block == Blocks.stained_glass_pane && metadata == 3) return IWeightVanilaBlock.stained_glass_pane_3;
		else if (block == Blocks.stained_glass_pane && metadata == 4) return IWeightVanilaBlock.stained_glass_pane_4;
		else if (block == Blocks.stained_glass_pane && metadata == 5) return IWeightVanilaBlock.stained_glass_pane_5;
		else if (block == Blocks.stained_glass_pane && metadata == 6) return IWeightVanilaBlock.stained_glass_pane_6;
		else if (block == Blocks.stained_glass_pane && metadata == 7) return IWeightVanilaBlock.stained_glass_pane_7;
		else if (block == Blocks.stained_glass_pane && metadata == 8) return IWeightVanilaBlock.stained_glass_pane_8;
		else if (block == Blocks.stained_glass_pane && metadata == 9) return IWeightVanilaBlock.stained_glass_pane_9;
		else if (block == Blocks.stained_glass_pane && metadata == 10) return IWeightVanilaBlock.stained_glass_pane_10;
		else if (block == Blocks.stained_glass_pane && metadata == 11) return IWeightVanilaBlock.stained_glass_pane_11;
		else if (block == Blocks.stained_glass_pane && metadata == 12) return IWeightVanilaBlock.stained_glass_pane_12;
		else if (block == Blocks.stained_glass_pane && metadata == 13) return IWeightVanilaBlock.stained_glass_pane_13;
		else if (block == Blocks.stained_glass_pane && metadata == 14) return IWeightVanilaBlock.stained_glass_pane_14;
		else if (block == Blocks.stained_glass_pane && metadata == 15) return IWeightVanilaBlock.stained_glass_pane_15;
		else return 0.0F;
	}

}
