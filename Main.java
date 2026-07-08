public class Main {

    public static void main(String[] args) {

        
        Pet pet1 = new Pet("P001", "Buddy", 3, "Golden Retriever", "Male");

        
        Pet pet2 = new Pet("P002", "", -5, "Persian Cat", "Female");

        pet1.displayInfo();
        pet2.displayInfo();

        
        pet1.setName("Max");
        pet1.setAge(10);

        System.out.println("\nAfter updates:");
        pet1.displayInfo();
    }
}