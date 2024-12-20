public class Artist {
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
