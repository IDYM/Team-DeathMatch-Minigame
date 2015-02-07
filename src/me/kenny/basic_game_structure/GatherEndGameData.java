package me.kenny.basic_game_structure;

import java.util.HashMap;
import java.util.Map.Entry;

import me.kenny.basic_game_structure.initializer_classes.ScoreBoard;
import me.kenny.basic_game_structure.initializer_classes.TeamSet;

import org.bukkit.entity.Player;

public class GatherEndGameData {

	HashMap<Player, Integer> finalXPRed = new HashMap<>();
	
	HashMap<Player, Integer> finalXPBlue = new HashMap<>();
	
	String winner;

	public void setPlayerRedXP(){
		
		finalXPRed.putAll(TeamSet.getTeamRedXP()); 
		
	}
	
	public void setPlayerBlueXP(){
		
		finalXPBlue.putAll(TeamSet.getTeamBlueXP()); 
		
	}
	
	public void setWinner(){
		
		winner.equals(ScoreBoard.getResult());
		
	}
	
	public void assignXP(){
		
		for(Entry <Player, Integer> x : finalXPBlue.entrySet()){
			
			Player player = x.getKey();
			
			player.setExp(player.getExp() + x.getValue());
			
		}
		
		for(Entry <Player, Integer> x : finalXPRed.entrySet()){
			
			Player player2 = x.getKey();
			
			player2.setExp(player2.getExp() + x.getValue());
			
		}
		
	}
	
}
