package ch09;

public class LocalVariableType {
  public static void main(String[] args) {
    var i=10;
    var j=10.0;
    var str="hello";

    System.out.println(i);
    System.out.println(j);
    System.out.println(str);

    str="test";
    //str=3; //var 한번 선언되면 다른 자료형으로 변환은 불가.
  }
}
