public class Pet {


    private String petId;
    private String name;
    private int age;
    private String breed;
    private String gender;

    public Pet(String petId, String name, int age, String breed, String gender) {
        this.petId = petId;
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.gender = gender;
    }


    public void displayPetInfo() {
        System.out.println("------------------------------");
        System.out.println("Pet ID : " + petId);
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Breed  : " + breed);
        System.out.println("Gender : " + gender);
        System.out.println("------------------------------");
    }
}