package com.zer0_scope.pixelgore.death;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

public class Death implements Listener
{
	@EventHandler
	public void onDeath(EntityDeathEvent event)
	{
		LivingEntity entity = event.getEntity();
		World world = entity.getWorld();
		Location location = entity.getLocation();
		
		ItemStack blood = new ItemStack(Material.REDSTONE, 6);
		ItemStack bone = new ItemStack(Material.BONE, 5);
		
		world.dropItemNaturally(location, blood);
		world.dropItemNaturally(location, bone);
		
		}
}
