package feature;

public class ExampleFeature extends Feature{
	/**
	 * you can use lots of function in FieldService like nextField, preField
	 * by using such as FieldService.getServ().nextField();
	 * Field and access all kind of data such as "NEP" or "word"
	 * 
	 */
	
	//write your own execute;
	//finally assign feature to the variable
	public void execute(){
		//just an example
		//FieldService.getServ().nextField();
		if(!word.equals("")){
			feature = ExampleEnum.adfasd;
		}
	}

}
