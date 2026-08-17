package week03.day20.Media;

public abstract class MediaItem {
    private String title;

    public MediaItem(String title){
        this.title=title;
    }
    public String getTitle(){
        return title;
    }
    public void printTitle(){
        System.out.println("Media Title: '" + title +"'");
    }
    public abstract void playOrRead();
}
