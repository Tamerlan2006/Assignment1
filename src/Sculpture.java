class Sculpture extends Artwork {
    private double weight;

    public Sculpture(String title, Artist artist, double price, double weight) {
        super(title, artist, price);
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight must be greater than zero.");
        }
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void displayDetails() {
        System.out.println("Sculpture: " + getTitle() +
                ", Artist: " + getArtist().getName() +
                ", Price: $" + getPrice() +
                ", Weight: " + weight + "kg");
    }
}