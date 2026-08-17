package week03.day20.Media;

public class Movie extends MediaItem implements Downloadable {
    public Movie(String name) {
        super(name);
    }

    @Override
    public void download() {
        System.out.println("Movie '" + getTitle() + "' is downloadable");
    }

    @Override
    public void playOrRead() {
        System.out.println("Movie '"+getTitle()+"' is playable");
    }
}
