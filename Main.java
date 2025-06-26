package Task3;
import java.util.Scanner;

public class Main {
	

	
	    public static void main(String[] args) {
	        Library library = new Library();
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\nLibrary Management System");
	            System.out.println("1. Add Book");
	            System.out.println("2. Register User");
	            System.out.println("3. Issue Book");
	            System.out.println("4. Return Book");
	            System.out.println("5. Show All Books");
	            System.out.println("6. Show All Users");
	            System.out.println("0. Exit");
	            System.out.print("Enter your choice: ");

	            choice = scanner.nextInt();
	            scanner.nextLine(); // consume newline

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter Book ID: ");
	                    int bookId = scanner.nextInt();
	                    scanner.nextLine();
	                    System.out.print("Enter Title: ");
	                    String title = scanner.nextLine();
	                    System.out.print("Enter Author: ");
	                    String author = scanner.nextLine();
	                    library.addBook(new Book(bookId, title, author));
	                    break;

	                case 2:
	                    System.out.print("Enter User ID: ");
	                    int userId = scanner.nextInt();
	                    scanner.nextLine();
	                    System.out.print("Enter User Name: ");
	                    String name = scanner.nextLine();
	                    library.registerUser(new User(userId, name));
	                    break;

	                case 3:
	                    System.out.print("Enter Book ID to issue: ");
	                    int issueId = scanner.nextInt();
	                    library.issueBook(issueId);
	                    break;

	                case 4:
	                    System.out.print("Enter Book ID to return: ");
	                    int returnId = scanner.nextInt();
	                    library.returnBook(returnId);
	                    break;

	                case 5:
	                    library.showBooks();
	                    break;

	                case 6:
	                    library.showUsers();
	                    break;

	                case 0:
	                    System.out.println("Exiting system...");
	                    break;

	                default:
	                    System.out.println("Invalid choice.");
	            }
	        } while (choice != 0);

	        scanner.close();
	    }
	}



