class Parent{
    public static void func(){
        System.out.println("parent class method...");
    }     
}

public class CheckingStaticOverride extends Parent{

    public static void func(){
        System.out.println("subclass overridden method...");
    }

    public static void main(String[] args){
        System.out.println("Hi all");

        Parent p = new Parent();
        p.func();
        Parent.func();    //calling static method directly
        

        //Runtime polymorphism will not take place [MethodHiding]
        //parent method will run still
        Parent p1 = new CheckingStaticOverride();
        p1.func();
        

        CheckingStaticOverride c = new CheckingStaticOverride();
        c.func();

    }
}