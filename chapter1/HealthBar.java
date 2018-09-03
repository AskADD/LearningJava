import java.lang.String;
//This is how I compile the code javac HealthBar.javac
//This how I run it: java HealthBar
public class HealthBar {
     	private String name; //I am creating a variable called name which is of type String which cannot be seen by anybody except this instance. 
	private String upc; //I am creating a variable called upc which is of type String which cannobt be seen by anybody except this instance.
	private int count; //I am creating a variable called count which is of type int which cannot be seen by anybody except the instance.
	private float weight; //I am creating a variable called  weight which is of type float which cannot be seen by anybody except the instance.
	//This is a constructor
	// What are the rules of a constructor
	//The constructor should have the same name as the class name
	//How do I identify a constructor in any given class?
	//Search search for public space class name (Public HealthBar)]
	//How many constructors can you have?
	//As many as you'd want
	public HealthBar(String name) {  
		this.name = name;
	}
	public String getInfo() {
		return this.name;
	}


	public static void main(String[] args) {
	System.out.println("Hello World");
	HealthBar myInstance = new HealthBar("Trader Joe's Raises the Bar");  //creating instance of HealthBar as type HealthBar.
	System.out.println(myInstance.getInfo()); //call it on an instance;

	}



}
