package task1_5.Logic;

import task1_5.Entity.Bouquet;
import task1_5.Entity.Flowers;
import task1_5.Entity.Pack;

import java.util.Scanner;

public class NewBouquetService {
    public void NewBouquet () {
        System.out.println("Приступаем к формированию букета");
        System.out.println("введите параметры упаковки (материал и цвет)");
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Pack pack = new Pack(scanner.nextLine(), scanner1.nextLine());
        System.out.println("введите параметры цветов (название, цвет, количество");
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        Scanner scanner4 = new Scanner (System.in);
        Flowers flowers = new Flowers(scanner2.nextLine(), scanner3.nextLine(), scanner4.nextInt());
        System.out.println("введите название букета");
        Scanner scanner5 = new Scanner(System.in);
        Bouquet bouquet = new Bouquet(scanner5.nextLine(), flowers, pack);
        System.out.println(bouquet);
    }
}
