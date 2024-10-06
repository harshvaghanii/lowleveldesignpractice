public class AutomatedSystem {
    private final int id;

    public AutomatedSystem(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void openEntryBarrier() {

    }

    public void openExitBarrier() {

    }

    public int getAvailableSpot() {
        return 0;
    }

    public ParkingTicket generateTicket() {
        return null;
    }

    public String readVehicleNumber() {
        return "";
    }

    public double calculateCharges() {
        return 0.0;
    }

    public ParkingTicket scanTicket(int id) {
        return null;
    }
}
