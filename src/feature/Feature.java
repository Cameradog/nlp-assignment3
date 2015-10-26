package feature;

public abstract class Feature {
	Enum<?> feature;
	String word;
	//get a word
	public Feature(){
	}
	
	public void setWord(String word){
		this.word = word;
	}
	
	public Enum<?> getFeature(){
		return feature;
	}
}
