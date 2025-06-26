package Task3;
import java.util.*;
public class Library {
	


	    private List<Book> books = new ArrayList<>();
	    private List<User> users = new ArrayList<>();

	    public void addBook(Book book) {
	        books.add(book);
	        System.out.println("Book added: " + book);
	    }

	    public void registerUser(User user) {
	        users.add(user);
	        System.out.println("User registered: " + user);
	    }

	    public void issueBook(int bookId) {
	        for (Book book : books) {
	            if (book.getId() == bookId) {
	                if (!book.isIssued()) {
	                    book.issueBook();
	                    System.out.println("Book issued successfully: " + book.getTitle());
	                    return;
	                } else {
	                    System.out.println("Book is already issued.");
	                    return;
	                }
	            }
	        }
	        System.out.println("Book not found.");
	    }

	    public void returnBook(int bookId) {
	        for (Book book : books) {
	            if (book.getId() == bookId) {
	                if (book.isIssued()) {
	                    book.returnBook();
	                    System.out.println("Book returned successfully: " + book.getTitle());
	                    return;
	                } else {
	                    System.out.println("Book was not issued.");
	                    return;
	                }
	            }
	        }
	        System.out.println("Book not found.");
	    }

	    public void showBooks() {
	        System.out.println("Books in Library:");
	        for (Book book : books) {
	            System.out.println(book);
	        }
	    }

	    public void showUsers() {
	        System.out.println("Registered Users:");
	        for (User user : users) {
	            System.out.println(user);
	        }
	    }
	}


