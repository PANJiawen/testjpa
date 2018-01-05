public class Test {  
    public static void main(String[] args) {  
        //new Son("baidu");  
        System.out.println("BBBBBBBBBBB");
        new Son();  
    }  
}  
  
class Farther{  
    public Farther(){  
        System.out.println("I am father");  
    }  
  
    public Farther(String name){  
        System.out.println("I am father:"+name);  
    }  
}  
  
class Son extends Farther{  
    public Son(){  
    	super();
//        System.out.println("I am son");  
    }  
//    public Son(String name){  
//        super("google");  
//        System.out.println("I am son:"+name);  
//    }  
}  