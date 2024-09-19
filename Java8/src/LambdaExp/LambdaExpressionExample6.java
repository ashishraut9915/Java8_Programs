package LambdaExp;

interface Addable0{  
    int add(int a,int b);  
}  
  
public class LambdaExpressionExample6 {  
    public static void main(String[] args) {  
          
        Addable0 ad1=(a,b)->(a+b);  
        System.out.println(ad1.add(10,20));  
          
        Addable0 ad2=(int a,int b)->{  
                            return (a+b);   
                            };  
        System.out.println(ad2.add(100,200));  
    }  
}