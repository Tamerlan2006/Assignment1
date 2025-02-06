import java.util.Objects;

class Artist {
    private String name;
    private String country;
    private int birthYear;

    public Artist(String name, String country, int birthYear) {
        if (name == null || country == null || birthYear <= 0) {
            throw new IllegalArgumentException("Invalid input for Artist fields.");
        }
        this.name = name;
        this.country = country;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artist artist = (Artist) o;
        return birthYear == artist.birthYear &&
                Objects.equals(name, artist.name) &&
                Objects.equals(country, artist.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, country, birthYear);
    }
}