class Painting extends Artwork {
    private String medium; // Тип краски (например, масло, акварель)

    public Painting(String title, Artist artist, double price, String medium) {
        super(title, artist, price);
        this.medium = medium;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    @Override
    public void displayDetails() {
        System.out.println("Painting: " + getTitle() +
                ", Artist: " + getArtist().getName() +
                ", Price: $" + getPrice() +
                ", Medium: " + medium);
    }
}