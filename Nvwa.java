package work02;

public class Nvwa {
	
	public Person createPerson(String str){
		
		switch(str){
		case "M":
			return new Man();
		case "W":
			return new Woman();
		case "R":
			return new Robot();
		default:
			return null;
		}
		
	}

}
