package ua.zp.brainacad;

public class Main {

    public static void main(String[] args) {    //Часть 1.
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

        Book book1 = new Book();
//        book1.author = "Mr. First";
//        book1.title = "First book";
//        book1.size = 111;
//        book1.chapter = 10;
//        book1.format = Book.FORMAT_PDF;
//        book1.language = Book.LANGUAGE_RU;
//        book1.currentPage = 1;
//        System.out.println("Class name: " + book1.getClass());
//        System.out.println("Author: " + book1.author);
//        System.out.println("Title: " + book1.title);
//        System.out.println("Size: " + book1.size);
//        System.out.println("Chapter: " + book1.chapter);
//        System.out.println("Format: " + book1.format);
//        System.out.println("Language: " + book1.language);
//        System.out.println("Current Page: " + book1.currentPage);
        book1.setAuthor("Mr. First");
        book1.setTitle("First book");
        book1.setSize(111);
        book1.setChapter(10);
        book1.setFormat(Book.FORMAT_PDF);
        book1.setLanguage(Book.LANGUAGE_RU);
        book1.setCurrentPage(1);
        System.out.println("Class name: " + book1.getClass());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Size: " + book1.getSize());
        System.out.println("Chapter: " + book1.getChapter());
        System.out.println("Format: " + book1.getFormat());
        System.out.println("Language: " + book1.getLanguage());
        System.out.println("Current Page: " + book1.getCurrentPage());

        PostOffice postOffice1 = new PostOffice();
//        postOffice1.postOfficeNumber = 1;
//        postOffice1.parcelNumber = 1;
//        postOffice1.packageFormat = PostOffice.PACKAGE_FORMAT_LETTER;
//        postOffice1.senderData = "Mr. Sender";
//        postOffice1.senderAddress = "Zaporozhue";
//        postOffice1.recipientData = "Mr. Recipient";
//        postOffice1.recipientAddress = "Kiev";
//        System.out.println("\nClass name: " + postOffice1.getClass());
//        System.out.println("Post office number: " + postOffice1.postOfficeNumber);
//        System.out.println("Parcel number: " + postOffice1.parcelNumber);
//        System.out.println("Package format: " + postOffice1.packageFormat);
//        System.out.println("Sender data: " + postOffice1.senderData);
//        System.out.println("Sender address: " + postOffice1.senderAddress);
//        System.out.println("Recipient data: " + postOffice1.recipientData);
//        System.out.println("Recipient address: " + postOffice1.recipientAddress);
        postOffice1.setPostOfficeNumber(1);
        postOffice1.setParcelNumber(1);
        postOffice1.setPackageFormat(PostOffice.PACKAGE_FORMAT_LETTER);
        postOffice1.setSenderData("Mr. Sender");
        postOffice1.setSenderAddress("Zaporozhue");
        postOffice1.setRecipientData("Mr. Recipient");
        postOffice1.setRecipientAddress("Kiev");
        System.out.println("\nClass name: " + postOffice1.getClass());
        System.out.println("Post office number: " + postOffice1.getPostOfficeNumber());
        System.out.println("Parcel number: " + postOffice1.getParcelNumber());
        System.out.println("Package format: " + postOffice1.getPackageFormat());
        System.out.println("Sender data: " + postOffice1.getSenderData());
        System.out.println("Sender address: " + postOffice1.getSenderAddress());
        System.out.println("Recipient data: " + postOffice1.getRecipientData());
        System.out.println("Recipient address: " + postOffice1.getRecipientAddress());

        StoreClient client1 = new StoreClient();
//        client1.clientData = "Mr. First Client";
//        client1.bonusAccount = 3;
//        client1.productName = StoreClient.PRODUCT_MILK;
//        client1.productStatus = StoreClient.ITEM_IN_CART;
//        System.out.println("\nClass name: " + client1.getClass());
//        System.out.println("Client Data: " + client1.clientData);
//        System.out.println("Bonus Account: " + client1.bonusAccount);
//        System.out.println("Product Name: " + client1.productName);
//        System.out.println("Product Status: " + client1.productStatus);
        client1.setClientData("Mr. First Client");
        client1.setBonusAccount(3);
        client1.setProductName(StoreClient.PRODUCT_MILK);
        client1.setProductStatus(StoreClient.ITEM_IN_CART);
        System.out.println("\nClass name: " + client1.getClass());
        System.out.println("Client Data: " + client1.getClientData());
        System.out.println("Bonus Account: " + client1.getBonusAccount());
        System.out.println("Product Name: " + client1.getProductName());
        System.out.println("Product Status: " + client1.getProductStatus());

        Farm farm1 = new Farm();
//        farm1.fieldNumber = 4;
//        farm1.typeOfGrain = Farm.GRAIN_WHEAT;
//        farm1.fieldStatus = Farm.FIELD_COLLECTED;
//        System.out.println("\nClass name: " + farm1.getClass());
//        System.out.println("Field Number: " + farm1.fieldNumber);
//        System.out.println("Type Of Grain: " + farm1.typeOfGrain);
//        System.out.println("Field Status: " + farm1.fieldStatus);
        farm1.setFieldNumber(4);
        farm1.setTypeOfGrain(Farm.GRAIN_WHEAT);
        farm1.setFieldStatus(Farm.FIELD_COLLECTED);
        System.out.println("\nClass name: " + farm1.getClass());
        System.out.println("Field Number: " + farm1.getFieldNumber());
        System.out.println("Type Of Grain: " + farm1.getTypeOfGrain());
        System.out.println("Field Status: " + farm1.getFieldStatus());
    }
}
