public class Vehicle implements Runnable{
    private static TollBooth tollB = new TollBooth();
    private int vehicleID;
    public Vehicle(int vehicleID){
        this.vehicleID = vehicleID;
    }
    public int getVehicleID(){
        return this.vehicleID;
    }

    // Thread method...
    @Override
    public void run() {
        try{
            System.out.println("Vehicle ---- "+ (vehicleID + 1) + " starts moving");
            Thread.sleep(500);

            System.out.println("Vehicle ---- " + (vehicleID + 1) + " arrives at the toll");
            Thread.sleep(500);

            tollB.useToll(this); // current vehicle uses toll booth

            System.out.println("Vehicle ---- " + (vehicleID + 1) + " has crossed the bridge");
            System.out.println("");
        }catch (Exception e){
            System.out.println("Exception Caught");
        }
    }
}
