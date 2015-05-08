package me.creeperanatomy.demoniccrates;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import me.creeperanatomy.demoniccrates.commands.GiveCrates;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class DemonicCrates extends JavaPlugin {

	public static HashMap<String, Integer> crates = new HashMap<String, Integer>();

	public int crateamount = 0;
	
	public FileConfiguration cratesconfig;
	File cratefile;
	public FileConfiguration itemsconfig;
	File itemsfile;

	public void onEnable() {
		
		commands();
		
		cratefile = new File(getDataFolder(), "Crates.yml");

		if (!cratefile.exists()) {
			try {
				cratefile.createNewFile();
				getLogger().info("Crates File has Loaded!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		cratesconfig = YamlConfiguration.loadConfiguration(cratefile);

		cratesconfig.createSection("Crates");

		try {
			cratesconfig.save(cratefile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		itemsfile = new File(getDataFolder(), "Items.yml");
		
		if(!itemsfile.exists()) {
			try {
				itemsfile.createNewFile();
				getLogger().info("Items file has loaded!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		itemsconfig = YamlConfiguration.loadConfiguration(itemsfile);
		
		try {
			itemsconfig.save(itemsfile);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public void commands() {
		getCommand("Crates").setExecutor(new GiveCrates(this));
	}

}
