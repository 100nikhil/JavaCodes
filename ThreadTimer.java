public class ThreadTimer extends Thread{
    public void run(){
        for(int i=0; i<1000; i++){   
            try{
                System.out.println("Thread.....");
                Thread.sleep(5000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        ThreadTimer t1 = new ThreadTimer();
        t1.start();    
    }
}