package common;

public class DebugMessage {
	static boolean isDebugMode = Constant.DEBUG;

	/**
	 * you can add your own debug message 
	 */
	
	//for example
	//and you can call DebugMessage.outputCount(adf) in another java file.
	public static void outputCount(int count){
		if(isDebugMode){
			System.out.println("Count is :" + count);
		}
	}
	
	public static void printFileName(String name){
		if(isDebugMode){
			System.out.println("File name is :" + name );		
		}
	}
	
	public static void resultPrint(){	
		String word;
		//String example;
		//String ner;
		String capital;
		String Ptag;	
		String Prep;
		for(int i = 0 ; i < Constant.ALLDATAS.size() ; i++){
			word = Constant.ALLDATAS.get(i).word;
			//example = Constant.ALLDATAS.get(i).Example;
			capital = Constant.ALLDATAS.get(i).Capitalize;
			Ptag = Constant.ALLDATAS.get(i).PosTag;
			Prep = Constant.ALLDATAS.get(i).Prep;
			//ner
			//captial
			System.out.println(word +" / " + capital+" / "+Ptag +" / "+ Prep);
		}
	}
}
