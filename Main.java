public class Main {

    public static void main(String[] args) {

        PetService petService = new PetService();

        Pet pet1 = new Pet("P001","Buddy",3,"Golden Retriever","Male");
        Pet pet2 = new Pet("P002","Luna",2,"Persian Cat","Female");
        Pet pet3 = new Pet("P003","Max",1,"Beagle","Male");

        petService.addPet(pet1);
        petService.addPet(pet2);
        petService.addPet(pet3);

        petService.displayAllPets();

        petService.searchPet("P002");

        petService.removePet("P001");

        petService.displayAllPets();

        
        Owner owner = new Owner(
                "O001",
                "John Perera",
                "0771234567"
        );

        owner.addPet(pet1);

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

