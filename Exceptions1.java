public class Exceptions1{
    public static void main(String[] args) throws Exception{
        /*
        try{
            throw new Exception();
        }                                   finally block always executes. No matter what.
        finally{
            System.out.println("Hi...");
        }
        */
        try{
            int a = 5/0;
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
        finally{
            System.out.println("finally...");
        }
    }
}