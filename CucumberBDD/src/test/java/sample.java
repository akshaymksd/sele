import io.cucumber.java.en.Given;
public class sample {
	@Given("(Sarah|she) has {double} cucumber(s) in {word} {word}")
	public void sarah_has_cucumbers(Double double1,String string1,String string2){
		System.out.println(double1+"\t"+string1+"\t"+string2);
	}
	   
	}


