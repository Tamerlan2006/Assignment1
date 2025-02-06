import java.sql.*;
import java.util.Scanner;

public class MyApplication {
    public static final String DB_USERNAME = "postgres";
    public static final String DB_PASSWORD = "tamerlan2006";
    public static final String DB_URL = "jdbc:postgresql://localhost:5432/artexhibition";

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD)) {

            while (true) {
                System.out.println("\nWelcome to Art Exhibition");
                System.out.println("Select an option:");
                System.out.println("1. Get all artists");
                System.out.println("2. Get artist by id");
                System.out.println("3. Get artist by name");
                System.out.println("4. Get artist by country");
                System.out.println("5. Get artist by birth_year");
                System.out.println("6. Add entry");
                System.out.println("7. Update entry by id");
                System.out.println("8. Delete entry by id");
                System.out.println("0. Exit");

                int command = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                if (command == 1) {
                    // Get all artists
                    Statement statement = connection.createStatement();
                    String SQL_SELECT_ARTISTS = "SELECT * FROM artists ORDER BY id ASC";
                    ResultSet result = statement.executeQuery(SQL_SELECT_ARTISTS);
                    while (result.next()) {
                        System.out.println(result.getInt("id") + " " + result.getString("name")
                                + " " + result.getString("country") + " " + result.getInt("birth_year"));
                    }
                } else if (command == 2) {
                    // Get artist by ID
                    System.out.print("Enter artist ID: ");
                    int id = scanner.nextInt();

                    String SQL_SELECT_BY_ID = "SELECT * FROM artists WHERE id = ?";
                    PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECT_BY_ID);
                    preparedStatement.setInt(1, id);
                    ResultSet result = preparedStatement.executeQuery();

                    if (result.next()) {
                        System.out.println(result.getInt("id") + " " + result.getString("name")
                                + " " + result.getString("country") + " " + result.getInt("birth_year"));
                    } else {
                        System.out.println("No artist found with ID: " + id);
                    }
                } else if (command == 3) {
                    // Get artist by name
                    System.out.print("Enter artist name: ");
                    String name = scanner.nextLine();

                    String SQL_SELECT_BY_NAME = "SELECT * FROM artists WHERE name ILIKE ?";
                    PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECT_BY_NAME);
                    preparedStatement.setString(1, "%" + name + "%");
                    ResultSet result = preparedStatement.executeQuery();

                    while (result.next()) {
                        System.out.println(result.getInt("id") + " " + result.getString("name")
                                + " " + result.getString("country") + " " + result.getInt("birth_year"));
                    }
                } else if (command == 4) {
                    // Get artist by country
                    System.out.print("Enter artist country: ");
                    String country = scanner.nextLine();

                    String SQL_SELECT_BY_COUNTRY = "SELECT * FROM artists WHERE country ILIKE ?";
                    PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECT_BY_COUNTRY);
                    preparedStatement.setString(1, "%" + country + "%");
                    ResultSet result = preparedStatement.executeQuery();

                    while (result.next()) {
                        System.out.println(result.getInt("id") + " " + result.getString("name")
                                + " " + result.getString("country") + " " + result.getInt("birth_year"));
                    }
                } else if (command == 5) {
                    // Get artist by birth year
                    System.out.print("Enter artist birth year: ");
                    int birthYear = scanner.nextInt();

                    String SQL_SELECT_BY_BIRTH_YEAR = "SELECT * FROM artists WHERE birth_year = ?";
                    PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECT_BY_BIRTH_YEAR);
                    preparedStatement.setInt(1, birthYear);
                    ResultSet result = preparedStatement.executeQuery();

                    while (result.next()) {
                        System.out.println(result.getInt("id") + " " + result.getString("name")
                                + " " + result.getString("country") + " " + result.getInt("birth_year"));
                    }
                } else if (command == 6) {
                    // Add entry
                    System.out.println("What do you want to add? (artist/exhibition): ");
                    String type = scanner.nextLine();

                    if (type.equalsIgnoreCase("artist")) {
                        System.out.print("Enter artist name: ");
                        String name = scanner.nextLine();

                        System.out.print("Enter artist country: ");
                        String country = scanner.nextLine();

                        System.out.print("Enter artist birth year: ");
                        int birthYear = scanner.nextInt();

                        String SQL_INSERT_ARTIST = "INSERT INTO artists (name, country, birth_year) VALUES (?, ?, ?)";
                        PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT_ARTIST);
                        preparedStatement.setString(1, name);
                        preparedStatement.setString(2, country);
                        preparedStatement.setInt(3, birthYear);
                        preparedStatement.executeUpdate();

                        System.out.println("Artist added successfully!");
                    } else if (type.equalsIgnoreCase("exhibition")) {
                        System.out.print("Enter exhibition title: ");
                        String title = scanner.nextLine();

                        System.out.print("Enter exhibition year: ");
                        int year = scanner.nextInt();

                        String SQL_INSERT_EXHIBITION = "INSERT INTO exhibitions (title, year) VALUES (?, ?)";
                        PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT_EXHIBITION);
                        preparedStatement.setString(1, title);
                        preparedStatement.setInt(2, year);
                        preparedStatement.executeUpdate();

                        System.out.println("Exhibition added successfully!");
                    } else {
                        System.out.println("Invalid entry type.");
                    }
                } else if (command == 7) {
                    // Update entry by ID
                    System.out.print("Enter artist ID to update: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();

                    System.out.print("Enter new country: ");
                    String newCountry = scanner.nextLine();

                    System.out.print("Enter new birth year: ");
                    int newBirthYear = scanner.nextInt();

                    String SQL_UPDATE_ARTIST = "UPDATE artists SET name = ?, country = ?, birth_year = ? WHERE id = ?";
                    PreparedStatement preparedStatement = connection.prepareStatement(SQL_UPDATE_ARTIST);
                    preparedStatement.setString(1, newName);
                    preparedStatement.setString(2, newCountry);
                    preparedStatement.setInt(3, newBirthYear);
                    preparedStatement.setInt(4, id);
                    int rowsAffected = preparedStatement.executeUpdate();

                    if (rowsAffected > 0) {
                        System.out.println("Artist updated successfully!");
                    } else {
                        System.out.println("No artist found with ID: " + id);
                    }
                } else if (command == 8) {
                    // Delete entry by ID
                    System.out.print("Enter artist ID to delete: ");
                    int id = scanner.nextInt();

                    String SQL_DELETE_ARTIST = "DELETE FROM artists WHERE id = ?";
                    PreparedStatement preparedStatement = connection.prepareStatement(SQL_DELETE_ARTIST);
                    preparedStatement.setInt(1, id);
                    int rowsAffected = preparedStatement.executeUpdate();

                    if (rowsAffected > 0) {
                        System.out.println("Artist deleted successfully!");
                    } else {
                        System.out.println("No artist found with ID: " + id);
                    }
                } else if (command == 0) {
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                } else {
                    System.out.println("The command you entered is not recognized.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
