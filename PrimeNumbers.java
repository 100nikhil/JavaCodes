public class PrimeNumbers{
    public static void main(String[] args){
        String s="";
        int i,j,count = 0;
        for(i=2; i<=10000; i++){
            count=0;
            for(j=2; j<=i/2; j++){
                if(i%j==0){
                    count = 1;
                    break;
                }
            }
            if(count == 0){
                s += (i+" ");
            }
            
        }
        System.out.println(s);
    }
}