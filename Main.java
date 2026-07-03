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

    }

}