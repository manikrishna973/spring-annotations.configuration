package org.mani.di;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService{

	private String fileName = "C:/foo/bar/baz.txt";
	
	private List<String> theFortunes;

	// create a random number generator
	private Random myRandom = new Random();

	public FileFortuneService() {
		
		System.out.println(">>Inside FileFortuneService() constructor");

	}
	
	/**
	 * this method is similar to init method 
	 * after creation of this object ,init method will be
	 * executed
	 */
	@PostConstruct
	public void readFortunesFromFile() {

		System.out.println(">> inside startUpMethod: readFortunesFromFile()"+"\n");
		File theFile = new File(fileName);

		System.out.println("Reading fortunes from file: " + theFile);
		System.out.println("File exists: " + theFile.exists());

		// initialize array list
		theFortunes = new ArrayList<String>();

		// read fortunes from file
		try (BufferedReader br = new BufferedReader(new FileReader(theFile))) {

			String tempLine;

			while ((tempLine = br.readLine()) != null) {
				theFortunes.add(tempLine);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	@PreDestroy
	public void doCleanUpStuff() {
		System.out.println(">>inside doCleanUpStuff()");
	}
	
	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(theFortunes.size());

		String tempFortune = theFortunes.get(index);

		return tempFortune;
	}

}
