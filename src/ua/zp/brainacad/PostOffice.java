package ua.zp.brainacad;

public class PostOffice {
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

    private int postOfficeNumber;
    private String senderData;
    private String senderAddress;
    private String recipientData;
    private String recipientAddress;
    private int parcelNumber;
    private int packageFormat;

    public static final int PACKAGE_FORMAT_LETTER = 0;
    public static final int PACKAGE_FORMAT_SMALL = 1;
    public static final int PACKAGE_FORMAT_BIG = 3;

    public int getPostOfficeNumber() {
        return postOfficeNumber;
    }

    public void setPostOfficeNumber(int postOfficeNumber) {
        this.postOfficeNumber = postOfficeNumber;
    }

    public String getSenderData() {
        return senderData;
    }

    public void setSenderData(String senderData) {
        this.senderData = senderData;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getRecipientData() {
        return recipientData;
    }

    public void setRecipientData(String recipientData) {
        this.recipientData = recipientData;
    }

    public String getRecipientAddress() {
        return recipientAddress;
    }

    public void setRecipientAddress(String recipientAddress) {
        this.recipientAddress = recipientAddress;
    }

    public int getParcelNumber() {
        return parcelNumber;
    }

    public void setParcelNumber(int parcelNumber) {
        this.parcelNumber = parcelNumber;
    }

    public int getPackageFormat() {
        return packageFormat;
    }

    public void setPackageFormat(int packageFormat) {
        this.packageFormat = packageFormat;
    }
}
