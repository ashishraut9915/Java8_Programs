package FunctionalInterface;


interface sayable11{
	void say(String msg);
	 int hashCode();  
	 String toString();  
	 boolean equals(Object obj);  
}
public class FunctionalInterfaceExample2 implements sayable{

	@Override
	public void say(String msg) {
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		FunctionalInterfaceExample2 fi = new FunctionalInterfaceExample2();
		fi.say("Java is object oriented programing language");
	}

	
	
}
