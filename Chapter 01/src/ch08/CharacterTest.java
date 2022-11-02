package ch08;
//Encoding: 'A'->65
//Decoding: 65->'A'
public class CharacterTest {
  public static void main(String[] args) {
    char ch1='A';
    System.out.println(ch1);
    System.out.println((int)ch1); //int로 표기

    char ch2=66;
    System.out.println(ch2); //int로 표기

    int ch3=67;
    System.out.println(ch3);
    System.out.println((char)ch3);

    //char ch4=-66 음수는 대입 불가능!

    char ch5='한';
    char ch6='\uD55C';

    System.out.println(ch5);
    System.out.println(ch6);




  }
}
