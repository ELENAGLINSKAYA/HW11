public class Main {
    public static void isLeapYearCount(int year) {
        boolean leapYaerCount = (year > 1584 &&
                ((year / 400 == 0) ||
                        (year / 4 == 0 && year / 100 != 0)));
        if (leapYaerCount)
            System.out.println("Год" + year + "високосный");

        else
            System.out.println("Год " + year + " не високосный");

    }
    public static void isDeviceAge(int age){
        if (age >= 2015)
            System.out.println("Установите версию приложения для iOS по ссылке");
        else if (age< 2015)
            System.out.println("Установите облегченную версию приложения для Android по ссылке" );

    }

    public static void isDeliveryDay( int distance){
        int day = 1;
        int dayNew = ++day;
        int dayNew1 =++dayNew;

        if (distance <= 20) {
            System.out.println("Срок доставки" + day + "день");
        } else if (distance > 20 && distance <= 60) {
            System.out.println("Срок доставки" + dayNew + "дня");
        } else if (distance > 60 && distance < 100) {
            System.out.println("Потребуется на доставку" + dayNew1 + " дня");
        }}
    public static void main(String[]args) {
        System.out.println("Hello world!");

        System.out.println("Задача 1");
        int yaer  = 2021;
        isLeapYearCount(yaer);

        System.out.println();
        System.out.println("Задание 2");
        int age = 2022;
        isDeviceAge(age);

        System.out.println();
        System.out.println("Задание 3");
        int distance = 90;
        isDeliveryDay(distance);

    }}
