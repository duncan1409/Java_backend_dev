package ch13;

public class BitTest {
  public static void main(String[] args) {
    int num1=5;
    int num2=10;

    System.out.println(num1|num2); //비트OR
    System.out.println(num1&num2); //비트AND
    System.out.println(num1^num2); //비트XOR
    System.out.println(~num1);

    System.out.println(num1<<2); //비트이동
    System.out.println(num1);
    System.out.println(num1<<=2); //비트이동 후 대입... 바뀜
    System.out.println(num1);

  }
}
