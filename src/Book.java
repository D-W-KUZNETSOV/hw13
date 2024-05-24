import java.util.Objects;

public class Book {


  private String title;
  private int yearPublisher;
  private Author author;

  public Book(Author author, String title, int yearPublisher) {
    this.title = title;
    this.yearPublisher = yearPublisher;
    this.author = author;
  }


  public Author getAuthor() {
    return author;
  }

  public String getTitle() {
    return title;
  }

  public int getYearPublisher() {
    return yearPublisher;
  }



  public void setYearPublisher(int yearPublisher) {
    this.yearPublisher = yearPublisher;
  }

  public String  toString() {
    return this.title + " " + this.yearPublisher;
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
    return yearPublisher == book.yearPublisher;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(yearPublisher);
  }
}

