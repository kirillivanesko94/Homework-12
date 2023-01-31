package homework12;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Александр", "Пушкин");
        Author author2 = new Author("Михаил", "Лермонтов");

        Book book1 = new Book("Евгений Онегин", 1833, author1);
        Book book2 = new Book("Герой нашего времени", 1850, author2);

        book2.setDateOfPublication(1840);

        System.out.println("book1 = " + book1.getDateOfPublication());
        System.out.println("book2 = " + book2.getDateOfPublication());


    }
}