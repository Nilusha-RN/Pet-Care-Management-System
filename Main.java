import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Pet ID: ");
            String id = scanner.nextLine();

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Age: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter Breed: ");
            String breed = scanner.nextLine();

            System.out.print("Enter Gender: ");
            String gender = scanner.nextLine();

            Pet pet = new Pet(id, name, age, breed, gender);

            System.out.println("\nPet Created Successfully!");
            pet.displayInfo();

        } catch (NumberFormatException e) {
            System.out.println("Error: Age must be a number!");

        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }

        scanner.close();
    }
}