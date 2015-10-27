package feature;

import edu.stanford.nlp.tagger.maxent.MaxentTagger;



public class PosTag_feature extends Feature{
	
	MaxentTagger tagger = new MaxentTagger("models/english-left3words-distsim.tagger");
	String posTag;
	
	public void execute(){
		posTag = tagger.tagTokenizedString(word); 
		
	}
	
	public String getPosTag(){
		return posTag;
	}
}
