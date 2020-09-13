package ua.zp.brainacad;

public class Farm {
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

    private int fieldNumber;
    private int typeOfGrain;
    private int fieldStatus;

    public static final int GRAIN_WHEAT = 0;
    public static final int GRAIN_CORN = 1;
    public static final int GRAIN_SUNFLOWER = 2;
    public static final int FIELD_IS_SOWN = 0;
    public static final int FIELD_COLLECTED = 1;

    public int getFieldNumber() {
        return fieldNumber;
    }

    public void setFieldNumber(int fieldNumber) {
        this.fieldNumber = fieldNumber;
    }

    public int getTypeOfGrain() {
        return typeOfGrain;
    }

    public void setTypeOfGrain(int typeOfGrain) {
        this.typeOfGrain = typeOfGrain;
    }

    public int getFieldStatus() {
        return fieldStatus;
    }

    public void setFieldStatus(int fieldStatus) {
        this.fieldStatus = fieldStatus;
    }
}
