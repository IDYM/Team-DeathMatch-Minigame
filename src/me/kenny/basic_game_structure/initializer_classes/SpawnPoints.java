package me.kenny.basic_game_structure.initializer_classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import me.kenny.events.SpawnPermissionHandle;

import org.bukkit.Location;

public class SpawnPoints {

	boolean spawnPointsSet;
	
	 ArrayList <Location> gameSpawnPointRed;
	 ArrayList <Location> gameSpawnPointBlue;

	public SpawnPoints() {
		spawnPointsSet = SpawnPermissionHandle.bothSpawnPointsSet();
	}
	
	public void setSpawnLocations(){
		
		if (spawnPointsSet==true){
			
			gameSpawnPointRed.add(SpawnPermissionHandle.getRedSpawnLocation());
			
			gameSpawnPointBlue.add(SpawnPermissionHandle.getBlueSpawnLocation());
			
		}   
		
	}
	
	
	public ArrayList<Location> getRedSpawnPoints(){
		
		return gameSpawnPointRed;
	}
	
	public ArrayList<Location> getBlueSpawnPoints(){
		
		return gameSpawnPointBlue;
		
	}
	
}
