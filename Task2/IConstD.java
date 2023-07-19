package Task2;

public class IConstD implements IConst {

  public static void main(String[] args) {

  int[] nums = new int [MAX];
  for (int index = MIN; index < 11; index++) {
    if (index>=MAX) {
      System.out.println (ERROR);
    } else {
      nums [index] = index;
      System.out.println(nums [index]);
    }
  }
}
 
}


