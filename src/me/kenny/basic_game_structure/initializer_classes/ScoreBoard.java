package me.kenny.basic_game_structure.initializer_classes;


public class ScoreBoard {

	static int scoreBoardTeamRed = 0;
	static int scoreBoardTeamBlue = 0;
	
	public static void addTeamRedPoints(){
			
			scoreBoardTeamRed += 20;
		
			scoreBoardTeamBlue -= 20;
		
	}
	
	public static void addTeamBluePoints(){
		
			scoreBoardTeamBlue += 20;
		
			scoreBoardTeamRed -= 20;
		
	}
	
	public static String getResult(){
		
		if(scoreBoardTeamRed<scoreBoardTeamBlue){
			
			return String.format("Team Red Wins");
			
		}else if (scoreBoardTeamBlue<scoreBoardTeamRed) {
			
			return String.format("Team Blue Wins");
			
		}else{
			
			return String.format("Draw");
			
		}
		
	}
	
}
