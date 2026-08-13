import java.util.ArrayList;

public class ReportService {

    private ArrayList<Pet> pets;
    private ArrayList<Appointment> appointments;
    private ArrayList<MedicalRecord> records;

    public ReportService(
            ArrayList<Pet> pets,
            ArrayList<Appointment> appointments,
            ArrayList<MedicalRecord> records) {

        this.pets = pets;
        this.appointments = appointments;
        this.records = records;
    }

    public void displayReport() {

        int dogs = 0;
        int cats = 0;
        int birds = 0;

        for (Pet pet : pets) {

            if (pet instanceof Dog) {
                dogs++;
            } else if (pet instanceof Cat) {
                cats++;
            } else if (pet instanceof Bird) {
                birds++;
            }
        }

        System.out.println();
        System.out.println("================================");
        System.out.println("       PET CARE REPORT");
        System.out.println("================================");

        System.out.println("Total Pets          : " + pets.size());
        System.out.println("Dogs                : " + dogs);
        System.out.println("Cats                : " + cats);
        System.out.println("Birds               : " + birds);
        System.out.println("Total Appointments  : " + appointments.size());
        System.out.println("Medical Records     : " + records.size());

        System.out.println("================================");
    }
}
