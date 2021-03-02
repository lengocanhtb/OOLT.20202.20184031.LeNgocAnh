import java.util.Scanner;

public class baitap6 {
    // Hàm giải pt bậc nhất 1 ẩn
    public static void PTBN1(double a, double b) {
        if (a == 0 & b == 0)
            System.out.println("Phương trình có vô số nghiệm");
        else if (a == 0 & b != 0)
            System.out.println("Phương trình vô nghiệm");
        else {
            double x = -b / a;
            System.out.println("Phương trình có nghiêm x=" + x);
        }
    }
    // Hàm giải pt bậc nhất 2 ẩn
    public static void PTBN2(double a, double b, double c) {
        double x;
        if (a == 0 & b == 0) {
            if (c == 0)
                System.out.println("Phương trình vô số nghiệm");
            else
                System.out.println("Phương trình vô nghiệm");
        }
        else if (a == 0) {
            System.out.println("Phương trình có dạng by=c với b khác 0");
            x = c / b;
            System.out.println("Phương trình có x thuộc R và nghiêm y=" + x);
        }
        else if (b == 0) {
            System.out.println("Phương trình có dạng ax=c với a khác 0 ");
            x = c / a;
            System.out.print("Phương trình có nghiêm x=" + x);
            System.out.println("và nghiệm y thuộc R");
        }
        else {
            double m = -b / a;
            double n = c / a;
            System.out.print("Phương trình có nghiệm x và y=" + m);
            System.out.println("x+" + n);
        }
    }
    // Hàm giải pt bậc hai
    public static void PTBH(double a, double b, double c) {
        double x;
        if (a == 0) {
            System.out.println("Phương trình có dạng bx+c=0");
            PTBN1(b,c);
        }
        else {
            double denta = b * b - 4 * a * c;
            if (denta < 0)
                System.out.println("Phương trình vô nghiệm");
            else if (denta == 0) {
                x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm duy nhất" + x);
            }
            else {
                double x1 = (-b + Math.sqrt(denta)) / (2 * a);
                double x2 = (-b - Math.sqrt(denta)) / (2 * a);
                System.out.print("Phương trình có 2 nghiệm phân biệt" + x1);
                System.out.println("và" + x2);

            }

        }
    }
    public static void main(String[] args) {
        //giai phuong trinh ax+b=0;
        double a, b, c, x;
        int chon=0;
        Scanner sc = new Scanner(System.in);
        while(chon!=4) {
            System.out.println("1. Phương trình bậc nhất 1 ẩn");
            System.out.println("2. Phương trình bậc nhất 2 ẩn");
            System.out.println("3. Phương trình bậc 2");
            System.out.println("4.Thoát");
            System.out.println("Nhập sự lựa chọn của bạn");
            chon = sc.nextInt();
            switch (chon) {
                case 1: {
                    System.out.println("Phương trình ax+b=0");
                    System.out.println("Mời bạn nhập a và b");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    PTBN1(a,b);
                    break;
                }
                //Giải phương trình bậc nhất 2 ẩn
                case 2: {
                    System.out.println("Phương trình ax+by=c");
                    System.out.println("Mời bạn nhập a,b,c");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    c = sc.nextDouble();
                    PTBN2(a,b,c);
                    break;
                }
                //Giải phương trình bậc hai
                case 3: {
                    System.out.println("Phương trình bậc hai ax^2+bx+c=0");
                    System.out.println("Mời bạn nhập hệ số a,b,c");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    c = sc.nextDouble();
                    PTBH(a,b,c);

                }
                default:
                    break;

            }
        }
    }
}
