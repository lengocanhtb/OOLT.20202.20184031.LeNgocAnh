package hust.soict.hedspi.aims.disc;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc();
        jungleDVD.setTitle("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc();
        cinderellaDVD.setTitle("Cinderella");
        swap(jungleDVD, cinderellaDVD);
        System.out.println("Jungle dvd Title: " + jungleDVD.getTitle());
        System.out.println("Cinderella dvd Title: " + cinderellaDVD.getTitle());
        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("Jungle dvd title: " + jungleDVD.getTitle());
    }
    public static void swap(Object o1, Object o2){
        DigitalVideoDisc d1 = (DigitalVideoDisc)o1;
        DigitalVideoDisc d2 = (DigitalVideoDisc) o2;
        if(d1 != null){
            //Kiểm tra xem có ép kiểu o2 về d2 hay không?
            String tmp = d1.getTitle( );
            d1.setTitle(d2.getTitle( ) );
            d2.setTitle(tmp);

        }

    }
    public static void changeTitle(DigitalVideoDisc dvd, String title){
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc();
        dvd.setTitle(oldTitle);
    }
}

