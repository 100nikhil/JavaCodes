public class MathTest{
    public static void main(String[] args){
        Mathematics m = new Mathematics();
        System.out.println("Sum of 20 & 4 is : "+m.add(20,4));
        System.out.println("Subtraction of 20 & 4 is : "+m.subtract(20,4));
        System.out.println("Multiply of 20 & 4 is : "+m.multiply(20,4));
        System.out.println("Division of 20 & 4 is : "+m.divide(20,4));
        System.out.println("Square root of 4 is : "+m.squareRoot(4));
        System.out.println("Modulo of 20 & 4 is : "+m.modulo(20,4));
    }
}