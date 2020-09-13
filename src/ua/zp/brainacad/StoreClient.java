package ua.zp.brainacad;

public class StoreClient {
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

    private String clientData;
    private int bonusAccount;
    private int productName;
    private int productStatus;

    public static final int PRODUCT_MILK = 0;
    public static final int PRODUCT_BREAD = 1;
    public static final int PRODUCT_MEAT = 2;

    public static final int ITEM_IN_CART = 0;
    public static final int ITEM_PURCHASED = 1;

    public String getClientData() {
        return clientData;
    }

    public void setClientData(String clientData) {
        this.clientData = clientData;
    }

    public int getBonusAccount() {
        return bonusAccount;
    }

    public void setBonusAccount(int bonusAccount) {
        this.bonusAccount = bonusAccount;
    }

    public int getProductName() {
        return productName;
    }

    public void setProductName(int productName) {
        this.productName = productName;
    }

    public int getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(int productStatus) {
        this.productStatus = productStatus;
    }
}
