import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;


class Gallery {
    private String name;
    private String location;
    private final List<Artwork> artworks;

    public Gallery(String name, String location) {
        if (name == null || location == null) {
            throw new IllegalArgumentException("Name and location cannot be null.");
        }
        this.name = name;
        this.location = location;
        this.artworks = new ArrayList<>();
    }

    public void addArtwork(Artwork artwork) {
        if (artwork == null) {
            throw new IllegalArgumentException("Artwork cannot be null.");
        }
        artworks.add(artwork);
    }

    public void displayArtworks() {
        System.out.println("Gallery: " + name + ", Location: " + location);
        for (Artwork artwork : artworks) {
            artwork.displayDetails();
        }
    }

    public List<Artwork> filterArtworksByPrice(double minPrice, double maxPrice) {
        if (minPrice > maxPrice) {
            throw new IllegalArgumentException("Minimum price cannot be greater than maximum price.");
        }
        List<Artwork> filtered = new ArrayList<>();
        for (Artwork artwork : artworks) {
            if (artwork.getPrice() >= minPrice && artwork.getPrice() <= maxPrice) {
                filtered.add(artwork);
            }
        }
        return filtered;
    }

    public void sortArtworksByPrice() {
        artworks.sort(Comparator.comparingDouble(Artwork::getPrice));
    }

    public Artwork searchArtworkByTitle(String title) {
        for (Artwork artwork : artworks) {
            if (artwork.getTitle().equalsIgnoreCase(title)) {
                return artwork;
            }
        }
        return null;
    }
}
