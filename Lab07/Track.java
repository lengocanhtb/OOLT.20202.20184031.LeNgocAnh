package hust.soict.hedspi.aims.media;

public class Track implements Playable{
    public void setTitle(String title) {
        this.title = title;
    }

    private String title;
    private int length;
    public Track(){

    }
    public Track(String title){
        this.title=title;
    }
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void play() {
        System.out.println("Play DVD: " + this.getTitle());
        System.out.println("DVD length" +this.getLength());
    }
}
