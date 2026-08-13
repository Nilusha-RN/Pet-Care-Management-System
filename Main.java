public class Main {

    public static void main(String[] args) {

        // ========================================
        // PET SERVICE
        // ========================================

        PetService petService = new PetService();

        // ========================================
        // INHERITANCE + POLYMORPHISM
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

        Pet[] pets = {pet1, pet2, pet3};

        // ========================================
        // POLYMORPHISM - ANIMAL SOUNDS
        // ========================================

        System.out.println("================================");
        System.out.println("       ANIMAL SOUNDS");
        System.out.println("================================");

        for (Pet pet : pets) {
            pet.makeSound();
        }

        // ========================================
        // PET DETAILS
        // ========================================

        System.out.println("\n================================");
        System.out.println("       PET DETAILS");
        System.out.println("================================");

        for (Pet pet : pets) {
            pet.displayInfo();
        }

        // ========================================
        // ADD PETS TO PET SERVICE
        // ========================================

        petService.addPet(pet1);
        petService.addPet(pet2);
        petService.addPet(pet3);

        petService.displayAllPets();

        // ========================================
        // SEARCH PET
        // ========================================

        petService.searchPet("P002");

        // ========================================
        // OWNER
        // ========================================

        Owner owner = new Owner(
                "O001",
                "John Perera",
                "0771234567"
        );

        owner.addPet(pet1);

        owner.displayOwnerInfo();

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

        appointmentService.addAppointment(appointment);

        appointmentService.displayAppointments();

        appointmentService.searchAppointment("A001");

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

        medicalService.addRecord(record1);
        medicalService.addRecord(record2);

        medicalService.displayAllRecords();

        medicalService.searchRecord("MR002");

        // ========================================
        // REMOVE PET
        // ========================================

        petService.removePet("P003");

        petService.displayAllPets();

        // ========================================
        // PROGRAM END
        // ========================================

        System.out.println("\n================================");
        System.out.println("   PET CARE SYSTEM COMPLETED");
        System.out.println("================================");
    }
}