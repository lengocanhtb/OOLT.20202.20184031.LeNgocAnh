import java.util.Scanner;

public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered;
    int count=0;
    float total=0;

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd){
        this.itemsOrdered[count]=dvd;
        this.count++;
        total=total+dvd.getCost();
    }
    public void removeDigitalVideoDisc(){
        System.out.println("Bạn muốn xóa dvd nào, vui lòng nhập tên");
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        for(int i=0; i<count;i++){
            if(itemsOrdered[i].getTitle()==st){
                for (int j=i;j<count-1;j++){
                    itemsOrdered[i] = itemsOrdered[i+1];
                count--;
                }
            }
        }

    }
    public float totalCost(){
        return total;
    }

}
