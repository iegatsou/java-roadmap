package week03.day20.Media;

public class Book extends MediaItem implements Downloadable {
    public Book(String name) {
        super(name);
    }

    @Override
    public void download() {
        System.out.println("Book '" + getTitle() + "' is downloadable");
    }

    @Override
    public void playOrRead() {
        System.out.println("Book '" + getTitle() + "' is readable");
    }
}
