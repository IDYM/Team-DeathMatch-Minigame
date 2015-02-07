package me.kenny.commands;

import me.kenny.basic_game_structure.initializer_classes.Timer;
import me.kenny.events.SpawnPermissionHandle;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.permissions.Permission;

public class Commands {

	public Permission canSetSpawn = new Permission("setSpawnPoint.allowed");

	public Permission canSetTime = new Permission("setTime.allowed");
	
	public boolean onSetSpawnPoints(CommandSender sender, Command cmd, String label, String[] args){
		
		
		if( cmd.getName().equalsIgnoreCase("setSpawnPointRed") && sender.hasPermission("setSpawnPoint.allowed")){
			
			Player host = (Player) sender;
			
			Location spawnPointRed = host.getLocation();
			
			SpawnPermissionHandle.setRedSpawnIsSet(true);
			
			SpawnPermissionHandle.setRedSpawnLocation(spawnPointRed);
			
			return true;
			
		}
		
		return false;
		
	}
	
	public boolean onSetSpawnPointBlue(CommandSender sender, Command cmd, String label, String[] args){
		
		
		if( cmd.getName().equalsIgnoreCase("setSpawnPointBlue") && sender.hasPermission("setSpawnPoint.allowed")){
			
			Player host = (Player) sender;
			
			Location spawnPointBlue = host.getLocation();
			
			SpawnPermissionHandle.setBlueSpawnIsSet(true);
			
			SpawnPermissionHandle.setBlueSpawnLocation(spawnPointBlue);

			return true;
			
		}
		
		
		
		return false;
		
	}
	
	public boolean onSetTime(CommandSender sender, Command cmd, String label, String[] args){
		
		
		
		if(cmd.getName().equalsIgnoreCase("settime") && sender.hasPermission("setTime.allowed")==true){
			
			int length = args.length;
			
			if (length == 0 ){
				
				try{
					
					int time = Integer.parseInt(args[0]);
							
					Timer.setTime(time);
					
				}catch(IllegalArgumentException e){
					
					
				}
				
				
			}
			
		}
		
		return false;
		
	}
	
}
