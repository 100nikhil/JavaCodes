import java.util.Arrays;
import java.util.Scanner;

public class ArraysInJava{
    public static void main(String[] args){
        int[] arr = new int[10];
        System.out.println("Enter the elements of the array:");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<10; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array you enetered is :");
        for(int i=0; i<10; i++){
            System.out.print(arr[i]+" ");
        }
        Arrays.sort(arr);
        System.out.println();
        System.out.println("After sorting: ");
        for(int i=0; i<10; i++){
            System.out.print(arr[i]+" ");
        }
    }
}