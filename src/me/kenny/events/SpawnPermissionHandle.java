package me.kenny.events;

import org.bukkit.Location;

public class SpawnPermissionHandle {

	static boolean redIsSet;
	
	static boolean blueIsSet;
	
	static Location redSpawnLocation;
	
	static Location blueSpawnLocation;
	
	
	public static void setRedSpawnIsSet(boolean redSpawnSet){
		
		redIsSet = redSpawnSet;
	}

	public static void setBlueSpawnIsSet(boolean blueSpawnSet){
	
	blueIsSet = blueSpawnSet;
	}

	public static void setRedSpawnLocation(Location redSpawnLocation1){
		
		redSpawnLocation = redSpawnLocation1;
		
	}
	
	public static void setBlueSpawnLocation(Location blueSpawnLocation1){
		
		blueSpawnLocation = blueSpawnLocation1;

	}
	
	public boolean spawnLocationsAreSet(){
		
		if(redIsSet == true && blueIsSet == true ){
			
			return true;
			
		}
		
		return false;
	}
	
	public static Location getRedSpawnLocation(){
		
		return redSpawnLocation;
		
	}
	
	public static Location getBlueSpawnLocation(){
		
		return blueSpawnLocation;
		
	}
	
	public static boolean bothSpawnPointsSet(){
		
		if(redIsSet==true && blueIsSet==true){
			
			return true;
		}
		
		return false;
	}
	
}
