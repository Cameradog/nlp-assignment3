package common;

import java.util.ArrayList;

import data.Field;

public class Constant {
	public static final boolean DEBUG = false;
	public static ArrayList<Field> ALLDATAS = new ArrayList<Field>();
	
	public static final String[] OUTPUTFIELDS= {
		"word", "Capitalize" , "PosTag" , "NER"
	};
	
	//FOR THE LINE WHICH CONTAINS ALL WHITESPACE
	public static boolean OUTPUTNEWLINE = true;
}
