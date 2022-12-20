public class Main {
    public static void main(String[] args) {
        //Создаем первую книгу
        Author AgataKrist = new Author("Агата", "Кристи");
        Book tenLittleNiggers = new Book("Десят негретят", AgataKrist, 1939);

        //Создаем вторую книгу
        Author MichelLermontov = new Author("Михаил", "Лермонтов");
        Book Borodino = new Book("Бородино", MichelLermontov, 1850);

        //Вывод данных первой книги
        System.out.println("Название книги : " + tenLittleNiggers.getName());
        System.out.println("Год публикации : " + tenLittleNiggers.getDataIssue());
        System.out.println("Автор : " + tenLittleNiggers.getAuthor());
        //Меняем дату публикации
        tenLittleNiggers.setDataIssue(1946);
        System.out.println("Год публикации : " + tenLittleNiggers.getDataIssue());

        //Вывод данных второй  книги
        System.out.println("Название книги : " + Borodino.getName());
        System.out.println("Год публикации : " + Borodino.getDataIssue());
        System.out.println("Автор : " + Borodino.getAuthor());
        //Меняем дату публикации
        Borodino.setDataIssue(1877);
        System.out.println("Год публикации : " + Borodino.getDataIssue());


    }
}