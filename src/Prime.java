public class Prime {
    public static void main(String[] args) {
        //----Добавил двух тестовых авторов
        Author testAuthor = new Author("Адам", "Невилл");
        Author secondTestAuthor = new Author("Джоан", "Роулинг");


        Author twilightAuthor = new Author("Дмитрий", "Глуховский");
        Book twilight = new Book("Сумерки", twilightAuthor, 2018);
        System.out.println(twilight.toString());

        Author ritualAuthor = new Author("Адам", "Невилл");
        Book ritual = new Book("Ритуал", ritualAuthor, 2019);
        ritual.setYear(2020);
        System.out.println(ritual.toString());

        //----Добавил тестовую книгу, добавил название и автора от первой книги, чтобы сравнить их и вывести true
        Book testBook = new Book("Сумерки", twilightAuthor, 2020);

        System.out.println(twilight.equals(testBook)); //значение выводит true, сравнение производится по наименованию и автору книги (год не учитывается, могут быть разные издания)
        System.out.println(ritualAuthor.equals(testAuthor)); //значение выводит true, имя и фамилия автора совпадают.
        System.out.println(testAuthor.equals(secondTestAuthor)); //значение выводит false, так как фамилия и имя авторов не совпадают.




    }

}
