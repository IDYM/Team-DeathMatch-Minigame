package me.kenny;

import java.util.Random;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import me.kenny.basic_game_structure.initializer_classes.SpawnPoints;
import me.kenny.basic_game_structure.initializer_classes.TeamSet;

public class Respawn {

	Random rand = new Random();
	
	SpawnPoints spawnPoints;
	
	public Respawn(SpawnPoints a){
		
		spawnPoints = a;
		
	}
	
	
	public void respawnDeadPlayerRed(String killed){
		
		Player playerToTeleport = TeamSet.getRedPlayer(killed);
		
		playerToTeleport.teleport(spawnPoints.getRedSpawnPoints().get(rand.nextInt(spawnPoints.getRedSpawnPoints().size()-1)));
		
		
	}
	
	public void respawnDeadPlayerBlue(String killed){
		
		Player playerToTeleport = TeamSet.getBluePlayer(killed);
		
		playerToTeleport.teleport(spawnPoints.getBlueSpawnPoints().get(rand.nextInt(spawnPoints.getBlueSpawnPoints().size()-1)));

	}
	
}
