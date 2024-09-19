package LambdaExp;

interface Sayablesss{  
    public String say(String name);  
}  
  
public class LambdaExpressionExample3{  
    public static void main(String[] args) {  
      
      
        Sayablesss s1=(name)->{  
            return name;  
        };  
        System.out.println(s1.say("Ashish"));  
          
        Sayablesss s2= name ->{  
            return "Hello, "+name;  
        };  
        System.out.println(s2.say("Sir"));  
    }  
}  