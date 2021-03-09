import java.util.Scanner;
public class Lab02_56 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số phần tử của mảng");
        n=sc.nextInt();
        int[] array = new int[n];
        System.out.println("Mời bạn nhập các phần tử mảng");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Mảng của bạn đã nhập:");
        int sum = 0;
        for (int a : array) {
            System.out.print(a + "   ");
            sum= sum + a;
        }
        for(int i=0; i<n;i++){
            for(int j=i;j<(n-1);j++){
                if(array[j]>array[j+1]){
                    int k = array[j];
                    array[j]=array[j+1];
                    array[j+1]=k;
                }
            }
        }
        System.out.println("\n Mảng sau khi sắp xếp");
        for (int a : array) {
            System.out.print(a + "   ");
        }
        System.out.println("\nTổng các phần tử của mảng là: " +sum);
        System.out.println("Trung bình của mảng là:"+ (double)sum/n);

    }
}
