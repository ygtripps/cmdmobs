package net.jc.minecraft.Commands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Bat;
import org.bukkit.entity.Player;

public class BatSpawn implements CommandExecutor {
	
	Bat b;
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) 
	{
		if(cmd.getName().equalsIgnoreCase("bspawn")) {
			Player p = (Player) sender;
			if(sender.hasPermission("cm.bspawn")) {
			      if (args.length == 0) {
			    	  sender.sendMessage("/bspawn <name>");
			        } else {
			        	StringBuilder sb = new StringBuilder();
			        	for (int i = 0; i < args.length; i++){
			        	sb.append(args[i]).append(" ");
			        	}
			        	String allArgs = sb.toString().trim();
				        Location bl = p.getLocation();
				        World w = p.getWorld();
				        b = w.spawn(bl, Bat.class);
					b.setCustomName(allArgs);
					sender.sendMessage("Bat Spawned with name: "+ b.getCustomName());
			        }
			} else {
				sender.sendMessage(ChatColor.DARK_RED +"You do not have permission to do this!");
			}
		}
		return false;
	}
}
