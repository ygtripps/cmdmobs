package net.jc.minecraft.Commands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;

public class VillagerSpawn implements CommandExecutor {
	Villager v;
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) 
	{
		if(cmd.getName().equalsIgnoreCase("vspawn")) {
			Player p = (Player) sender;
			if(sender.hasPermission("sv.spawn")) {
			      if (args.length == 0) {
			    	  sender.sendMessage("/vspawn <name>");
			        } else {
			        	StringBuilder sb = new StringBuilder();
			        	for (int i = 0; i < args.length; i++){
			        	sb.append(args[i]).append(" ");
			        	}
			        	String allArgs = sb.toString().trim();
			        	/**if(vlist.contains(allArgs)) {  \\COMING SOON//
			        		sender.sendMessage("There is already a villager with the name: " + allArgs);
			        		Bukkit.broadcastMessage("test1");
			        	} else {**/
				        	Location bl = p.getLocation();
				        	World w = p.getWorld();
				        	v = w.spawn(bl, Villager.class);
							v.setCustomName(allArgs);
							//vlist.add(allArgs);
							//vlist2.add(v);
							sender.sendMessage("Villager Spawned with name: "+ v.getCustomName());
			        }
			} else {
				sender.sendMessage(ChatColor.DARK_RED +"You do not have permission to do this!");
			}
		}
		return false;
	}
}
