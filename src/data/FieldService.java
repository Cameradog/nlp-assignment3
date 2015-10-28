package data;

import common.Constant;

public class FieldService {
	// using singleton pattern to make sure you
	// establish this instance only once.
	private static FieldService fieldService = null;

	// cur words' count
	private int curTokenCount;

	// get service and you can use function and you can access this java's
	// function
	// for example:FieldService.getServ().createNewField
	public static FieldService getServ() {
		if (fieldService == null) {
			fieldService = new FieldService();
		}
		return fieldService;
	}

	// ini field
	public void createField(String text) {
		// add field
		Field curField = new Field();

		if (!text.equals("")) {
			String[] fields = text.split("\\s+");

			// HARD CODE
			// for train.txt
			if (fields.length == 1) {
				curField.word = fields[0];
			} else if (fields.length == 2) {
				curField.word = fields[0];
				curField.NER = fields[1];
			}

		} else {
			curField.isNewLine = true;
		}
		Constant.ALLDATAS.add(curField);
	}

	public void setCurTokenCount(int count) {
		this.curTokenCount = count;
	}

	public int getCurTokenCount() {
		return curTokenCount;
	}

	// throw error if index is overflow or underflow
	public Field nextField() throws Exception {
		int maxIndex = Constant.ALLDATAS.size() - 1;

		if (curTokenCount + 1 <= maxIndex) {
			return Constant.ALLDATAS.get(curTokenCount + 1);
		} else {
			throw new Exception("OverFlow occur");
		}
	}

	// throw error if index is overflow or underflow
	public Field preField() throws Exception {
		if (curTokenCount - 1 >= 0) {
			return Constant.ALLDATAS.get(curTokenCount - 1);
		} else {
			throw new Exception("UnderFlow occur");
		}
	}

	public String getFieldValue(Field field){
		String result="";
		String[] fields = Constant.OUTPUTFIELDS;

		//prevent extra white space
		switch (fields[0]) {
			case "word": 
				result += field.word;
				break;
			case "NER":
				result += field.NER;
				break;
			case "Capitalize":
				result += field.Capitalize;
				break;
			case "PosTag":
				result += field.PosTag;
				break;
			case "Prep":
				result += field.Prep;
				break;
		}
		
		for(int i = 1 ; i < fields.length ; i++){
			switch (fields[i]) {
			case "word": 
				result += "\t"+field.word;
				break;
			case "NER":
				result += "\t"+field.NER;
				break;
			case "Capitalize":
				result += "\t"+field.Capitalize;
				break;
			case "PosTag":
				result += "\t"+field.PosTag;
				break;
			case "Prep":
				result += field.Prep;
				break;
			}
		}
		return result;
	}
}
