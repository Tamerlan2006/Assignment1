import java.util.Objects;

abstract class Artwork {
    private String title;
    private Artist artist;
    private double price;

    public Artwork(String title, Artist artist, double price) {
        if (title == null || artist == null || price < 0) {
            throw new IllegalArgumentException("Invalid input for Artwork fields.");
        }
        this.title = title;
        this.artist = artist;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public Artist getArtist() {
        return artist;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Artwork{" +
                "title='" + title + '\'' +
                ", artist=" + artist +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artwork artwork = (Artwork) o;
        return Double.compare(artwork.price, price) == 0 &&
                Objects.equals(title, artwork.title) &&
                Objects.equals(artist, artwork.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist, price);
    }

    public abstract void displayDetails();
}