package feature;

import edu.stanford.nlp.tagger.maxent.MaxentTagger;



public class PosTag_feature extends Feature{
	
	MaxentTagger tagger = new MaxentTagger("models/english-left3words-distsim.tagger");
	String posTag;
	
	public void execute(){
		String tag[];
		tag = tagger.tagTokenizedString(word).split("_| ");
		posTag = tag[1];
	}
	
	public String getPosTag(){
		return posTag;
	}
}
