import java.awt.*;
import java.util.Date;


public class LearnHit {
    public static void main(String[] args){

        Animal a  = new Animal();
        String dog =  Animal.iAmDog();
        System.out.println(dog); 

        Date now = new Date();
        System.out.println(now);

        Point point1 = new Point(1, 2);
        Point point2 = point1;
        System.out.println(point2);
    }
   
}


