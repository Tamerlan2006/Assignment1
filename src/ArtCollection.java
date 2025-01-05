import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;

class ArtCollection {
    private List<Artwork> artworks;

    public ArtCollection() {
        this.artworks = new ArrayList<>();
    }

    public void addArtwork(Artwork artwork) {
        artworks.add(artwork);
    }

    public void displayAll() {
        for (Artwork artwork : artworks) {
            artwork.displayDetails();
        }
    }

    public List<Artwork> filterByPrice(double minPrice, double maxPrice) {
        return artworks.stream()
                .filter(a -> a.getPrice() >= minPrice && a.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }

    public List<Artwork> searchByTitle(String keyword) {
        return artworks.stream()
                .filter(a -> a.getTitle().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }

    public void sortByPriceAscending() {
        Collections.sort(artworks, (a1, a2) -> Double.compare(a1.getPrice(), a2.getPrice()));
    }
}
