public class Artwork {
    private String title;
    private String artistName;
    private double price;

    public Artwork(String title, String artistName, double price) {
        this.title = title;
        this.artistName = artistName;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayArtwork() {
        System.out.println("Artwork Title: " + title + ", Artist: " + artistName + ", Price: $" + price);
    }
}


