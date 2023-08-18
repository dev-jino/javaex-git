package chapter08Problem;

public class DatabaseExample {
  public static void main(String[] args) {
//    Mysql mysql = new Mysql();
//    mysql.use();
//    mysql.use();
//    mysql.use();

//    Oracle oracle = new Oracle();
//    oracle.use();
//    oracle.use();
//    oracle.use();

    Database database = new Mysql();
    database.use();
    database.use();
    database.use();

    database = new Oracle();
    database.use();
    database.use();
    database.use();
  }
}
