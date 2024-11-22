public class ArtistDemo {
    public static void main(String[] args) {
        Artist artist = new Artist("Charlie Puth", "American", 32, "Music");
        artist.displayInfo();
        System.out.println();

        Singer singer = new Singer("Ariana Grande", "American", 31, "Music", Genre.RNB);
        singer.displayInfo();
        System.out.println();

        Painter painter = new Painter("Fernando Amorsolo", "Filipino", 79, "Art", Medium.OIL);
        painter.displayInfo();
        System.out.println();

        Writer writer = new Writer("J.K. Rowling", "British", 59, "Literature", WritingStyle.FICTION);
        writer.displayInfo();
        System.out.println();

        Dancer dancer = new Dancer("Hoshi", "Korean", 28, "Dance", DanceStyle.HIPHOP);
        dancer.displayInfo();
    }
}
