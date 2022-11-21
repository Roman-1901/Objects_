public class Prime {
    public static void main(String[] args) {
        Author twilightAuthor = new Author("Дмитрий", "Глуховский");
        Book twilight = new Book("Сумерки", twilightAuthor, 2018);
        System.out.println(twilight.getNameBook() + " " + twilight.getYear() + " " + twilight.getAuthor().getName() + " " + twilight.getAuthor().getSurname());

        Author ritualAuthor = new Author("Адам", "Невилл");
        Book ritual = new Book("Ритуал", ritualAuthor, 2019);
        ritual.setYear(2020);
        System.out.println(ritual.getNameBook() + " " + ritual.getYear() + " " + ritual.getAuthor().getName() + " " + ritual.getAuthor().getSurname());
    }
}
