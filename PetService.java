import java.util.ArrayList;

public class PetService {

    private ArrayList<Pet> petList;

    public PetService() {
        petList = new ArrayList<>();
    }

    // Add Pet
    public void addPet(Pet pet) {
        petList.add(pet);
        System.out.println(pet.getName() + " added successfully.");
    }

    // Display All Pets
    public void displayAllPets() {

        if (petList.isEmpty()) {
            System.out.println("No pets available.");
            return;
        }

        System.out.println("\n===== Pet List =====");

        for (Pet pet : petList) {
            pet.displayPetInfo();
        }
    }

    // Search Pet
    public void searchPet(String petId) {

        boolean found = false;

        for (Pet pet : petList) {

            if (pet.getPetId().equalsIgnoreCase(petId)) {

                System.out.println("\nPet Found");
                pet.displayPetInfo();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Pet not found.");
        }
    }

    // Remove Pet
    public void removePet(String petId) {

        for (Pet pet : petList) {

            if (pet.getPetId().equalsIgnoreCase(petId)) {

                petList.remove(pet);
                System.out.println("Pet removed successfully.");
                return;
            }
        }

        System.out.println("Pet not found.");
    }

}