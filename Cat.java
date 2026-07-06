public class Cat extends Pet {

    public Cat(String petId,
               String name,
               int age,
               String breed,
               String gender) {

        super(petId, name, age, breed, gender);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow Meow!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Animal Type : Cat");
        System.out.println();
    }
}