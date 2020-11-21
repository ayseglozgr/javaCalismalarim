package books;

public class Books {

    private String booksTitle;
    private double price;

    public Books(String title) {
        booksTitle = title;
    }

    public String getBooksTitle() {
        return booksTitle;
    }

    public void setBooksTitle(String booksTitle) {
        this.booksTitle = booksTitle;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String print() {
        return "Title-" + getBooksTitle() + " Cost-$" + getPrice();
    }

}
