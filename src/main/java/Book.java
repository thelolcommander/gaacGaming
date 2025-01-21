public class Book {
    String[] author = { "Adolf Hitler", "Ted Kaczynski", "Karl Marx" };
    String[] title = { "Mein Kampf", "The Industrial Revolution and Its Consequences", "Communist Manifesto" };
    String[] publisher = { "Franz Eher Nachfolger GmbH", "Jolly Roger Press", "Simon & Schuster" };
    String[] state = { "Berlin", "North Carolina", "Trier" };
    String[] country = { "Germany", "United States of America", "Germany" };

    public String getBookDetails(int index) {
        String publicationMonth = Date.convertMonth(index % Date.month.length);
        int publicationYear = Date.year[index];
        String bookAge = (checkBookAge(publicationYear) == 1) ? "new" : "old";
        return String.format(
            "%s, %s. %s. %s, %s. %s %d (%s)",
            author[index],
            title[index],
            publisher[index],
            state[index],
            country[index],
            publicationMonth,
            publicationYear,
            bookAge
        );
    }

    public int checkBookAge(int bookYear) {
        int currentYear = 2025;
        return (currentYear - bookYear < 3) ? 1 : 0;
    }
}
