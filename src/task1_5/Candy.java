package task1_5;/*
    Класс для представления конфеты
 */

public class Candy extends MySweet implements Sweet {
    public Candy() {
        super();
        super.setName("конфета");
    }

    public Candy(double weight, double price) {
        super("конфета", weight, price);
    }
}