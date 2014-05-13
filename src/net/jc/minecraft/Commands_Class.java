package net.jc.minecraft;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.Ghast;
import org.bukkit.entity.Giant;
import org.bukkit.entity.IronGolem;
import org.bukkit.entity.MagmaCube;
import org.bukkit.entity.Ocelot;
import org.bukkit.entity.Pig;
import org.bukkit.entity.PigZombie;
import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;
import org.bukkit.entity.Silverfish;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Slime;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Squid;
import org.bukkit.entity.Villager;
import org.bukkit.entity.Wolf;
import org.bukkit.entity.Zombie;

public class Commands_Class implements CommandExecutor{
	Wolf wolf;
	Pig pig;
	PigZombie pigZombie;
	Cow cow;
	Blaze blaze;
	CaveSpider caveSpider;
	Chicken chicken; 
	Zombie zombie; 
	Villager villager; 
	Squid squid; 
	Spider spider; 
	Slime slime; 
	Skeleton skeleton; 
	Sheep sheep; 
	Silverfish silverfish; 
	Ocelot ocelot; 
	MagmaCube magmaCube; 
	IronGolem ironGolem; 
	Giant giant; 
	Ghast ghast; 
	Enderman enderman; 
	EnderDragon enderDragon; 
	Creeper creeper;

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        Player player = (Player) sender;
        if(cmd.getName().equalsIgnoreCase("cm")){
        	if(args.length == 2){
        	Player p = (Player) sender;
            if(args.length > 2){
                player.sendMessage(ChatColor.RED + "Exceeded maximum arguments");
                player.sendMessage(ChatColor.BLUE + "Use; /cm help");
            }
            if(args.length < 1){
                player.sendMessage(ChatColor.RED + "Too few arguments");
                player.sendMessage(ChatColor.BLUE + "Use; /cm help");
            }else{
                World w = p.getWorld();
                Location bl = p.getLocation();
                if(args[0].equalsIgnoreCase("Wolf")){
                    wolf = w.spawn(bl, Wolf.class);
                	wolf.setCustomName(args[1]);
                	sender.sendMessage("You have spawned a wolf with the customname: " + args[1]);
                }else if(args[0].equalsIgnoreCase("Pig")){
                	pig = w.spawn(bl, Pig.class);
                	pig.setCustomName(args[1]);
                	sender.sendMessage("You have spawned a pig with the customname: " + args[1]);
                }else if(args[0].equalsIgnoreCase("PigZombie")){
                    pigZombie = w.spawn(bl, PigZombie.class);
                	pigZombie.setCustomName(args[1]);
                	sender.sendMessage("You have spawned a pigzombie with the customname: " + args[1]);
                }else if(args[0].equalsIgnoreCase("Cow")){
                	cow = w.spawn(bl, Cow.class);
                	cow = w.spawn(bl, Cow.class);
                    cow.setCustomName(args[1]);
                    sender.sendMessage("You have spawned a cow with the customname: " + args[1]);
                }else if(args[0].equalsIgnoreCase("Blaze")){
                	blaze = w.spawn(bl, Blaze.class);
                	blaze.setCustomName(args[1]);
                	sender.sendMessage("You have spawned a blaze with the customname: " + args[1]);
                }else if(args[0].equalsIgnoreCase("CaveSpider")){
                	caveSpider = w.spawn(bl, CaveSpider.class);
                	caveSpider.setCustomName(args[1]);
                	sender.sendMessage("You have spawned a cavespider with the customname: " + args[1]);
                }else if(args[0].equalsIgnoreCase("Chicken")){
                	wolf = w.spawn(bl, Wolf.class);
                	wolf.setCustomName(args[1]);
                	sender.sendMessage("You have spawned a chicken with the customname: " + args[1]);
                }else if(args[0].equalsIgnoreCase("Creeper")){
                	creeper = w.spawn(bl, Creeper.class);
                	creeper.setCustomName(args[1]);
                	sender.sendMessage("You have spawned a creeper with the customname: " + args[1]);
                }else if(args[0].equalsIgnoreCase("EnderDragon")){
                	enderDragon = w.spawn(bl, EnderDragon.class);
                	enderDragon.setCustomName(args[1]);
                	sender.sendMessage("You have spawned a enderdragon with the customname: " + args[1]);
                }else if(args[0].equalsIgnoreCase("Enderman")){
                	enderman = w.spawn(bl, Enderman.class);
                	enderman.setCustomName(args[1]);
                	sender.sendMessage("You have spawned a enderman with the customname: " + args[1]);
                }else if(args[0].equalsIgnoreCase("Ghast")){
                	ghast = w.spawn(bl, Ghast.class);
                	ghast.setCustomName(args[1]);
                	sender.sendMessage("You have spawned a ghast with the customname: " + args[1]);
                }else if(args[0].equalsIgnoreCase("Giant")){
                	giant = w.spawn(bl, Giant.class);
                	giant.setCustomName(args[1]);
                	sender.sendMessage("You have spawned a giant with the customname: " + args[1]);
                }else if(args[0].equalsIgnoreCase("IronGolem")){
                	ironGolem = w.spawn(bl, IronGolem.class);
                	ironGolem.setCustomName(args[1]);
                	sender.sendMessage("You have spawned a irongolem with the customname: " + args[1]);
                }else if(args[0].equalsIgnoreCase("MagmaCube")){
                	magmaCube = w.spawn(bl, MagmaCube.class);
                	magmaCube.setCustomName(args[1]);
                	sender.sendMessage("You have spawned a magmacube with the customname: " + args[1]);
                }else if(args[0].equalsIgnoreCase("Ocelot")){
                	ocelot = w.spawn(bl, Ocelot.class);
                	ocelot.setCustomName(args[1]);
                	sender.sendMessage("You have spawned a ocelot with the customname: " + args[1]);
                }else if(args[0].equalsIgnoreCase("Sheep")){
                	sheep = w.spawn(bl, Sheep.class);
                	sheep.setCustomName(args[1]);
                	sender.sendMessage("You have spawned a sheep with the customname: " + args[1]);
                }else if(args[0].equalsIgnoreCase("SilverFish")){
                	silverfish = w.spawn(bl, Silverfish.class);
                	silverfish.setCustomName(args[1]);
                	sender.sendMessage("You have spawned a silverfish with the customname: " + args[1]);
                }else if(args[0].equalsIgnoreCase("Skeleton")){
                	skeleton = w.spawn(bl, Skeleton.class);
                	skeleton.setCustomName(args[1]);
                	sender.sendMessage("You have spawned a skeleton with the customname: " + args[1]);
                }else if(args[0].equalsIgnoreCase("Slime")){
                	slime = w.spawn(bl, Slime.class);
                	slime.setCustomName(args[1]);
                	sender.sendMessage("You have spawned a slime with the customname: " + args[1]);
                }else if(args[0].equalsIgnoreCase("Spider")){
                	spider = w.spawn(bl, Spider.class);
                	spider.setCustomName(args[1]);
                	sender.sendMessage("You have spawned a spider with the customname: " + args[1]);
                }else if(args[0].equalsIgnoreCase("Squid")){
                	squid = w.spawn(bl, Squid.class);
                	squid.setCustomName(args[1]);
                	sender.sendMessage("You have spawned a squid with the customname: " + args[1]);
                }else if(args[0].equalsIgnoreCase("Villager")){
                	villager = w.spawn(bl, Villager.class);
                	villager.setCustomName(args[1]);
                	sender.sendMessage("You have spawned a villager with the customname: " + args[1]);
                }else if(args[0].equalsIgnoreCase("Zombie")){
                    zombie = w.spawn(bl, Zombie.class);
                    zombie.setCustomName(args[1]);
                    sender.sendMessage("You have spawned a zombie with the customname: " + args[1]);
                } else if(args[0].equalsIgnoreCase("mobs")){
                	sender.sendMessage(ChatColor.GRAY + "Mobs you can spawn:");
                	if(sender.hasPermission("cm.spawn.wolf")){
                		sender.sendMessage(ChatColor.GREEN + "Wolf");
                	}
                	if (sender.hasPermission("cm.spawn.pig") || sender.isOp()){
                		sender.sendMessage(ChatColor.GREEN + "Pig");
                	};
                	if (sender.hasPermission("cm.spawn.pigzombie")){
                		sender.sendMessage(ChatColor.GREEN + "PigZombie");
                	};
                	if (sender.hasPermission("cm.spawn.cow")){
                		sender.sendMessage(ChatColor.GREEN + "Cow");
                	};
                	if (sender.hasPermission("cm.spawn.blaze")){
                		sender.sendMessage(ChatColor.GREEN + "Blaze");
                	};
                	if (sender.hasPermission("cm.spawn.cavespider")){
                		sender.sendMessage(ChatColor.GREEN + "CaveSpider");
                	};
                	if (sender.hasPermission("cm.spawn.chicken")){
                		sender.sendMessage(ChatColor.GREEN + "Chicken");
                	};
                	if (sender.hasPermission("cm.spawn.zombie")){
                		sender.sendMessage(ChatColor.GREEN + "Zombie");
                	};
                	if (sender.hasPermission("cm.spawn.villager")){
                		sender.sendMessage(ChatColor.GREEN + "Villager");
                	};
                	if (sender.hasPermission("cm.spawn.squid")){
                		sender.sendMessage(ChatColor.GREEN + "Squid");
                	};
                	if (sender.hasPermission("cm.spawn.spider")){
                		sender.sendMessage(ChatColor.GREEN + "Spider");
                	};
                	if (sender.hasPermission("cm.spawn.slime")){
                		sender.sendMessage(ChatColor.GREEN + "Slime");
                	};
                	if (sender.hasPermission("cm.spawn.skeleton")){
                		sender.sendMessage(ChatColor.GREEN + "Skeleton");
                	};
                	if (sender.hasPermission("cm.spawn.sheep")){
                		sender.sendMessage(ChatColor.GREEN + "Sheep");
                	};
                	if (sender.hasPermission("cm.spawn.silverfish")){
                		sender.sendMessage(ChatColor.GREEN + "Silverfish");
                	};
                	if (sender.hasPermission("cm.spawn.Ocelot")){
                		sender.sendMessage(ChatColor.GREEN + "Ocelot");
                	};
                	if (sender.hasPermission("cm.spawn.magmacube")){
                		sender.sendMessage(ChatColor.GREEN + "MagmaCube");
                	};
                	if (sender.hasPermission("cm.spawn.irongolem")){
                		sender.sendMessage(ChatColor.GREEN + "IronGolem");
                	};
                	if (sender.hasPermission("cm.spawn.giant")){
                		sender.sendMessage(ChatColor.GREEN + "Giant");
                	};
                	if (sender.hasPermission("cm.spawn.ghast")){
                		sender.sendMessage(ChatColor.GREEN + "Ghast");
                	};
                	if (sender.hasPermission("cm.spawn.enderman")){
                		sender.sendMessage(ChatColor.GREEN + "Enderman");
                	};
                	if (sender.hasPermission("cm.spawn.enderdragon")){
                		sender.sendMessage(ChatColor.GREEN + "Enderdragon");
                	};
                	if (sender.hasPermission("cm.spawn.creeper")){
                		sender.sendMessage(ChatColor.GREEN + "Creeper");
                	};
                }else {
                	sender.sendMessage(ChatColor.RED + "That is not a valid mob!");
                	sender.sendMessage(ChatColor.GREEN + "Type /cm mobs to see mobs you can spawn!");
                }
            }
        }
        }else if(args[0] == "help"){
        	sender.sendMessage(ChatColor.GRAY + "---[ " + ChatColor.YELLOW + "CMD MOBS" + ChatColor.GRAY + " ]---");
        	sender.sendMessage(ChatColor.GREEN + "/cm <mob> <Target Player> [name]");
        	sender.sendMessage(ChatColor.AQUA + "Spawns <mob> at <player>'s location anmed [name]");
        }else if(args[0] == "authors"){
        	sender.sendMessage(ChatColor.GRAY + "---[ " + ChatColor.YELLOW + "Authors" + ChatColor.GRAY + " ]---");
        	sender.sendMessage(ChatColor.AQUA + "Polarcraft");
        	sender.sendMessage(ChatColor.GREEN + "mesome32");
        }else
		return false;
		return false;	}
}
