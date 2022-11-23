public class Prime {
    public static void main(String[] args) {
        Author twilightAuthor = new Author("Дмитрий", "Глуховский");
        Book twilight = new Book("Сумерки", twilightAuthor, 2018);
        System.out.println(twilight.toString());

        Author ritualAuthor = new Author("Адам", "Невилл");
        Book ritual = new Book("Ритуал", ritualAuthor, 2019);
        ritual.setYear(2020);
        System.out.println(ritual.toString());

        //----Создал тестовую книгу, добавил значения идентичные первой книги, чтобы сравнить их
        Book testBook = new Book("Сумерки", twilightAuthor, 2018);

        System.out.println(twilight.equals(testBook)); //значение выводит true, сравнение производится по наименованию и автору книги

        //----Создал тестового автора, добавил фамилию и имя от предыдущего для сравнения
        Author testAuthor = new Author("Адам", "Невилл");
        System.out.println(ritualAuthor.equals(testAuthor)); //значение выводит true, сравнение производится по имени и фамилии автора
    }

}
