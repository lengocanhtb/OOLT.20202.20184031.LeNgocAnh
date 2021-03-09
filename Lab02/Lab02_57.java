import java.util.Scanner;

public class Lab02_57 {
    public static void Inmang(int arr[][], int m, int n){
        for(int i=0; i<m;i++){
            for(int j=0; j<n ; j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
    public static void Nhapmang(int arr[][], int m, int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<m;i++){
            for(int j = 0; j < n; j++){
                arr[i][j]= sc.nextInt();
            }
        }
    }
    public static void Tong(int arr1[][], int arr2[][], int m, int n){
        int[][] tong = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0;j<n;j++){
                tong[i][j]= arr1[i][j]+arr2[i][j];
                System.out.print(tong[i][j] + "  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;
        System.out.println(" Nhập kích thước ma trận theo thứ tự số hàng, số cột");
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] arr1 = new int[m][n];
        int[][] arr2 = new int[m][n];
        System.out.println("Nhập mảng 1");
        Nhapmang(arr1,m,n);
        System.out.println("Nhập mảng 2");
        Nhapmang(arr2,m,n);
        System.out.println("Hai ma trận đã nhập là:");
        System.out.println("Mảng 1");
        Inmang(arr1,m,n);
        System.out.println("Mảng 2");
        Inmang(arr2,m,n);
        System.out.println("Tổng của 2 ma trận là");
        Tong(arr1,arr2,m,n);

    }
}
