class Sculpture extends Artwork {
    private double weight; // Вес скульптуры

    public Sculpture(String title, Artist artist, double price, double weight) {
        super(title, artist, price);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void displayDetails() {
        System.out.println("Sculpture: " + getTitle() +
                ", Artist: " + getArtist().getName() +
                ", Price: $" + getPrice() +
                ", Weight: " + weight + "kg");
    }
}