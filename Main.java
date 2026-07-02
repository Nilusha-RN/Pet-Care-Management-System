public class Main {

    public static void main(String[] args) {

        System.out.println("=== Pet Care Management System ===");

        Pet pet1 = new Pet(
                "P001",
                "Jimi",
                3,
                "Golden Retriever",
                "Male"
        );

        Pet pet2 = new Pet(
                "P002",
                "Luna",
                2,
                "Persian Cat",
                "Female"
        );

        pet1.displayPetInfo();
        pet2.displayPetInfo();
    }
}