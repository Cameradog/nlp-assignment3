package fileService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import data.FieldService;

public class FileInput {
	
	//read file which located in the same project path
	public void readFile(String path){
		BufferedReader reader;
		String line;
		try {
			reader = new BufferedReader(new FileReader(path));
			
			//read file line by line
			while ((line = reader.readLine()) != null) {
				FieldService.getServ().createField(line);
			}		
			
			//close stream
			reader.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
