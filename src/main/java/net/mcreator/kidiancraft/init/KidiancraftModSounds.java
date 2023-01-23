
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kidiancraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.kidiancraft.KidiancraftMod;

public class KidiancraftModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, KidiancraftMod.MODID);
	public static final RegistryObject<SoundEvent> RESONANCE = REGISTRY.register("resonance",
			() -> new SoundEvent(new ResourceLocation("kidiancraft", "resonance")));
}
