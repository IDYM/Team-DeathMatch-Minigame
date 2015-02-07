package me.kenny.gameData;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.bukkit.Location;

public class GameMaps {

	private Scanner fileReader;
	private Formatter fileWriter;

	HashMap<String,String[]> mapsToRead = new HashMap<>();
	HashMap<String,List<String>> mapsToWrite = new HashMap<>();

	public void getAllFileData(String WorldName){

		try {
			fileReader = new Scanner("GameWorlds.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}

		String fullFile = fileReader.nextLine();

		String[] map = fullFile.split(";");

		for(String mapData : map){

			mapsToRead.put(mapData.split(":")[0], mapData.split("/"));

		}
		
	}

	public void setFileData(int setCase, String mapName, Location location) throws FileNotFoundException{

		fileWriter = new Formatter("GameMaps.txt");

		if(setCase == 1){
			mapsToWrite.put(mapName, null);
		}else if(setCase == 2){
			
			mapsToWrite.put(mapName, null);
						
		}

	}

	public String[] getSpawnLocationsRed(String mapName, int spawnSet){
		String[] teamRed = mapsToRead.get(mapName);

		String[] setToReturn = teamRed[spawnSet-1].split("@")[0].split("*");

		return setToReturn;
		
		
		
	}

	public String[] getSpawnLocationsBlue(String mapName, int spawnSet){

		String[] teamBlue = mapsToRead.get(mapName);

		String[] setToReturn = teamBlue[spawnSet-1].split("@")[1].split("*");

		return setToReturn;

	}

}
