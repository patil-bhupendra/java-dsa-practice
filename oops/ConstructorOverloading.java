package oops;

class Book{
    String title;
    int price;


    Book(String title, int price ){
        this.title = title;
        this.price = price;
    }

    Book(String title){
        this.title = title;
        this.price = 0;
    }

    Book(){
        this.title = "NA";
        this.price = 0;
    }
}

public class ConstructorOverloading {
    public static void main(String args[]){
        Book b1 = new Book ("NA", 500);
        Book b2 = new Book ("Wings Fire");
        Book b3 = new Book ();

        System.out.println(b1.title + " " + b1.price);
        System.out.println(b2.title + " " + b2.price);
        System.out.println(b3.title + " " + b3.price);

    }
}

