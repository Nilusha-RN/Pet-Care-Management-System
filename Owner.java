import java.util.ArrayList;

public class Owner {

    private String ownerId;
    private String ownerName;
    private String phoneNumber;

    private ArrayList<Pet> pets;

    public Owner(String ownerId, String ownerName, String phoneNumber) {

        this.ownerId = ownerId;
        this.ownerName = ownerName;
        this.phoneNumber = phoneNumber;
        this.pets = new ArrayList<>();
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public void displayOwnerInfo() {

        System.out.println("==============================");
        System.out.println("Owner ID : " + ownerId);
        System.out.println("Name     : " + ownerName);
        System.out.println("Phone    : " + phoneNumber);
        System.out.println("==============================");

        System.out.println("Owned Pets");
        System.out.println("------------------------------");

        for (Pet pet : pets) {
            pet.displayPetInfo();
        }
    }
}