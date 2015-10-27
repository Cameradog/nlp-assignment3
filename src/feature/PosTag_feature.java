package feature;

import edu.stanford.nlp.tagger.maxent.MaxentTagger;

public class PosTag_feature extends Feature{
	public void execute(){
		MaxentTagger tagger = new MaxentTagger("models/english-left3words-distsim.tagger");
	}
}
