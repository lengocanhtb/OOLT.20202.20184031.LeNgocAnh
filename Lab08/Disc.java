package hust.soict.hedspi.aims.media;

public class Disc extends Media{
    private int length;
    private String director;

    protected Disc(String title, String category) {
        super(title, category);
    }

    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public String printInfor() {
        return null;
    }
}
