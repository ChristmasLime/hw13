import java.util.Objects;

public class Book {
    @Override
    public String toString() {
        return "Книга: "+ nameBook +"\nГод издания: "+yearPrint;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPrint == book.yearPrint && nameBook.equals(book.nameBook) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, yearPrint, author);
    }

    private final String nameBook;
    private int yearPrint;

    private final Author author;

    public Book (String nameBook,Author author,int yearPrint) {
        this.nameBook = nameBook;
        this.yearPrint = yearPrint;
        this.author = author;
    }
    public Author getAuthor(){
        return this.author;
    }
    public String getNameBook(){
        return this.nameBook;
    }
    public int getYearPrint(){
        return this.yearPrint;
    }
    public void setYearPrint (int yearPrint){
        this.yearPrint=yearPrint;
    }



}




