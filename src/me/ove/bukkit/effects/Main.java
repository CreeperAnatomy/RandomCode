package me.ove.bukkit.effects;

import java.util.logging.Logger;
import me.ove.bukkit.effects.Listeners.Effects;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;




//
// cbmcEffects By Ove98
// Copyright (c) OveHenrik 2013
//

public class Main extends JavaPlugin {
	public static final Logger log = Logger.getLogger("Minecraft", null);

	
	public void onEnable() {
		log.info("[cbmcEffects] Enabled!");
		Bukkit.getPluginManager().registerEvents(new Effects(), this);
	}
	public void onDisable() {
		log.info("[cbmcEffects] Disabled!");
	}
	

	
	
	
}
