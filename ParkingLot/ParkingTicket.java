import java.time.LocalDateTime;

public class ParkingTicket {
    private final int id;
    private final String vehicleRegistrationNumber;
    private final LocalDateTime arrivalTime;
    private LocalDateTime exitTime;
    private double parkingCharges;

    public ParkingTicket(int id, String vehicleRegistrationNumber) {
        this.id = id;
        this.vehicleRegistrationNumber = vehicleRegistrationNumber;
        this.arrivalTime = LocalDateTime.now();
    }

    public int getId() {
        return this.id;
    }

    public String getVehicleRegistrationNumber() {
        return this.vehicleRegistrationNumber;
    }

    public LocalDateTime getArrivalTime() {
        return this.arrivalTime;
    }

    public LocalDateTime getExitTime() {
        return this.exitTime;
    }

    public void setExitTime(LocalDateTime time) {
        this.exitTime = time;
    }

}
