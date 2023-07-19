public class Test0 {
  public static void main(String[] args) {
    /*Test1 test1 = new Test1();
    for (int index = 0; index < 5; index++) {
      System.out.println("Следующее значение " + test1.getNext());
    }
    System.out.println ("Сброс");
    test1.reset();
    System.out.println("Начальное значение 100");
    test1.setNum(100);
    for (int index = 0; index < 5; index++) {
      System.out.println("Следующее значение " + test1.getNext());
    }*/

    Test2 test2 = new Test2();
    for (int index = 0; index < 5; index++) {
      System.out.println("Следующее значение " + test2.getNext());
    }
    System.out.println ("Сброс");
    test2.reset();
    System.out.println("Начальное значение 100");
    test2.setNum(100);
    for (int index = 0; index < 5; index++) {
      System.out.println("Следующее значение " + test2.getNext());
    }
  }
}
