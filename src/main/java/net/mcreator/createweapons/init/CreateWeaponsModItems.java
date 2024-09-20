
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createweapons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.createweapons.CreateWeaponsMod;

public class CreateWeaponsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CreateWeaponsMod.MODID);
	public static final RegistryObject<Item> MECHANICALHAND = REGISTRY.register("mechanicalhand", () -> new MechanicalhandItem());
	// Start of user code block custom items
	// End of user code block custom items
}
