package chapter11_abstraction;

public class Interface_Customer {

    public static void main(String[] args){

        Interface_Product book = new Interface_Book();
        book.setPrice(9.99);
        System.out.println(book.getPrice());
    }
}
