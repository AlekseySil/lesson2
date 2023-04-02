public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Иван Тургенев");
        Author author2 = new Author("Михаил Лермонтов");

        Book book1 = new Book(author1, "Отцы и дети", 1862);
        Book book2 = new Book(author1, "Отцы и дети", 1863);

        book1.setYear(1863);

        Book book3 = new Book(author2, "Герой нашего времени", 1810);

        System.out.println(author1.toString());
        System.out.println(book1.toString());

        System.out.println(book1.equals(book2));
        System.out.println(book2.equals(book3));

        System.out.println(author2.hashCode());
        System.out.println(book3.hashCode());

    }
}