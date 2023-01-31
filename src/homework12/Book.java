package homework12;

import java.util.Objects;

public class Book {
     private String title;
     private int dateOfPublication;
     private Author author;



     public Book (String title, int dateOfPublication, Author author){
         this.title = title;
         this.dateOfPublication = dateOfPublication;
         this.author = author;

     }

    public String getTitle() {
        return title;
    }

    public int getDateOfPublication() {
        return dateOfPublication;
    }

    public Author getAuthor() {
        return author;
    }

    public void setDateOfPublication(int dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }
    @Override
    public String toString(){
         return "Название: " + title + ", " + "Дата публикации: " + dateOfPublication
                 + ", " + "Автор: " + author.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return dateOfPublication == book.dateOfPublication && title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, dateOfPublication, author);
    }
}
