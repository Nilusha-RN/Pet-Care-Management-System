public class Pet {

    private String petId;
    private String name;
    private int age;
    private String breed;
    private String gender;

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

    public void setName(String name) {

        try {
            if (name == null || name.trim().isEmpty()) {
                throw new IllegalArgumentException("Name cannot be empty");
            }
            this.name = name;

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            this.name = "Unknown";
        }
    }

    public void setAge(int age) {

        try {
            if (age < 0 || age > 30) {
                throw new IllegalArgumentException("Age must be between 0 and 30");
            }
            this.age = age;

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            this.age = 0;
        }
    }

    public void displayInfo() {
        System.out.println("----------------------");
        System.out.println("ID   : " + petId);
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println("Breed: " + breed);
        System.out.println("Gender: " + gender);
    }
}