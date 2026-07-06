public class Bird extends Pet {

    public Bird(String petId,
                String name,
                int age,
                String breed,
                String gender) {

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