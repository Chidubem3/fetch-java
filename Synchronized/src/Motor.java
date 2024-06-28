class vehicles {
    public synchronized void journey() {
        System.out.println("Start the Journey");
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }
    public synchronized void toll() {
        System.out.println("Arrive at the toll");
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }
    public synchronized void tollbooth() {
        System.out.println("Exiting the toll");
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }
    public synchronized void cross() {
        System.out.println("Cross the bridge");
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }
}

public class Motor extends Thread {
    vehicles vc = new vehicles();



    public static void main(String[] args) {

    }
}
