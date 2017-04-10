package com.zer0_scope.pixelgore;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.zer0_scope.pixelgore.death.Death;

public class PixelGore extends JavaPlugin
{
	public void onEnable()
	{
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = getLogger();
		
		registerEvents();

		logger.info(pdfFile.getName() + " has been enabled (v." + pdfFile.getVersion() + ")");
	}

	public void onDisabled()
	{
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = getLogger();

		logger.info(pdfFile.getName() + "has been disabled (v." + pdfFile.getVersion() + ")");
	}
	
	public void registerEvents()
	{
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new Death(), this);
	}
	
}
