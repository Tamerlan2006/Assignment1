import java.util.ArrayList;
import java.util.List;

class Gallery {
    private String name;
    private String location;
    private List<Artwork> artworks;

    public Gallery(String name, String location) {
        this.name = name;
        this.location = location;
        this.artworks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void addArtwork(Artwork artwork) {
        artworks.add(artwork);
    }

    public void displayArtworks() {
        System.out.println("Gallery: " + name + ", Location: " + location);
        for (Artwork artwork : artworks) {
            artwork.displayDetails();
        }
    }

    public List<Artwork> filterArtworksByPrice(double minPrice, double maxPrice) {
        List<Artwork> filtered = new ArrayList<>();
        for (Artwork artwork : artworks) {
            if (artwork.getPrice() >= minPrice && artwork.getPrice() <= maxPrice) {
                filtered.add(artwork);
            }
        }
        return filtered;
    }
}
