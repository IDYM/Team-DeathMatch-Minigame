package me.kenny.basic_game_structure.initializer_classes;

import java.util.HashMap;
import java.util.Random;

import me.kenny.events.PlayerJoinHandle;

import org.bukkit.entity.Player;

public class TeamSet {

	static HashMap<String,Player> gameTeamRed = new HashMap<>();
	
	static HashMap<String,Player> gameTeamBlue = new HashMap<>();
	
	static HashMap<Player,Integer> teamRedXP = new HashMap<>();
	
	static HashMap<Player,Integer> teamBlueXP = new HashMap<>();
	
	boolean teamRedIsSet = false;
	
	boolean teamBlueIsSet = false;
	
	public void setTeamRed(){
		
		if(PlayerJoinHandle.teamRedFull() == true){
			
			gameTeamRed = PlayerJoinHandle.getTeamRed();

			teamRedIsSet = true;
		}
		
	}
	
	public void setTeamBlue(){
		
		if(PlayerJoinHandle.teamBlueFull() == true){
			
			gameTeamBlue = PlayerJoinHandle.getTeamBlue();

			teamBlueIsSet = true;
		}
		
	}
	
	public boolean teamsSet(){
		
		if(teamBlueIsSet == true && teamRedIsSet == true){
			
			return true;
		}
		
		return false;
		
	}
	
	public static void addTeamRedXP(Player killer, Player killed){
		
		teamRedXP.put(killer, (int) (teamRedXP.get(killer)+(killed.getExp()*0.20)));
		
	}
	
	public static void addTeamBlueXP(Player killer, Player killed){
		
		teamBlueXP.put(killer, (int) ( teamBlueXP.get(killer)+(killed.getExp()*0.20)));
		
	}
	
	public static boolean isTeamRed(Player playerName){
		
		if(gameTeamRed.containsKey(playerName)){
			
			return true;
		}
		
		return false;
	}
	
	public boolean isTeamBlue(Player playerName){
		
		if(gameTeamBlue.containsKey(playerName)){
			
			return true;
		}
		
		return false;
	}
	
	public static Player getRedPlayer(String killed){
		
		return gameTeamRed.get(killed);
	}
	
	public static Player getBluePlayer(String killed){
		
		
		return gameTeamBlue.get(killed);
	}
	
	public static HashMap getTeamRedXP(){
	
	return teamRedXP;
}

	public static HashMap getTeamBlueXP(){
	
	return teamBlueXP;
}
	
}
