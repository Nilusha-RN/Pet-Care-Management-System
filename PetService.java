import java.util.ArrayList;

public class PetService {

    private ArrayList<Pet> pets;

    public PetService() {
        pets = new ArrayList<>();
    }

    public void addPet(Pet pet) {
        pets.add(pet);
        System.out.println("Pet added successfully.");
    }

    public void displayAllPets() {

        if (pets.isEmpty()) {
            System.out.println("No pets available.");
            return;
        }

        System.out.println("\n===== All Pets =====");

        for (Pet pet : pets) {
            pet.displayInfo();
        }
    }

    public void searchPet(String petId) {

        for (Pet pet : pets) {

            if (pet.getPetId().equalsIgnoreCase(petId)) {
                System.out.println("\n===== Pet Found =====");
                pet.displayInfo();
                return;
            }
        }

        System.out.println("Pet not found.");
    }

    public void removePet(String petId) {

        boolean removed = pets.removeIf(
                pet -> pet.getPetId().equalsIgnoreCase(petId)
        );

        if (removed) {
            System.out.println("Pet removed successfully.");
        } else {
            System.out.println("Pet not found.");
        }
    }
}