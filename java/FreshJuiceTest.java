import java.util.Scanner;
class FreshJuice {
enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }
    FreshJuiceSize size;
 }
 public class FreshJuiceTest {
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    FreshJuice juice = new FreshJuice();
 
    System.out.println("What size do you want");
    String FreshJuiceSize = input.next(); 
    System.out.println("This is a " + FreshJuiceSize + " sized freshjuice");
} }