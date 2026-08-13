public class Appointment {

    private String appointmentId;
    private Pet pet;
    private Owner owner;
    private String date;
    private String time;
    private String reason;

    public Appointment(String appointmentId, Pet pet, Owner owner,
                       String date, String time, String reason) {
        this.appointmentId = appointmentId;
        this.pet = pet;
        this.owner = owner;
        this.date = date;
        this.time = time;
        this.reason = reason;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public void displayAppointment() {
        System.out.println("\n===== Appointment Details =====");
        System.out.println("Appointment ID: " + appointmentId);
        System.out.println("Date: " + date + "  Time: " + time);
        System.out.println("Reason: " + reason);
        System.out.println("Pet Details:");
        pet.displayInfo();
        System.out.println("Owner Details:");
        owner.displayOwnerInfo();
    }
}
