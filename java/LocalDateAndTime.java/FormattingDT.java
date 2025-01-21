import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingDT {
    public static void main(String[] args) {
        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println("Before formating: " + myDateTime);
        DateTimeFormatter myOwn = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss");

        String NewFormat = myDateTime.format(myOwn);
        System.out.println("After formatting: " + NewFormat);
    }
}