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
			
			curField.word = fields[0];
			curField.NER = fields[1];
		} else{
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
}
