package me.kenny.events;

import me.kenny.Respawn;
import me.kenny.basic_game_structure.initializer_classes.ScoreBoard;
import me.kenny.basic_game_structure.initializer_classes.TeamSet;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class ScoringHandle implements Listener {

	Respawn respawn;
	
	public ScoringHandle(Respawn a){
		
		respawn = a;
		
	}
	
	@EventHandler
	public void onPlayerKillHandle(PlayerDeathEvent e){
		
		Player killed = e.getEntity();
		
		Player killer = e.getEntity().getKiller();
		
		String killedName = e.getEntity().getName();
		
		String killerName = e.getEntity().getKiller().getName();
		
		if(TeamSet.isTeamRed(killed)){
			
			TeamSet.addTeamBlueXP(killer,killed);
			
			ScoreBoard.addTeamBluePoints();
			
			respawn.respawnDeadPlayerRed(killedName);
			
		} else{
			
			TeamSet.addTeamRedXP(killer,killed);

			ScoreBoard.addTeamRedPoints();

			respawn.respawnDeadPlayerBlue(killedName);

		}
		
		
	}
	
	
	
	
	
}
