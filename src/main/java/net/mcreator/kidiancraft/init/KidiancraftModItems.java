
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kidiancraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.kidiancraft.item.ResonanceItem;
import net.mcreator.kidiancraft.KidiancraftMod;

public class KidiancraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, KidiancraftMod.MODID);
	public static final RegistryObject<Item> RESONANCE = REGISTRY.register("resonance", () -> new ResonanceItem());
}
