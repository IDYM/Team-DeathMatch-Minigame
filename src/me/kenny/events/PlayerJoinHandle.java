package me.kenny.events;

import java.util.HashMap;
import java.util.Random;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinHandle {

	static HashMap<String,Player> teamRed = new HashMap<>();
	
	static HashMap<String,Player> teamBlue = new HashMap<>();

	static boolean blueIsFull = false;
	
	static boolean redIsFull = false;
	
	public void onPlayerJoin(PlayerJoinEvent e){
		
		Random random = new Random();
		
		
		if(teamRed.size() != 10 ){
			
			addToTeamRed(e.getPlayer().getName(), e.getPlayer());
			
		} else if(teamBlue.size() != 10){
			
			addToTeamBlue(e.getPlayer().getName(), e.getPlayer());

		}else{
			
			redIsFull = true;
			
			redIsFull = true;
			
		}
		
	}
	
	public void addToTeamRed(String playerName, Player player){
		
		 teamRed.put(playerName, player);
		
	}
	
	public void addToTeamBlue(String playerName, Player player){
		
		 teamBlue.put(playerName, player);

		
	}
	
	public static HashMap getTeamBlue(){
		
		return teamBlue;
	}
	
	public static HashMap getTeamRed(){
		
		return teamRed;
	}
	
	public static boolean teamRedFull(){
		if (redIsFull == true){
			
			return true;
		}
		return false;
	}
	
	public static boolean teamBlueFull(){
		if (blueIsFull == true){
			
			return true;
		}
		return false;
	}
	
	
}
