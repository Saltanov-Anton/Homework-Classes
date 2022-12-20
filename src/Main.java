public class Main {
    public static void main(String[] args) {

        Author authorPushkinAS = new Author("Александр Сергеевич Пушкин");
        Author authorTolstoyLN = new Author("Лев Николаевич Толстой");
        Author authorShildtG = new Author("Gerbert Shildt");

        Book bookSaltan = new Book(authorPushkinAS.getName(), 1831);
        Book bookWar = new Book(authorTolstoyLN.getName(), 1873);
        Book bookJava = new Book(authorShildtG.getName(), 2021);

        bookJava.setYear(2022);

    }
}