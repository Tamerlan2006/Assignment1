abstract class Artwork {
    private String title;
    private Artist artist;
    private double price;

    public Artwork(String title, Artist artist, double price) {
        this.title = title;
        this.artist = artist;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Artwork{" +
                "title='" + title + '\'' +
                ", artist=" + artist +
                ", price=" + price +
                '}';
    }

    public abstract void displayDetails();
}
