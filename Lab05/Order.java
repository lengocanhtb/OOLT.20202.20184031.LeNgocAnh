package hust.soict.hedspi.aims.order;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.utils.MyDate;

import java.util.Objects;
import java.util.Scanner;

public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
    public static final int MAX_LIMITED_ORDERS = 5;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered=0;    //Để theo dõi có bao nhiêu DigitalVideoDiscs trong đơn đặt hàng
    public int getQtyOrdered() {
        return qtyOrdered;
    }
    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }
    // Ngày đặt hàng
    private MyDate dateOrdered = new MyDate();
    public MyDate getDateOrdered() {
        return dateOrdered;
    }
    public void setDateOrdered(MyDate dateOrdered) {
        this.dateOrdered.getdate();
    }
    // số lượng đơn order
    private static int nbOrders = 0;
    public static int getNbOrders() {
        return nbOrders;
    }
    public static void setNbOrders(int nbOrders) {
        Order.nbOrders = nbOrders;
    }
    private float total=0;
    // Thêm dvd
    public void addDigitalVideoDisc(DigitalVideoDisc dvd){
        if(this.getQtyOrdered()>MAX_NUMBERS_ORDERED)
            System.out.println("Full! Don't add!");
        else {
            this.itemsOrdered[this.getQtyOrdered()] = dvd;
            this.setQtyOrdered(this.getQtyOrdered()+1);
            System.out.println("Added!");
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        if (this.getQtyOrdered() < MAX_NUMBERS_ORDERED && (dvdList.length + this.getQtyOrdered()) <= MAX_NUMBERS_ORDERED) {
            for (int i = 0; i < dvdList.length; i++) {
                itemsOrdered[this.getQtyOrdered()] = dvdList[i];
                this.setQtyOrdered(this.getQtyOrdered() + 1);
                if (this.getQtyOrdered() == MAX_NUMBERS_ORDERED) {
                    System.out.println("Order is full!");
                    break;
                }
            }
        }
        else if (this.getQtyOrdered() > MAX_NUMBERS_ORDERED) {
            System.out.println("Order is full");
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        if(this.getQtyOrdered()<MAX_NUMBERS_ORDERED){
            itemsOrdered[this.getQtyOrdered()]=dvd1;
            this.setQtyOrdered(this.qtyOrdered+1);
            if(this.getQtyOrdered()<MAX_NUMBERS_ORDERED){
                itemsOrdered[this.getQtyOrdered()]= dvd2;
                this.setQtyOrdered(this.getQtyOrdered()+1);
            }
            else System.out.println("The dvd"+dvd2.getTitle()+"could not be added");
        }
        else System.out.println("Full! The dvd Could not be added");
    }
    //Xóa dvd ra khỏi danh sách
    public void removeDigitalVideoDisc() {
        System.out.println("Bạn muốn xóa dvd nào, vui lòng nhập tên");
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        for (int i = 0; i < this.getQtyOrdered(); i++) {
            if (Objects.equals(itemsOrdered[i].getTitle(),st)) {
                for (int j = i; j < this.getQtyOrdered() ; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                this.setQtyOrdered(this.getQtyOrdered()-1);
                total=total- itemsOrdered[i].getCost();
                System.out.println("Đã xóa");
            }
        }
    }
    public float totalCost(){
        System.out.println("hello");
        for(int i=0; i<this.getQtyOrdered();i++) {
            total=total+itemsOrdered[i].getCost();
        }
        return total;
    }
    public void detailOrder(){
        System.out.println("****************Đặt hàng****************");
        System.out.println("Date: " +dateOrdered);
        System.out.println("Order Items:");
        for( int i= 0; i< this.getQtyOrdered(); i++){
            System.out.println((i+1)+"DVD-"+itemsOrdered[i].getTitle());
        }
        System.out.println("Total: " +totalCost());
    }
}
