
class Artwork {
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

class Artist {
    private String name;
    private int age;
    private String style;

    public Artist(String name, int age, String style) {
        this.name = name;
        this.age = age;
        this.style = style;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void displayArtist() {
        System.out.println("Artist Name: " + name + ", Age: " + age + ", Style: " + style);
    }
}

class Gallery {
    private String name;
    private String location;
    private int capacity;

    public Gallery(String name, String location, int capacity) {
        this.name = name;
        this.location = location;
        this.capacity = capacity;
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void displayGallery() {
        System.out.println("Gallery Name: " + name + ", Location: " + location + ", Capacity: " + capacity);
    }
}
