public class Dog extends Pet {

    public Dog(String petId,
               String name,
               int age,
               String breed,
               String gender) {

        super(petId, name, age, breed, gender);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof Woof!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Animal Type : Dog");
        System.out.println();
    }
}