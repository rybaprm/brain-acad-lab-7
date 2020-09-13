package ua.zp.brainacad;

public class Book {
    //Часть 1.
//Первая часть посвящена базовым навыкам по работе с классами. Необходимо создать
//несколько классов, описывающих определенные объекты.
//1.1 Создать 3 класса с публичными полями, которые описывают объекты из списка:
//    Книга, Отделение почты, Клиент магазина, свой вариант.
//            1.2 Константы.
//    Дополнить классы константными значениями, полями класса (static final). Поля
//    должны иметь отношение к предметной области.
//            1.3 Создание экземпляров
//    Создать дополнительный класс, например Main, для проверки предыдущих шагов.
//    В этом классе создать main метод, в котором создать экземпляры описанных ранее
//    классов.
//1.4 Инициализация полей объекта
//    С помощью доступа к переменной, через «точку» у объекта класса,
//    проинициализировать поля.
//    Пример: obj.field = 12L;
//1.5 Вывод информации о объекте
//    Вывести на экран информацию о каждом объекте в формате:
//    Имя класса: Test
//            Field1 = 123
//    Field2 = ”qwerty”

//    Часть 2.
//            2.1 Поменять все модификаторы доступа у полей экземпляра класса на private.
//    Попробовать запустить Main класс.
//            2.2 Сгенерировать во всех описанных классах методы get и set.
//    Для того, чтобы быстро сгенерировать нужные, шаблонные методы, установите курсор в
//    то место, где хотите вставить новый код и нажмите клавиши: alt + insert
//            2.3 Заменить работу с полями класса через «точку», на работу через методы get и set.
    private String title;
    private String author;
    private int size;
    private int chapter;
    private int format;
    private int language;
    private int currentPage;

    public static final int FORMAT_PDF=0;
    public static final int FORMAT_TXT=1;
    public static final int FORMAT_DOC=3;

    public static final int LANGUAGE_RU=0;
    public static final int LANGUAGE_EN=1;
    public static final int LANGUAGE_UA=2;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getChapter() {
        return chapter;
    }

    public void setChapter(int chapter) {
        this.chapter = chapter;
    }

    public int getFormat() {
        return format;
    }

    public void setFormat(int format) {
        this.format = format;
    }

    public int getLanguage() {
        return language;
    }

    public void setLanguage(int language) {
        this.language = language;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
}
