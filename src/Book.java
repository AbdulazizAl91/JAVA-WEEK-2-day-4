public class Book extends Product{
    private String author;

    public Book() {
    }


    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    @Override
    public double getDiscount() {
        return (getPrice()-getPrice()*15/100);
    }

    @Override
    public String toString() {
        return "the book name " + getName()+ "\nauthor name "+author+ "\nand the price before discount = " + getPrice() +
                "\nand the price after discount = " + getDiscount();
    }
}
