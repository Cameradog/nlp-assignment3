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
}
