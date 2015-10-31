package common;

import java.util.ArrayList;

import data.Field;

public class Constant {
	public static final boolean DEBUG = false;
	public static ArrayList<Field> ALLDATAS = new ArrayList<Field>();
	
	public static final String[] OUTPUTFIELDS= {
<<<<<<< HEAD
		"word"
=======
		"word", "Capitalize" , "PosTag" , "Prep" , "NER"
>>>>>>> 619ea4e4b19301e7b9a602a6d73bf7cd26081abb
	};
	
	//FOR THE LINE WHICH CONTAINS ALL WHITESPACE
	public static boolean OUTPUTNEWLINE = true;
}
