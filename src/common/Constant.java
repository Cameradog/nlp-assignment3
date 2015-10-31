package common;

import java.util.ArrayList;

import data.Field;

public class Constant {
	public static final boolean DEBUG = false;
	public static ArrayList<Field> ALLDATAS = new ArrayList<Field>();
	
	public static final String[] OUTPUTFIELDS= {
		"word", "Capitalize" , "PosTag" , "Prep" , "NER"
	};
	
	//FOR THE LINE WHICH CONTAINS ALL WHITESPACE
	public static boolean OUTPUTNEWLINE = true;
	public static boolean CALCULATECORRENTIONRATE=false;
	public static int TOTALWORDS =0;
	public static int CORRECTWORDS =0;
}
