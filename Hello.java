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
    public void helloClassMethod(){
        System.out.println("I am hello class's method");
    }
    public static void main(String[] args){
        System.out.println("Hello world");
        //interfaceA c = new Hello();  //error intefaceA ref variable can only access interfaceA methods
        //interfaceB c = new Hello();  //error intefaceB ref variable can only access interfaceB methods
        interfaceC c = new Hello();  
        //error intefaceC ref var can acess all methods except exclusive Hello class methods
        c.func1();
        c.func2();
        c.func3();
        c.func4();
        c.func5();
        c.func6();
        c.func7();
        //c.helloClassMethod();
        new Hello().helloClassMethod();
    }
}