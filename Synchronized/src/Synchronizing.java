package Synchronized.src;

public class Synchronizing extends Thread{

    Synchronizing(){
        start();
    }

    public void run(){
        dosth();
        dosthAgain();
    }

    public synchronized void dosth(){
        try{
            for (int i =1; i <= 5; i++){
                System.out.println("Stand "+ i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println("Who woke me?");
        }
    }

    public synchronized void dosthAgain(){
        try{
            for (int i =1; i <= 10; i++){
                System.out.println("sit "+ i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println("Who woke me?");
        }
    }

    public static void main(String[] args) {
        Synchronizing s1 = new Synchronizing(); // calling the constructor
//        Sync s2 = new Sync()
//        Sync s3 = new Sync()
    }
}
