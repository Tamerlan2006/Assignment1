import java.util.List;

public class Main {

    public static void main(String[] args) {
        Artist artist1 = new Artist("Vincent van Gogh", "Netherlands", 1853);
        Artist artist2 = new Artist("Auguste Rodin", "France", 1840);

        Painting painting1 = new Painting("Starry Night", artist1, 1000000.00, "Oil");
        Painting painting2 = new Painting("Sunflowers", artist1, 800000.00, "Oil");
        Sculpture sculpture1 = new Sculpture("The Thinker", artist2, 1500000.00, 500.0);

        Gallery gallery = new Gallery("Modern Art Gallery", "Paris");
        gallery.addArtwork(painting1);
        gallery.addArtwork(painting2);
        gallery.addArtwork(sculpture1);

        gallery.displayArtworks();

        System.out.println("\nArtworks priced between $800,000 and $1,500,000:");
        List<Artwork> filteredArtworks = gallery.filterArtworksByPrice(800000, 1500000);
        for (Artwork artwork : filteredArtworks) {
            System.out.println(artwork);
        }

        System.out.println("\nSorted Artworks by Price:");
        gallery.sortArtworksByPrice();
        gallery.displayArtworks();

        System.out.println("\nSearch for 'Sunflowers':");
        Artwork foundArtwork = gallery.searchArtworkByTitle("Sunflowers");
        System.out.println(foundArtwork != null ? foundArtwork : "Artwork not found.");
    }
}