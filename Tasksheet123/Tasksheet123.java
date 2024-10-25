package Tasksheet123;

public class Tasksheet123 {
    public static void main(String[] args) {

        Book book1 = new Book("Harry Potter and the Half-Blood Prince", "J. K. Rowling", 2005, 1000);
        System.out.println("Book 1:");
        System.out.println(book1);
        
        Book book2 = new Book("Percy Jackson & the Olympians: The Lightning Thief", "Rick Riordan", 2005, 750.50);
        System.out.println("Book 2:");
        System.out.println(book2);
        
        Book book3 = new Book("That Time I Got Reincarnated as a Slime", "Fuse", 2014, 860.99);
        System.out.println("Book 3:");
        System.out.println(book3);
        
    }

}

class Book {

    String title;
    String author;
    int yearPublished;
    double price;

    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Title: \"" + title + "\"\n" +
               "Author: \"" + author + "\"\n" +
               "Year Published: " + yearPublished + "\n" +
               "Price: Php" + String.format("%.2f", price) + "\n";
               
    }

}
