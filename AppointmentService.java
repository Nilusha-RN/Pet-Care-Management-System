import java.util.ArrayList;

public class AppointmentService {

    private ArrayList<Appointment> appointments;

    public AppointmentService() {
        appointments = new ArrayList<>();
    }

    public void addAppointment(Appointment appointment) {

        appointments.add(appointment);
        System.out.println("Appointment booked successfully.");
    }

    public void displayAppointments() {

        if (appointments.isEmpty()) {
            System.out.println("No appointments available.");
            return;
        }

        System.out.println("\n===== Appointment List =====");

        for (Appointment appointment : appointments) {
            appointment.displayAppointment();
        }
    }

    public void searchAppointment(String id) {

        for (Appointment appointment : appointments) {

            if (appointment.getAppointmentId().equalsIgnoreCase(id)) {

                appointment.displayAppointment();
                return;
            }
        }

        System.out.println("Appointment not found.");
    }

    public void cancelAppointment(String id) {

        for (Appointment appointment : appointments) {

            if (appointment.getAppointmentId().equalsIgnoreCase(id)) {

                appointments.remove(appointment);
                System.out.println("Appointment cancelled.");
                return;
            }
        }

        System.out.println("Appointment not found.");
    }

}