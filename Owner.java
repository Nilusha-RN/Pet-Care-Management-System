import java.util.ArrayList;

public class Owner {

    private String ownerId;
    private String ownerName;
    private String phone;
    private ArrayList<Pet> pets;

    public Owner(String ownerId, String ownerName, String phone) {
        this.ownerId = ownerId;
        this.ownerName = ownerName;
        this.phone = phone;
        this.pets = new ArrayList<>();
    }

    public String getOwnerId() {
        return ownerId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getPhone() {
        return phone;
    }

    public void addPet(Pet pet) {
        pets.add(pet);
        System.out.println("Pet added to owner successfully.");
    }

    public void displayOwnerInfo() {

        System.out.println("\n===== Owner Information =====");
        System.out.println("Owner ID   : " + ownerId);
        System.out.println("Owner Name : " + ownerName);
        System.out.println("Phone      : " + phone);
        System.out.println("Pets       : " + pets.size());
    }
}