import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Lab02_55 {
    public static int Kiemtra(int nam){
        int k;   // k=1 là năm nhuận; k=0 không là năm nhuận
        if((nam%4==0)&&(nam%100==0)){
            if(nam%400==0) k=1;
            else k=0;
        }
        else if((nam%4==0)&&(nam%100!=0))
            k=1;
        else k=0;
        return k;
    }
    public static void main(String[] args) {
        String chon;
        int nam;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập năm bạn muốn xem thông tin");
        nam = sc.nextInt();
        while (nam<=0){
            System.out.println("Năm không hợp lệ");
            nam = sc.nextInt();
        }
        System.out.println("Nhập tháng bạn muốn xem thông tin");
        System.out.println();
        chon = sc.nextLine();
        switch (chon){
            case "1": case "Jan": case "January": case "Jan.":
            case "3": case "Mar": case "March": case "Mar.":
            case "5": case "May": case "May.":
            case "7": case "Jul": case "July": case "Jul.":
            case "8": case "Aug": case "August": case "Aug.":
            case "10": case "Oct": case "October": case "Oct.":
            case "12": case "Dec": case "December": case "Dec.":
                System.out.println("Tháng này có 31 ngày");
                break;
            case "4": case "Apr": case "April": case "Apr.":
            case "6": case "Jun": case "June": case "Jun.":
            case "9": case "Sep": case "September": case "Sep.":
            case "11": case "Nov": case "November": case "Nov.":
                System.out.println("Tháng  này có 30 ngày");
                break;
            case "2": case "Feb": case "February": case "Feb.":{
                int k=Kiemtra(nam);
                if(k==0) System.out.println("Tháng này có 28 ngày");
                else System.out.println("Tháng này có 29 ngày");
                break;

            }
            default: break;

        }
    }
}
