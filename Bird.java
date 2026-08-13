public class Bird extends Pet {

    public Bird(
        protected String petId;
        protected String name;
        protected int age;
        protected String breed;
        protected String gender;
    ) {
        super(petId, name, age, breed, gender);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Chirp Chirp!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Animal Type : Bird");
        System.out.println();
    }
}