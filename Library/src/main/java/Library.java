import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;
    private int capacity;

    public Library(int capacity){
        this.stock = new ArrayList();
        this.capacity = capacity;
    }

    public int countStock() {
        return this.stock.size();
    }

    public void addBook(Book book) {
        if (this.countStock() < this.getCapacity()) {
            this.stock.add(book);
        }
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int findBookIndex(Book book){
        return this.stock.indexOf(book);
    }

    public Book removeBook(Book book){
        int index = this.findBookIndex(book);
        return this.stock.remove(index);
    }

}