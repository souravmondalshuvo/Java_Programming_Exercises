import java.time.LocalTime;
public class Airplane {

    private String flight_number;
    private String destination;
    private LocalTime scheduled_departure;
    private int delay_time;

    public Airplane(String flight_number, String destination, LocalTime scheduled_departure) {
        this.flight_number = flight_number;
        this.destination = destination;
        this.scheduled_departure = scheduled_departure;
    }

    public String getFlightNumber() {
        return flight_number;
    }

    public void setFlightNumber(String flight_number) {
        this.flight_number = flight_number;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalTime getScheduledDeparture() {
        return scheduled_departure;
    }

    public void setScheduledDeparture(LocalTime scheduled_departure) {
        this.scheduled_departure = scheduled_departure;
    }

    public int getDelayTime() {
        return delay_time;
    }

    public void delay(int minutes) {
        this.delay_time = minutes;
        this.scheduled_departure = this.scheduled_departure.plusMinutes(minutes);
    }

    public void checkStatus() {
        if(delay_time == 0) {
            System.out.println("Flight " + flight_number + " is on time.");
        } else {
            System.out.println("Flight " + flight_number + " is delayed by " + delay_time + " minutes");
        }
    }
}