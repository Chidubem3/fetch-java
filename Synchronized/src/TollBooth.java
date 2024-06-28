public class TollBooth {
    boolean occupied;
    TollBooth(){
        occupied = false;
    }
    public void useToll(Vehicle vehicle){
        while (true){
            try{
                if (occupied == false){
                    synchronized (this){
                        occupied = true;
                        System.out.println("Vehicle " +(vehicle.getVehicleID() + 1)+ " "+"inside tollbooth");
                        Thread.sleep(500);

                        System.out.println("Vehicle "+ (vehicle.getVehicleID() +1)+" "+ "leaves tollbooth");
                        occupied = false;
                        break;
                    }
                }
            }catch (Exception e){
                System.out.println("Exception Caught");
            }
        }
    }
}
