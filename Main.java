import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Pet> pets = new ArrayList<>();
        ArrayList<Appointment> appointments = new ArrayList<>();
        ArrayList<MedicalRecord> records = new ArrayList<>();

        PetService petService = new PetService();

        // ========================================
        // SAMPLE DATA
        // ========================================

        Pet pet1 = new Dog(
                "P001",
                "Buddy",
                3,
                "Golden Retriever",
                "Male"
        );

        Pet pet2 = new Cat(
                "P002",
                "Luna",
                2,
                "Persian Cat",
                "Female"
        );

        Pet pet3 = new Bird(
                "P003",
                "Max",
                1,
                "Parrot",
                "Male"
        );

        // Add pets to local list for reports; defer adding to PetService
        pets.add(pet1);
        pets.add(pet2);
        pets.add(pet3);

        // ========================================
        // OWNER
        // ========================================

        Owner owner = new Owner(
                "O001",
                "John Perera",
                "0771234567"
        );

        owner.addPet(pet1);

        // ========================================
        // APPOINTMENT
        // ========================================

        AppointmentService appointmentService =
                new AppointmentService();

        Appointment appointment = new Appointment(
                "A001",
                pet1,
                owner,
                "15-07-2026",
                "10.00 AM",
                "Regular Checkup"
        );

        // Keep appointment in local list; defer booking in service
        appointments.add(appointment);

        // ========================================
        // MEDICAL RECORDS
        // ========================================

        MedicalRecordService medicalService =
                new MedicalRecordService();

        MedicalRecord record1 = new MedicalRecord(
                "MR001",
                pet1,
                "Fever",
                "Medicine for 5 days",
                "05-07-2026"
        );

        MedicalRecord record2 = new MedicalRecord(
                "MR002",
                pet2,
                "Skin Allergy",
                "Allergy Shampoo",
                "18-07-2026"
        );

                // Keep medical records in local list; defer adding to service
                records.add(record1);
                records.add(record2);

                // flag to control when we populate services (to avoid initial prints)
                final boolean[] servicesInitialized = {false};

                // helper to initialize services when user chooses operations that use them
                final Runnable initServices = () -> {
                        if (!servicesInitialized[0]) {
                                petService.addPet(pet1);
                                petService.addPet(pet2);
                                petService.addPet(pet3);

                                appointmentService.addAppointment(appointment);

                                medicalService.addRecord(record1);
                                medicalService.addRecord(record2);

                                servicesInitialized[0] = true;
                        }
                };

        // ========================================
        // MAIN MENU
        // ========================================

        boolean running = true;

        while (running) {

            System.out.println();
            System.out.println("================================");
            System.out.println("       PET CARE MANAGEMENT");
            System.out.println("================================");
            System.out.println("1. View All Pets");
            System.out.println("2. Search Pet");
            System.out.println("3. View Appointments");
            System.out.println("4. View Medical Records");
            System.out.println("5. View Reports");
            System.out.println("6. Animal Sounds");
            System.out.println("7. Owner Information");
            System.out.println("8. Exit");
            System.out.println("================================");
            System.out.print("Enter your choice: ");

            try {

                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {

                                        case 1:

                                                initServices.run();
                                                petService.displayAllPets();
                                                break;

                                        case 2:

                                                initServices.run();
                                                System.out.print("Enter Pet ID: ");
                                                String petId = scanner.nextLine();

                                                petService.searchPet(petId);
                                                break;

                                        case 3:

                                                initServices.run();
                                                appointmentService.displayAppointments();
                                                break;

                                        case 4:

                                                initServices.run();
                                                medicalService.displayAllRecords();
                                                break;

                    case 5:

                        ReportService reportService =
                                new ReportService(
                                        pets,
                                        appointments,
                                        records
                                );

                        reportService.displayReport();
                        break;

                    case 6:

                        System.out.println();
                        System.out.println("===== ANIMAL SOUNDS =====");

                        pet1.makeSound();
                        pet2.makeSound();
                        pet3.makeSound();

                        break;

                                        case 7:

                                                initServices.run();
                                                owner.displayOwnerInfo();
                                                break;

                    case 8:

                        running = false;
                        System.out.println();
                        System.out.println(
                                "Thank you for using Pet Care Management System!"
                        );

                        break;

                    default:

                        System.out.println(
                                "Invalid choice. Please enter 1-8."
                        );
                }

            } catch (NumberFormatException e) {

                System.out.println(
                        "Invalid input. Please enter a number."
                );
            }
        }

        scanner.close();
    }
}