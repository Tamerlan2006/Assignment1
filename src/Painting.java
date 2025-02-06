class Painting extends Artwork {
    private String medium;

    public Painting(String title, Artist artist, double price, String medium) {
        super(title, artist, price);
        if (medium == null || medium.isEmpty()) {
            throw new IllegalArgumentException("Medium cannot be null or empty.");
        }
        this.medium = medium;
    }

    public String getMedium() {
        return medium;
    }

    @Override
    public void displayDetails() {
        System.out.println("Painting: " + getTitle() +
                ", Artist: " + getArtist().getName() +
                ", Price: $" + getPrice() +
                ", Medium: " + medium);
    }
}
