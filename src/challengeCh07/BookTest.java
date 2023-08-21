package challengeCh07;

import java.util.Arrays;

public class BookTest {
  public static void main(String[] args) {
    Book[] books = {
        new Book(15000),
        new Book(50000),
        new Book(20000)
    };

    System.out.println("정렬 전");
    for (Book book : books) {
      System.out.println(book);
    }

//    Arrays.sort(books, new Comparator<Book>() {
//      @Override
//      public int compare(Book o1, Book o2) {
//        return Integer.compare(o1.getPrice(), o2.getPrice());
//      }
//    });

    Arrays.sort(books);

    System.out.println("\n정렬 후");
    for (Book book : books) {
      System.out.println(book);
    }

  }
}

class Book implements Comparable<Book>{
  int price;

  public Book(int price) {
    this.price = price;
  }

  @Override
  public int compareTo(Book book) {
    return this.price - book.price;
  }

  @Override
  public String toString() {
    return "Book [" + "price=" + price + "]";
  }
}
