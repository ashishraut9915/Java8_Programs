package MethodReferences_StaticMethod;

interface Sayable{  
    void say();  
}  
public class MethodReference {  
    public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
    public static void main(String[] args) {  
    					  // class name    //Method name
        Sayable sayable = MethodReference::saySomething;  
        sayable.say();  
    }  
} 