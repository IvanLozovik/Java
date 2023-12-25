import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Set<Notebook> books = new HashSet<>();

        Notebook book1 = new Notebook();
        book1.brand = "Samsung";
        book1.ram = 16;
        book1.hdd = 512;
        book1.os = "Linux";
        book1.color = "black";
        book1.price = 2500;
        
        Notebook book2 = new Notebook();
        book2.brand = "Lenovo";
        book2.ram = 8;
        book2.hdd = 256;
        book2.os = "DOS";
        book2.color = "gray";
        book2.price = 800;
        
        Notebook book3 = new Notebook();
        book3.brand = "Asus";
        book3.ram = 16;
        book3.hdd = 256;
        book3.os = "Windows";
        book3.color = "gray";
        book3.price = 2000;
        
        Notebook book4 = new Notebook();
        book4.brand = "HP";
        book4.ram = 16;
        book4.hdd = 320;
        book4.os = "Linux";
        book4.color = "black";
        book4.price = 2200;
        
        Notebook book5 = new Notebook();
        book5.brand = "Lenovo";
        book5.ram = 8;
        book5.hdd = 256;
        book5.os = "Linux";
        book5.color = "black";
        book5.price = 1600;
        
        Notebook book6 = new Notebook();
        book6.brand = "Apple";
        book6.ram = 32;
        book6.hdd = 512;
        book6.os = "MacOs";
        book6.color = "white";
        book6.price = 5000;
        
        Notebook book7 = new Notebook();
        book7.brand = "Asus";
        book7.ram = 32;
        book7.hdd = 1024;
        book7.os = "Windows";
        book7.color = "black";
        book7.price = 3500;
        
        Notebook book8 = new Notebook();
        book8.brand = "Lenovo";
        book8.ram = 8;
        book8.hdd = 512;
        book8.os = "DOS";
        book8.color = "gray";
        book8.price =1800;
        
        Notebook book9 = new Notebook();
        book9.brand = "Samsung";
        book9.ram = 16;
        book9.hdd = 512;
        book9.os = "Linux";
        book9.color = "black";
        book9.price = 2500;   

        // System.out.println(book1);
        // System.out.println(book2);
        // System.out.println(book3);
        // System.out.println(book4);
        // System.out.println(book5);
        // System.out.println(book6);
        // System.out.println(book7);
        // System.out.println(book8);

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
        books.add(book8);
        books.add(book9);
        
        printSet(books);

    }
    static void printSet(Set<Notebook> books){
        for (Notebook book: books){
            System.out.println(book);
        }
    }    
}     