package feature;

import java.util.regex.Pattern;

public class Prep_feature extends Feature {
	public void execute() {
		String prep = "^(to|in(to)?|on(to)?|at|for|by|over|under"
				+ "|below|from|through|across|between|about|of)$";
		String plural = "(s|es)$";
		String past = "(ed)$";
		String noun = "(tion|er|hood|lity|ness|sion|ment)$";
		String adj = "(able|ible|al|ary|ful|ic|ical|ing$|ish|tive|less|like"
				+ "|ory|orial|ous|some)";
		String adv = "(ly)$";
		String verb = "(ate|fy|ize|ise|en)$";
		String ques = "(\\?)$";
		String time = "([0-9]+:[0-9]+)";
		String date = "([0-9]+/[0-9]+)";
		
		
		if (Pattern.compile(prep).matcher(word).find()) {
			feature = Prep_Enum.prep;
		} else if (Pattern.compile(plural).matcher(word).find()) {
			feature = Prep_Enum.plural;
		} else if (Pattern.compile(past).matcher(word).find()) {
			feature = Prep_Enum.past;
		} else if (Pattern.compile(noun).matcher(word).find()) {
			feature = Prep_Enum.noun;
		} else if (Pattern.compile(adj).matcher(word).find()) {
			feature = Prep_Enum.adj;
		} else if (Pattern.compile(adv).matcher(word).find()) {
			feature = Prep_Enum.adv;
		} else if (Pattern.compile(verb).matcher(word).find()){
			feature = Prep_Enum.verb;
		} else if (Pattern.compile(ques).matcher(word).find()){
			feature = Prep_Enum.ques;	
		} else if (Pattern.compile(time).matcher(word).find()){
			feature = Prep_Enum.time;
		} else if (Pattern.compile(date).matcher(word).find()){
			feature = Prep_Enum.date;
		} else {
			feature = Prep_Enum.no_match;
		}
	}
}
