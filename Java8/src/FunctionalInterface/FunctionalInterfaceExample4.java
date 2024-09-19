package FunctionalInterface;


interface Douables{  
    default void doIt(){  
        System.out.println("Do it now");  
    }  
}  

@FunctionalInterface  
interface Sayabble extends Douables{  
    void say(String msg);   // abstract method  in this interface... and abstract method not present in super interface so it is possible
}  

public class FunctionalInterfaceExample4 implements Sayabble{  
    public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
        FunctionalInterfaceExample4 fie = new FunctionalInterfaceExample4();  
        fie.say("Hello there");  
        fie.doIt();  
    }  
} 