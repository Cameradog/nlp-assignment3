package main;

import java.util.Scanner;

import common.Constant;
import common.DebugMessage;
import data.Field;
import data.FieldService;
import feature.Capitalize_feature;
import feature.ExampleFeature;
import feature.PosTag_feature;
import feature.Prep_feature;
import fileService.FileInput;
import fileService.FileOutput;

/**
 * 
 * you are able to add Exception in Exception.java and using
 * Exception.functionname to call it
 * 
 * you need to create a feature class that extends feature and feature enum for
 * column values
 * 
 * Once you finish creating your features, you need to add Field name in Field
 * java(for example "NER")
 */
public class Main {
	FileInput fileInput;
	FileOutput fileOutput;

	// starter
	public static void main(String[] args) {
		new Main().execute();

	}

	public Main() {
		fileInput = new FileInput();
		fileOutput = new FileOutput();
	}

	public void execute() {
		Scanner input = new Scanner(System.in);
		System.out.println("輸入 0 生成feature, 輸入 1 計算正確率");
		int option = input.nextInt();
		if (option == 0) {
			readFile("train_en.txt");
			training();
			// DebugMessage.resultPrint();
			writeFile();
		} else if (option == 1) {
			Constant.CALCULATECORRENTIONRATE = true;
			readFile("predict.txt");
			calculateRightRate();
			DebugMessage.printCorrectRate();
		}
	}

	public void readFile(String path) {
		fileInput.readFile(path);
	}

	public void calculateRightRate() {
		for (int i = 0; i < Constant.ALLDATAS.size(); i++) {
			Field wordField = Constant.ALLDATAS.get(i);
			if (!wordField.isNewLine) {
				Constant.TOTALWORDS++;			
				FieldService.getServ().calculateRightRate(
						wordField.expectedNER, wordField.realNER);
			}
		}
	}

	public void training() {
		// ExampleFeature ef = new ExampleFeature();
		Capitalize_feature cf = new Capitalize_feature();
		PosTag_feature pf = new PosTag_feature();
		Prep_feature prep_f = new Prep_feature();

		String CapitalizeFeature;
		String PostagFeature;
		String PrepFeature;

		// for all the words
		for (int i = 0; i < Constant.ALLDATAS.size(); i++) {
			Field wordField = Constant.ALLDATAS.get(i);

			// to set count to give nextField/prevField enough information to
			// work
			FieldService.getServ().setCurTokenCount(i);
			System.out.println(wordField.word);
			// FieldService.getServ().getCurTokenCount();
			
			// prevent new line with all white space
			if (!wordField.isNewLine) {
				// Capitalize
				cf.setWord(wordField.word);
				cf.execute();
				CapitalizeFeature = cf.getFeature().toString();

				// Postagging
				pf.setWord(wordField.word);
				pf.execute();
				PostagFeature = pf.getPosTag();

				// Prep
				prep_f.setWord(wordField.word);
				prep_f.execute();
				PrepFeature = prep_f.getFeature().toString();

				// setWord and getFeature to get your features
				Constant.ALLDATAS.get(i).Capitalize = CapitalizeFeature;
				Constant.ALLDATAS.get(i).PosTag = PostagFeature;
				Constant.ALLDATAS.get(i).Prep = PrepFeature;

			} else {

			}
		}
	}

	public void writeFile() {
		fileOutput.writeFile();
	}
}
