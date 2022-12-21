public class Main {
    public static void main(String[] args) {

        Author authorPushkinAS = new Author("Александр", "Пушкин");
        Author authorTolstoyLN = new Author("Лев", "Толстой");
        Author authorShildtG = new Author("Gerbert", "Shildt");

        Book bookSaltan = new Book(authorPushkinAS, "Сказко о царе Салтане", 1831);
        Book bookWar = new Book(authorTolstoyLN, "Война и Мир", 1873);
        Book bookJava = new Book(authorShildtG, "Java - полное руководство", 2021);

        bookJava.setYear(2022);

    }
}