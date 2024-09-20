package FunctionalInterface;


interface sayable{
	void say(String msg);
}
public class FunctionalInterfaceExample1 implements sayable{

	@Override
	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		FunctionalInterfaceExample fi = new FunctionalInterfaceExample();
		fi.say("you will do it");
		
	}
	
}
