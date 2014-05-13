package net.jc.minecraft;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class Main_Test{
	Entity wolf;
	Entity pig;
	Entity pigZombie;
	Entity cow;
	Entity blaze;
	Entity caveSpider;
	Entity Chicken;
	Entity chicken; 
	Entity zombie; 
	Entity villager; 
	Entity squid; 
	Entity spider; 
	Entity slime; 
	Entity skeleton; 
	Entity sheep; 
	Entity silverfish; 
	Entity ocelot; 
	Entity magmaCube; 
	Entity ironGolem; 
	Entity giant; 
	Entity ghast; 
	Entity enderman; 
	Entity enderDragon; 
	Entity creeper;
	String ename;
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        Player player = (Player) sender;
        if(cmd.getName().equalsIgnoreCase("cm")){
        	Player p = (Player) sender;
            if(args.length < 3){
                player.sendMessage(ChatColor.RED + "Exceeded maximum arguments");
                player.sendMessage(ChatColor.BLUE + "Use; /cm help");
            }else if(args.length > 3){
                player.sendMessage(ChatColor.RED + "Too few arguments");
                player.sendMessage(ChatColor.BLUE + "Use; /cm help");
            }else{
                Player TargetPlayer = player.getServer().getPlayer(args[1]);
                World w = p.getWorld();
                Location TargetLocation = TargetPlayer.getLocation();
                ename = args[2];
                if(args[0].equalsIgnoreCase("Wolf")){
                    wolf = w.spawnEntity(TargetLocation, EntityType.WOLF);
                }else if(args[0].equalsIgnoreCase("Pig")){
                   pig = w.spawnEntity(TargetLocation, EntityType.PIG);
                }else if(args[0].equalsIgnoreCase("help")){
                	player.sendMessage(ChatColor.GRAY + "---[ " + ChatColor.YELLOW + "CMD MOBS" + ChatColor.GRAY + " ]---");
                	player.sendMessage(ChatColor.GREEN + "/cm <mob> <Target Player> [name]");
                	player.sendMessage(ChatColor.AQUA + "Spawns <mob> at <player>'s location anmed [name]");
<<<<<<< HEAD
                }else if(args[0].equalsIgnoreCase("authors")){
                	player.sendMessage(ChatColor.GRAY + "---[ " + ChatColor.YELLOW + "Authors" + ChatColor.GRAY + " ]---");
                	player.sendMessage(ChatColor.AQUA + "Polarcraft");
                	player.sendMessage(ChatColor.GREEN + "mesome32");
                }else if(args[0].equalsIgnoreCase("PigZombie")){
                    world.spawnEntity(TargetLocation, EntityType.PIG_ZOMBIE);
=======
                }
                else if(args[0].equalsIgnoreCase("PigZombie")){
                    pigZombie = w.spawnEntity(TargetLocation, EntityType.PIG_ZOMBIE);
>>>>>>> Fixed shit
                }else if(args[0].equalsIgnoreCase("Cow")){
                    cow = w.spawnEntity(TargetLocation, EntityType.COW);
                }else if(args[0].equalsIgnoreCase("Blaze")){
                    blaze = w.spawnEntity(TargetLocation, EntityType.BLAZE);
                }else if(args[0].equalsIgnoreCase("CaveSpider")){
                    caveSpider = w.spawnEntity(TargetLocation, EntityType.CAVE_SPIDER);
                }else if(args[0].equalsIgnoreCase("Chicken")){
                    chicken = w.spawnEntity(TargetLocation, EntityType.CHICKEN);
                }else if(args[0].equalsIgnoreCase("Creeper")){
                   creeper = w.spawnEntity(TargetLocation, EntityType.CREEPER);
                }else if(args[0].equalsIgnoreCase("EnderDragon")){
                   enderDragon = w.spawnEntity(TargetLocation, EntityType.ENDER_DRAGON);
                }else if(args[0].equalsIgnoreCase("Enderman")){
                    enderman = w.spawnEntity(TargetLocation, EntityType.ENDERMAN);
                }else if(args[0].equalsIgnoreCase("Ghast")){
                    ghast = w.spawnEntity(TargetLocation, EntityType.GHAST);
                }else if(args[0].equalsIgnoreCase("Giant")){
                    giant = w.spawnEntity(TargetLocation, EntityType.GIANT);
                }else if(args[0].equalsIgnoreCase("IronGolem")){
                    ironGolem = w.spawnEntity(TargetLocation, EntityType.IRON_GOLEM);
                }else if(args[0].equalsIgnoreCase("MagmaCube")){
                    magmaCube = w.spawnEntity(TargetLocation, EntityType.MAGMA_CUBE);
                }else if(args[0].equalsIgnoreCase("Ocelot")){
                    ocelot = w.spawnEntity(TargetLocation, EntityType.OCELOT);
                }else if(args[0].equalsIgnoreCase("Sheep")){
                    sheep = w.spawnEntity(TargetLocation, EntityType.SHEEP);
                }else if(args[0].equalsIgnoreCase("SilverFish")){
                    silverfish = w.spawnEntity(TargetLocation, EntityType.SILVERFISH);
                }else if(args[0].equalsIgnoreCase("Skeleton")){
                    skeleton = w.spawnEntity(TargetLocation, EntityType.SKELETON);
                }else if(args[0].equalsIgnoreCase("Slime")){
                    slime = w.spawnEntity(TargetLocation, EntityType.SLIME);
                }else if(args[0].equalsIgnoreCase("Spider")){
                    spider = w.spawnEntity(TargetLocation, EntityType.SPIDER);
                }else if(args[0].equalsIgnoreCase("Squid")){
                    squid = w.spawnEntity(TargetLocation, EntityType.SQUID);
                }else if(args[0].equalsIgnoreCase("Villager")){
                    villager = w.spawnEntity(TargetLocation, EntityType.VILLAGER);
                }else if(args[0].equalsIgnoreCase("Zombie")){
                    zombie = w.spawnEntity(TargetLocation, EntityType.ZOMBIE);
                }
        }
    }
        return false;
}

}
