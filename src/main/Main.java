package main;

import common.Constant;
import data.Field;
import data.FieldService;
import feature.Capitalize_feature;
import feature.ExampleFeature;
import fileService.FileInput;
/**
 * 
 * @author john821216
 *	you are able to add Exception in Exception.java
 *  and using Exception.functionname to call it
 *  
 *  you need to create a feature class that extends feature
 *  and feature enum for column values
 *  
 *  Once you finish creating your features,
 *  you need to add Field name in Field java(for example "NER")
 */
public class Main {
	FileInput fileInput;
	//starter
	public static void main(String[] args){
		new Main().execute();
		
	}
	
	public Main(){
		fileInput = new FileInput();
	}
	
	public void execute(){
		readFile();
		training();
		resultPrint();
	}
	
	public void readFile(){
		fileInput.readFile("train_en.txt");
	}
	
	public void training(){
		//ExampleFeature ef = new ExampleFeature();
		Capitalize_feature cf = new Capitalize_feature();
		//add new instance like above example
		
		//String newExampleFeature;
		String CapitalizeFeature;
		
		//for all the words
		for(int i = 0 ; i < Constant.ALLDATAS.size() ; i++){
			Field wordField = Constant.ALLDATAS.get(i);
			
			//to set count to give nextField/prevField enough information to work 
			FieldService.getServ().setCurTokenCount(i);
			
			//FieldService.getServ().getCurTokenCount();
			
			//prevent new line with all white space
			if(!wordField.isNewLine){
				cf.setWord(wordField.word);
				cf.execute();
				CapitalizeFeature = cf.getFeature().toString();
				
				//setWord and getFeature to get your features
				Constant.ALLDATAS.get(i).Capitalize = CapitalizeFeature;
			} else {
				
			}
		}
	}
	
	//now you cannot output your result to txt
	//use this function to temporary result
	public void resultPrint(){	
		String word;
		//String example;
		//String ner;
		String capital;
		for(int i = 0 ; i < Constant.ALLDATAS.size() ; i++){
			word = Constant.ALLDATAS.get(i).word;
			//example = Constant.ALLDATAS.get(i).Example;
			capital = Constant.ALLDATAS.get(i).Capitalize;
			//ner
			//captial
			System.out.println(word +" " + capital);
		}
	}	
}
