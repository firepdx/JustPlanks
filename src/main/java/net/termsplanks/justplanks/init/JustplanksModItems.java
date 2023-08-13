
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.termsplanks.justplanks.init;

import net.termsplanks.justplanks.item.RedstoneArmorItem;
import net.termsplanks.justplanks.JustplanksMod;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class JustplanksModItems {
	public static Item REDSTONE_ARMOR_HELMET;
	public static Item REDSTONE_ARMOR_CHESTPLATE;
	public static Item REDSTONE_ARMOR_LEGGINGS;
	public static Item REDSTONE_ARMOR_BOOTS;

	public static void load() {
		REDSTONE_ARMOR_HELMET = Registry.register(Registry.ITEM, new ResourceLocation(JustplanksMod.MODID, "redstone_armor_helmet"),
				new RedstoneArmorItem.Helmet());
		REDSTONE_ARMOR_CHESTPLATE = Registry.register(Registry.ITEM, new ResourceLocation(JustplanksMod.MODID, "redstone_armor_chestplate"),
				new RedstoneArmorItem.Chestplate());
		REDSTONE_ARMOR_LEGGINGS = Registry.register(Registry.ITEM, new ResourceLocation(JustplanksMod.MODID, "redstone_armor_leggings"),
				new RedstoneArmorItem.Leggings());
		REDSTONE_ARMOR_BOOTS = Registry.register(Registry.ITEM, new ResourceLocation(JustplanksMod.MODID, "redstone_armor_boots"),
				new RedstoneArmorItem.Boots());
	}
}
