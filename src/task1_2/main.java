
/*Задача 2.
        Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
        нескольких товаров*/
package task1_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Создать класс Payment с внутренним классом,
с помощью объектов которого можно сформировать покупку из нескольких товаров.
 */
public class main {
    public static void main(String[] args) throws IOException {
        Payment payment = new Payment();
        Payment.Order purchase = payment.new Order();
        purchase.createShoppingList();
        payment.amountMoneyPay(purchase.getOrderList());
        payment.printShoppingList(purchase.getOrderList());
    }
}
