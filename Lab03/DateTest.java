import java.text.ParseException;
public class DateTest {
    public static void main(String[] args) throws ParseException {
     MyDate d = new MyDate();
     d.setYear(2000);
     d.setMonth(2);
     d.setDay(4);
     d.currentDate();
     d.getdate();
     d.printDate();
     d.aceptaccount();
     d.printDate();
    }
}
