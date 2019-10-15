package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class PGNReader {

	public static Match read(File file) throws Exception {
		
		if (!file.exists())
			throw new FileNotFoundException();
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		while ((line = br.readLine()) != null) {
			
			
			
		}
		
		return null;
	}

}
