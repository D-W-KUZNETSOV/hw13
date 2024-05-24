public class Main {

  public static void main(String[] args) {
    Author book1 = new Author("Александр", "Пушкин");
    Book cockerel = new Book(book1, "Сказка о золотом петушке", 2023);
    cockerel.setYearPublisher(2000);

    Author book2 = new Author("Алексей", "Толстой");
    Book buratino = new Book(book2, "Приключения Буратино", 1985);
    buratino.setYearPublisher(1997);

    System.out.println(book1 + ", " + cockerel);
    System.out.println(book2 + ", " + buratino);
    System.out.println("book1.hashCode() = " + book1.hashCode());
    System.out.println("book2.hashCode() = " + book2.hashCode());
    System.out.println("book1.equals(book2) = " + book1.equals(book2));
    System.out.println("book1.getLastName().equals( book2.getLastName()) = " + book1.getLastName()
        .equals(book2.getLastName()));

  }
}
