
package homework_4;
import java.util.Scanner;
public class Homework_4 {

   
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        WorkshopRegistration registration = new WorkshopRegistration();

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        try {
         
            registration.registerParticipant(name, age);
        } catch (InvalidAgeException e) {
           
            
            System.out.println("Error: " + e.getMessage());
        } finally {
       
            scanner.close();
        }
        }
    }

    
    

