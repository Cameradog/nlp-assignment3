package fileService;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.security.SecureRandom;

import common.Constant;
import data.Field;
import data.FieldService;

public class FileOutput {
	PrintWriter out;
	String fileName;

	public void writeFile() {
		String randomName = generateFileName();
		
		try {
			// flush if there exist the same file
			out = new PrintWriter(new BufferedWriter(new FileWriter(
					randomName, false)));
			out.print("");
			out = new PrintWriter(new BufferedWriter(new FileWriter(
					randomName, true)));
			
			//output data
			for(int i = 0 ; i < Constant.ALLDATAS.size() ; i++){
				Field curField = Constant.ALLDATAS.get(i);
				
				//new line(whole white space
				if(curField.isNewLine){
					if(Constant.OUTPUTNEWLINE){
						out.println("");
					} else if(!Constant.OUTPUTNEWLINE){
						//do nothing
					}
				} else{
					out.println(FieldService.getServ().getFieldValue(curField));
				}				
			}
			
			out.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String generateFileName() {
		SecureRandom random = new SecureRandom();
		return new BigInteger(130, random).toString(32);
	}
}
