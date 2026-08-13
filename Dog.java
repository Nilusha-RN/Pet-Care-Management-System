public class Dog extends Pet {

    public Dog(protected String petId;
protected String name;
protected int age;
protected String breed;
protected String gender;) {
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