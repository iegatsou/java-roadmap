package week03.day20.Media;


public class MediaApp {
    public static MediaItem findByTitle(MediaItem[] items, String title) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && (items[i].getTitle()).equalsIgnoreCase(title))
                return items[i];
        }
        return null;
    }

    static void main() {
        MediaItem[] items = new MediaItem[4];
        items[0] = new Book("1984");
        items[1] = new Movie("Gone with the wind");
        items[2] = new Movie("Fast and the Furious 4");
        items[3] = new Book("The Jungle Book");
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                items[i].printTitle();
                items[i].playOrRead();
            }
        }
        for (int i = 0; i < items.length; i++) {
            if (items[i] instanceof Downloadable)
                ((Downloadable) items[i]).download();
        }
        MediaItem found = findByTitle(items, "GONE WITH THE WIND");
        if (found != null) {
            found.printTitle();
        } else System.out.println("Media item not found.");
    }
}