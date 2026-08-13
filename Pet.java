public class Pet {

    protected String petId;
    protected String name;
    protected int age;
    protected String breed;
    protected String gender;

    public Pet(String petId, String name, int age, String breed, String gender) {
        this.petId = petId;
        setName(name);
        setAge(age);
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

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            this.name = "Unknown";
        } else {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
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

    public void displayPetInfo() {
        displayInfo();
    }
}