import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MyDate {
    public int day;
    public int month;
    public int year;

    public void currentDate() {
        Calendar c = Calendar.getInstance();
        this.year = c.get(Calendar.YEAR);
        this.month = c.get(Calendar.MONTH);
        this.day = c.get(Calendar.DAY_OF_MONTH);
    }
    public String getdate(){
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String dateString  = df.format(date);
        System.out.println("Date" + dateString);
        return dateString;

    }
    public void aceptaccount() throws ParseException {
        String dateString;
        System.out.println("Nhập ngày dạng dd/mm/yyyy");
        Scanner sc = new Scanner(System.in);
        dateString=sc.next();
        System.out.println("dateString = " + dateString);

        // String ==> Date
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(dateString);
        System.out.println("date1 = " + date1);

        }
    public void printDate(){
        Date date = new Date();
        System.out.printf("%1$s %2$tB %2$td, %2$tY",
                "Ngày hiện tại:", date);

    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if((day>0)&&(day<32))
        this.day = day;
        else System.out.println("Error");
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if((month>0)&&(month<12))
        this.month = month;
        else System.out.println("Error");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year>0)
        this.year = year;
        else System.out.println("Error");
    }
}



