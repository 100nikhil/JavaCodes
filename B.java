import pack1.A;

public class B extends A{
    int b = 20;

    public B(){
        System.out.println(a + " -> accessed via constructor");
    }

    private void func(){
        System.out.println("func");
    }
    @Override
    public void method(){
        System.out.println("Class B");
    }    

    public static void main(String[] args){
        
        //Parent class method method() can only be accessed by creating object of parent cause it
        // is overridden now.
        A obj = new A();
        obj.method();
        //System.out.println(obj.a); //not possible cause a is protected in A class

        A obj_A = new B();
        //System.out.println(obj_A.a);   //not access cause protected, you are tring to access like public
        //System.out.println(obj_A.b);   //can not access child class variable.
        obj_A.method();       // --> Run-time polymophism will come in action, overridden will run 

        B obj_B = new B();
        System.out.println(obj_B.a);
        System.out.println(obj_B.b);
        obj_B.func();
        obj_B.method();
    }
}