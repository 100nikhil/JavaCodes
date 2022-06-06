public interface interfaceA{
    void func1();
    void func2();
    default void func7(){
        System.out.println("f7...");
    }
}