public class Main {
    public static void main(String[] args) {

        Artwork art1 = new Artwork("Starry Night", "Vincent van Gogh", 1000000.00);
        Artwork art2 = new Artwork("Mona Lisa", "Leonardo da Vinci", 5000000.00);

        Artist artist1 = new Artist("Vincent van Gogh", 37, "Post-Impressionism");
        Artist artist2 = new Artist("Leonardo da Vinci", 67, "Renaissance");

        Gallery gallery1 = new Gallery("Louvre", "Paris", 5000);
        Gallery gallery2 = new Gallery("Van Gogh Museum", "Amsterdam", 2000);

        System.out.println("Artworks:");
        art1.displayArtwork();
        art2.displayArtwork();

        System.out.println("\nArtists:");
        artist1.displayArtist();
        artist2.displayArtist();

        System.out.println("\nGalleries:");
        gallery1.displayGallery();
        gallery2.displayGallery();

        System.out.println("\nComparison:"); //price comparison
        if (art1.getPrice() > art2.getPrice()) {
            System.out.println(art1.getTitle() + " is more expensive than " + art2.getTitle());
        } else {
            System.out.println(art2.getTitle() + " is more expensive than " + art1.getTitle());
        }
    }
}
