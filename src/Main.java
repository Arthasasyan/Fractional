import java.io.FileNotFoundException;

public class Main {
  public static void main(String[] args)
  {
    FractionalList list1 = new FractionalList();
    FractionalList list2 = new FractionalList();
    try {
      list1.read("C:\\Intelij Idea\\Fractional_Lab1\\src\\polynom1.txt");
      list2.read("C:\\Intelij Idea\\Fractional_Lab1\\src\\polynom2.txt");
    }
    catch (Exception e)
    {
      System.out.println(e);
    }
    Polynom polynom = new Polynom(list1);
    System.out.println(polynom.sum(new Polynom(list2)));
  }
}
