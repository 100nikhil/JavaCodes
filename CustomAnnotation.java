import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

/*
Below is custom annotation -> Nikhil , which can be used on methods
we can set properties like name, age.
*/

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Nikhil{
    String name() default "NIKHIL CHOUDHARY";
    int age() default 24;
} 

public class CustomAnnotation{

    @Nikhil(name="Vatsala", age=24)
    public void method(){
        try{
            Class ca = CustomAnnotation.class;
            Method m = ca.getMethod("method");
            Nikhil n = m.getAnnotation(Nikhil.class);
            System.out.println(n.name()+" "+n.age());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args){
        new CustomAnnotation().method();
    }
}