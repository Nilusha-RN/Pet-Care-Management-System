public class Main {

    public static void main(String[] args) {

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

        Owner owner = new Owner(
                "O001",
                "John Perera",
                "0771234567"
        );

        owner.addPet(pet1);
        owner.addPet(pet2);

        owner.displayOwnerInfo();
    }
}