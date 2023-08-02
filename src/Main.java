
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java for Dummies", 137, "Barry A. Burd");
        System.out.println(book1.toString());
        System.out.println("-------------------------------------------------------------");

       Book book2 = new Book("The Murder of Roger Ackroyd (Hercule Poirot)",37,"Agatha Christie");
        System.out.println(book2.toString());
        System.out.println("-------------------------------------------------------------");

        Movie movie1 = new Movie("The Godfather",40,"Francis Ford Coppola");
        System.out.println(movie1.toString());
        System.out.println("-------------------------------------------------------------");

        Movie movie2 = new Movie("the shawshank redemption",30,"Frank Darabont");
        System.out.println(movie2.toString());


    }
}