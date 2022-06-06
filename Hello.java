public class Hello implements interfaceC{

    public void func1(){
        System.out.println("func1...");
    }
    public void func2(){
        System.out.println("func2...");
    }
    public void func3(){
        System.out.println("func3...");
    }
    public void func4(){
        System.out.println("func4...");
    }
    public void func5(){
        System.out.println("func5...");
    }
    public void func6(){
        System.out.println("func6...");
    }    
    public static void main(String[] args){
        System.out.println("Hello world");
        interfaceA c = new Hello();
        c.func1();
        c.func2();
        c.func3();
        c.func4();
        c.func5();
        c.func6();
        c.func7();
    }
}