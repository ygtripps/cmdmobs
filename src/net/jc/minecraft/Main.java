package net.jc.minecraft;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	Logger log = this.getLogger();
	public void onEnable() {
		log.info("Plugin Rev 1 by team Exidius launched...");
		getCommand("cm").setExecutor(new Commands_Class());
	}
}
