package me.kenny.basic_game_structure.initializer_classes;

import me.kenny.events.TimeLimitReachedEvent;

public class Timer implements Runnable {

	static int originalMinutes;
	
	static int originalSeconds;
	
	static int minutes;
	
	static int seconds;
	
	String displayTime;
	
	public static void setTime(int timeMinutes){
		
		originalMinutes = timeMinutes;
		
		originalSeconds = 0;
		
		minutes = timeMinutes;
		
		seconds = 0;
	
	}
	
	public String timeToDisplay(int minutes, int seconds){
		
		if(seconds >=10){
			
		displayTime = String.format("%d:%d%d", minutes,seconds);
		
		}else{
			
			displayTime = String.format("%d:0%d", minutes,seconds);

		}
		
		return displayTime;
		
		}
	
	@Override
	public void run() {

		String display = timeToDisplay(minutes,seconds);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		seconds--;
		
		if(seconds == 0){
			
			minutes--;
			
			seconds = 60;
		
		}
		
		if(minutes == 0){
			
			timeIsUp(true);
			
		}
		
	}
		
	public void timeIsUp(boolean timeDone){
		
		boolean isDone = false;
		
		if(timeDone==true){
			
			isDone = true;
		
			TimeLimitReachedEvent.onTimeLimitReached(true);
			
		}
		
	}
	
	
	
	
	
	
	
	
}
