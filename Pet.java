public class Pet {

    protected String petId;
    protected String name;
    protected int age;
    protected String breed;
    protected String gender;

    public Pet(String petId, String name, int age, String breed, String gender) {
        this.petId = petId;
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.gender = gender;
    }

    public String getPetId() {
        return petId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public String getGender() {
        return gender;
    }

    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }

    public void displayInfo() {
        System.out.println("------------------------------");
        System.out.println("Pet ID : " + petId);
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Breed  : " + breed);
        System.out.println("Gender : " + gender);
        System.out.println("------------------------------");
    }

    // Keep compatibility with previous days
    public void displayPetInfo() {
        displayInfo();
    }
}