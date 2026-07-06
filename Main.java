public class Main {

    public static void main(String[] args) {

        // ---------- Pet Service ----------
        PetService petService = new PetService();

        // Polymorphism (Dog, Cat, Bird)
        Pet pet1 = new Dog("P001", "Buddy", 3, "Golden Retriever", "Male");
        Pet pet2 = new Cat("P002", "Luna", 2, "Persian Cat", "Female");
        Pet pet3 = new Bird("P003", "Max", 1, "Parrot", "Male");

        Pet[] pets = {pet1, pet2, pet3};

        System.out.println("=== Animal Sounds ===\n");

        for (Pet pet : pets) {
            pet.makeSound();
        }

        System.out.println("\n=== Pet Details ===\n");

        for (Pet pet : pets) {
            pet.displayInfo();
        }

        petService.addPet(pet1);
        petService.addPet(pet2);
        petService.addPet(pet3);

        petService.displayAllPets();

        petService.searchPet("P002");

        petService.removePet("P001");

        petService.displayAllPets();

        // ---------- Direct Calls ----------
        System.out.println("\n=== Animal Sounds (Direct) ===");

        pet1.makeSound();
        pet2.makeSound();
        pet3.makeSound();

        System.out.println("\n=== Animal Details (Direct) ===");

        pet1.displayInfo();
        pet2.displayInfo();
        pet3.displayInfo();

        // ---------- Owner ----------
        Owner owner = new Owner(
                "O001",
                "John Perera",
                "0771234567"
        );

        owner.addPet(pet1);

        // ---------- Appointment ----------
        AppointmentService appointmentService = new AppointmentService();

        Appointment appointment = new Appointment(
                "A001",
                pet1,
                owner,
                "15-07-2026",
                "10.00 AM",
                "Regular Checkup"
        );

        appointmentService.addAppointment(appointment);
        appointmentService.displayAppointments();
        appointmentService.searchAppointment("A001");

        // ---------- Medical Records ----------
        MedicalRecordService medicalService = new MedicalRecordService();

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

        medicalService.addRecord(record1);
        medicalService.addRecord(record2);

        medicalService.displayAllRecords();
        medicalService.searchRecord("MR002");
    }
}