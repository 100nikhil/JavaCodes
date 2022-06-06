import java.lang.StringBuilder;

public class ReverseString{
    public static void main(String[] args){
        String s = "My name is nikhil";
        
        //reverse the string in one line
        
        System.out.println(new StringBuilder().append(s).reverse());
    }
}