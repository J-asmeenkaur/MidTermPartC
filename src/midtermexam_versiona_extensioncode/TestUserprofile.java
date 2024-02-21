/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;
/**
 *
 * @author jasme
 */
public class TestUserprofile {
    

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.println("Choose your favorite genre:");
            System.out.println("1. horror");
            System.out.println("2. Comedy");
            System.out.println("3. fiction");
            System.out.println("4. Sci-Fi");
            System.out.println("5. fantasy");
            
            // Get user input for name and genre choice
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.print("Enter the number corresponding to your favorite genre: ");
            int genreChoice = scanner.nextInt();
            
            String genre;
            switch (genreChoice) {
                case 1:
                    genre = "horror";
                    break;
                case 2:
                    genre = "Comedy";
                    break;
                case 3:
                    genre = "fiction";
                    break;
                case 4:
                    genre = "Sci-Fi";
                    break;
                case 5:
                    genre = "fantasy";
                    break;
                default:
                    genre = "unknown";
            }
            
            // Display confirmation message
            System.out.println("User profile created successfully!");
            System.out.println("Name: " + name);
            System.out.println("Favorite Genre: " + genre);
        }
    }
}

