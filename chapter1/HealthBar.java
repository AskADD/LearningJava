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
	public HealthBar(String namex) {  
		this.name = namex;
	}
	public String getInfo() {
		return this.name;
	}

	//k
	public static void main(String[] args) {
	System.out.println("Hello World");

	//creating instance of HealthBar as type HealthBar by passing in command line arguments
	if (args.length == 0) {
	System.err.println("Please provide one argument");
	System.exit(95);
	}
	HealthBar myInstance = new HealthBar(args[0]);

	//call it on an instance;
  
	System.out.println(myInstance.getInfo()); 
	
	}



}
