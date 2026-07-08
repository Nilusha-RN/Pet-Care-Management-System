public class Pet {

    // Private variables (Encapsulation)
    private String petId;
    private String name;
    private int age;
    private String breed;
    private String gender;

    // Constructor with validation
    public Pet(String petId, String name, int age, String breed, String gender) {

        this.petId = petId;
        setName(name);
        setAge(age);
        this.breed = breed;
        this.gender = gender;
    }

    // Getters
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

    // Setters with validation
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Invalid name! Setting default value.");
            this.name = "Unknown";
        } else {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age < 0 || age > 25) {
            System.out.println("Invalid age! Setting age to 0.");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // Method
    public void displayInfo() {
        System.out.println("----------------------");
        System.out.println("ID    : " + petId);
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Breed : " + breed);
        System.out.println("Gender: " + gender);
    }
}