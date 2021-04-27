package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private Track tracks = new Track();
    public CompactDisc(String title, String category) {
        super(title,category);
    }

    public String getArtist() {
        return artist;
    }
    public void addTrack(String trackname,int length){
         if(tracks.equals(trackname)){
             System.out.println("Đã tồn tại");
         }
         else tracks.setTitle(trackname);

    }
    public void removeTrack(){
        System.out.println("Nhập tên track muốn xóa");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        if(tracks.equals(sc)){
            System.out.println("CÓ trong list");
        }
        else System.out.println("Không có trong list");
    }
    public int getLength(){
        return tracks.getLength();
    }

    @Override
    public String printInfor() {
        return null;
    }

    @Override
    public void play() {
       //lam
    }
}
