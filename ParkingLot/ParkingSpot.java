public class ParkingSpot {
    private final int number;
    private Status status;
    private Vehicle parkedVehcle;

    public ParkingSpot(int number) {
        this.number = number;
        this.status = Status.AVAILABLE;
        this.parkedVehcle = null;
    }

    public boolean getStatus() {
        return this.status == Status.AVAILABLE;
    }

}
