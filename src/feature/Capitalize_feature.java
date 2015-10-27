package feature;

import java.util.regex.Pattern;

public class Capitalize_feature extends Feature {
	public void execute(){
		//FieldService.getServ().nextField();
		String aa = "^[a-z]+$";
		String AA = "^[A-Z]+$";
		String Aa = "^[A-Z]{1}[a-z]+$";
		String AaAa = "^([A-Z]{1}[a-z]+)+$";
		String n = "^[0-9]+$";
		String c = "[^\\w\\s]";
		 
		 if (Pattern.matches(aa, word)){
			 feature = Capitalize_Enum.aa;
		 } else if (Pattern.matches(AA, word)){
			 feature = Capitalize_Enum.AA;
		 } else if (Pattern.matches(Aa, word)){
			 feature = Capitalize_Enum.Aa;
		 } else if (Pattern.matches(AaAa, word)){
			 feature = Capitalize_Enum.AaAa;
		 } else if (Pattern.matches(n, word)){
			 feature = Capitalize_Enum.n;
		 } else if (Pattern.matches(c, word)){
			 feature = Capitalize_Enum.c;
		 } else {
			 feature = Capitalize_Enum.No_match;
		 } 
	}
}
