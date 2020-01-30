package skeleton;

public class Person {
	private String message;
	private int distance;
	public void setDistance(Integer int1) {
		// TODO Auto-generated method stub
		distance=int1;
	}
	public void setMessage(String string) {
		// TODO Auto-generated method stub
		message=string;
		if(distance>0&&distance<30)
			message=string;
		else
		message=null;
	}
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}
}
