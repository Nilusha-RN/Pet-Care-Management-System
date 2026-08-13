public class Cat extends Pet {

    public Cat(protected String petId;
protected String name;
protected int age;
protected String breed;
protected String gender;) {
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