package feature;

import java.util.regex.Pattern;

public class Prep_feature extends Feature {
	public void execute() {
		String prep = "^(to|in(to)?|on(to)?|at|for|by|over|under"
				+ "|below|from|through|across|between|about)$";
		String plural = "(s|es)$";
		String past = "(ed)$";
		String noun = "(tion|er|hood|lity|ness|sion|ment)$";
		String adj = "(able|ible|al|ary|ful|ic|ical|ing|ish|tive|less|like"
				+ "|ory|orial|ous|some)$";
		String adv = "(ly)$";
		String verb = "(ate|fy|ize|ise|en)$";
		String ques = "(?)$";
		String time = "[0-9]+:[0-9]+";
		String date = "[0-9]+/[0-9]+";

		if (Pattern.matches(prep, word)) {
			feature = Prep_Enum.prep;
		} else if (Pattern.matches(plural, word)) {
			feature = Prep_Enum.plural;
		} else if (Pattern.matches(past, word)) {
			feature = Prep_Enum.past;
		} else if (Pattern.matches(noun, word)) {
			feature = Prep_Enum.noun;
		} else if (Pattern.matches(adj, word)) {
			feature = Prep_Enum.adj;
		} else if (Pattern.matches(adv, word)) {
			feature = Prep_Enum.adv;
		} else if (Pattern.matches(verb, word)){
			feature = Prep_Enum.verb;
		} else if (Pattern.matches(ques, word)){
			feature = Prep_Enum.ques;	
		} else if (Pattern.matches(time, word)){
			feature = Prep_Enum.time;
		} else if (Pattern.matches(date, word)){
			feature = Prep_Enum.date;
		} else {
			feature = Prep_Enum.no_match;
		}
	}
}
