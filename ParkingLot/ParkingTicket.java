import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;

public class ParkingTicket {
    static int idCounter = 0;
    private int id;
    private String vehicleRegistrationNumber;


    private LocalDateTime arrivalTime;
    private String parkingSpotNumber;

    public int getId() {
        return id;
    }

    public ParkingTicket(Vehicle vehicle, ParkingSpot availableSpot) {
        this.id = ++idCounter;
        this.vehicleRegistrationNumber = vehicle.getVehicleNumber();
        this.parkingSpotNumber = availableSpot.getSpotNumber();
        this.arrivalTime = LocalDateTime.now();
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public String toString() {
        return "Parking Ticket{" +
                "id=" + id +
                ", vehicleRegistrationNumber='" + vehicleRegistrationNumber + '\'' +
                ", arrivalTime=" + arrivalTime +
                ", parkingSpotNumber='" + parkingSpotNumber + '\'' +
                '}';
    }
}
