import java.util.Scanner;
public class Lab02_54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhập vào số cạnh của tam giác");
        n = sc.nextInt();
        System.out.println(" Vẽ tam giác" +n+"cạnh");
        for (int i=1; i<=n;i++){
            for(int j=1;j<=(n-i);j++)
                System.out.print(" ");
            for(int j=1; j<=(2*i-1); j++)
                System.out.print("*");
            System.out.print("\n");
        }

    }
}
