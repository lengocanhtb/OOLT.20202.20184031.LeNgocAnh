import java.util.Scanner;

public class baitap5 {
    public static void main(String[] args) {
        double num1, num2,sum,hieu, tich,thuong;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập số thứ nhất:");
        num1 = sc.nextDouble();
        System.out.println("Nhập số thứ hai:");
        num2 = sc.nextDouble();
        sc.close();
        sum = num1 + num2 ;
        hieu = num1 - num2;
        tich = num1*num2;
        thuong = num1/num2;
        System.out.println("Tổng của 2 số là " +sum);
        System.out.println("Hiệu của hai số là " +hieu);
        System.out.println("Tích của 2 só là " +tich);
        System.out.println("Thương của 2 số là " +thuong);
        if(num1 % num2==0)
        System.out.println("Số thứ 2 là ước của số thứ nhất");
        else System.out.println("Số thứ 2 không là ước của số thứ nhất");

    }
}