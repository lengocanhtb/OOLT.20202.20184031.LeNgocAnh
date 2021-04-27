package aims.media;

public abstract class Media {
    protected String title;
    protected String category;
    protected float cost;
    protected String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    protected Media(String title){
        this.title = title;
    }
    protected Media(String title, String category, float cost){
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    protected Media(String id, String title, String category, float cost){
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
   /* public boolean search(String title){

    }*/
}
