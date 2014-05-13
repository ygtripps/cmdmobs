package net.jc.minecraft;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class Main_Test {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        Player player = (Player) sender;
        if(cmd.getName().equalsIgnoreCase("cm")){
            if(args.length < 2){
                player.sendMessage(ChatColor.RED + "Exceeded maximum arguments");
                player.sendMessage(ChatColor.BLUE + "Use; /cm help");
            }else if(args.length > 2){
                player.sendMessage(ChatColor.RED + "Too few arguments");
                player.sendMessage(ChatColor.BLUE + "Use; /cm help");
            }else{
                Player TargetPlayer = player.getServer().getPlayer(args[1]);
                World world = TargetPlayer.getWorld();
                Location TargetLocation = TargetPlayer.getLocation();
                if(args[0].equalsIgnoreCase("Wolf")){
                    world.spawnEntity(TargetLocation, EntityType.WOLF);
                }else if(args[0].equalsIgnoreCase("Pig")){
                    world.spawnEntity(TargetLocation, EntityType.PIG);
                }else if(args[0].equalsIgnoreCase("help")){
                	player.sendMessage(ChatColor.GRAY + "---[ " + ChatColor.YELLOW + "CMD MOBS" + ChatColor.GRAY + " ]---");
                	player.sendMessage(ChatColor.GREEN + "/cm <mob> <Target Player> [name]");
                	player.sendMessage(ChatColor.AQUA + "Spawns <mob> at <player>'s location anmed [name]");
                }else if(args[0].equalsIgnoreCase("authors")){
                	player.sendMessage(ChatColor.GRAY + "---[ " + ChatColor.YELLOW + "Authors" + ChatColor.GRAY + " ]---");
                	player.sendMessage(ChatColor.AQUA + "Polarcraft");
                	player.sendMessage(ChatColor.GREEN + "mesome32");
                }else if(args[0].equalsIgnoreCase("PigZombie")){
                    world.spawnEntity(TargetLocation, EntityType.PIG_ZOMBIE);
                }else if(args[0].equalsIgnoreCase("Cow")){
                    world.spawnEntity(TargetLocation, EntityType.COW);
                }else if(args[0].equalsIgnoreCase("Blaze")){
                    world.spawnEntity(TargetLocation, EntityType.BLAZE);
                }else if(args[0].equalsIgnoreCase("CaveSpider")){
                    world.spawnEntity(TargetLocation, EntityType.CAVE_SPIDER);
                }else if(args[0].equalsIgnoreCase("Chicken")){
                    world.spawnEntity(TargetLocation, EntityType.CHICKEN);
                }else if(args[0].equalsIgnoreCase("Creeper")){
                    world.spawnEntity(TargetLocation, EntityType.CREEPER);
                }else if(args[0].equalsIgnoreCase("EnderDragon")){
                    world.spawnEntity(TargetLocation, EntityType.ENDER_DRAGON);
                }else if(args[0].equalsIgnoreCase("Enderman")){
                    world.spawnEntity(TargetLocation, EntityType.ENDERMAN);
                }else if(args[0].equalsIgnoreCase("Ghast")){
                    world.spawnEntity(TargetLocation, EntityType.GHAST);
                }else if(args[0].equalsIgnoreCase("Giant")){
                    world.spawnEntity(TargetLocation, EntityType.GIANT);
                }else if(args[0].equalsIgnoreCase("IronGolem")){
                    world.spawnEntity(TargetLocation, EntityType.IRON_GOLEM);
                }else if(args[0].equalsIgnoreCase("MagmaCube")){
                    world.spawnEntity(TargetLocation, EntityType.MAGMA_CUBE);
                }else if(args[0].equalsIgnoreCase("Ocelot")){
                    world.spawnEntity(TargetLocation, EntityType.OCELOT);
                }else if(args[0].equalsIgnoreCase("Sheep")){
                    world.spawnEntity(TargetLocation, EntityType.SHEEP);
                }else if(args[0].equalsIgnoreCase("SilverFish")){
                    world.spawnEntity(TargetLocation, EntityType.SILVERFISH);
                }else if(args[0].equalsIgnoreCase("Skeleton")){
                    world.spawnEntity(TargetLocation, EntityType.SKELETON);
                }else if(args[0].equalsIgnoreCase("Slime")){
                    world.spawnEntity(TargetLocation, EntityType.SLIME);
                }else if(args[0].equalsIgnoreCase("Spider")){
                    world.spawnEntity(TargetLocation, EntityType.SPIDER);
                }else if(args[0].equalsIgnoreCase("Squid")){
                    world.spawnEntity(TargetLocation, EntityType.SQUID);
                }else if(args[0].equalsIgnoreCase("Villager")){
                    world.spawnEntity(TargetLocation, EntityType.VILLAGER);
                }else if(args[0].equalsIgnoreCase("Zombie")){
                    world.spawnEntity(TargetLocation, EntityType.ZOMBIE);
                }
        }
    }
        return false;
}

}
