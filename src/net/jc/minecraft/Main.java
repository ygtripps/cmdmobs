package net.jc.minecraft;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	Logger log = this.getLogger();
	public void onEnable() {
		log.info("[CMD Mobs] Plugin Rev 1 by team Exidius launched...");
	}
}
