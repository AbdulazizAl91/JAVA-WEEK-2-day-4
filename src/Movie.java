public class Movie extends Product{
    private String director;

    public Movie() {
    }

    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public double getDiscount() {
        return (getPrice()-getPrice()*10/100);
    }

    @Override
    public String toString() {
        return "the Movie name " + getName()+ "\ndirector name "+director+ "\nand the price before discount = " + getPrice() +
                "\nand the price after discount = " + getDiscount();
    }
}
