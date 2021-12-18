package task1_4.Service;

import task1_4.Entity.CaveTreasure;
import task1_4.Entity.Treasure;

import java.util.ArrayList;
import java.util.Scanner;

public class SelectionOfTreasuresService {
    public void selectTreasere (CaveTreasure caveTreasure) {
        int limitMoney;
        int i;
        int y;
        int o;
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите лимит денег, которые хотите потратить");
        limitMoney = scanner.nextInt();
        System.out.println("список сокровищь");
        System.out.println(caveTreasure.getCaveTreasureArrayList());
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("введите сокровище которое хотите взять");
        for (i = 0; i < caveTreasure.getCaveTreasureArrayList().size() - 1; i++) {
            if (scanner1.nextLine().equals(caveTreasure.getCaveTreasureArrayList().get(i).getName())) {
                ArrayList<Treasure> purchases = new ArrayList<>();
                purchases.add(caveTreasure.getCaveTreasureArrayList().get(i));
                System.out.println(purchases);
                for (y = 0; y < purchases.size(); y++) {
                    if (limitMoney > purchases.get(y).getCoast()) {
                        Scanner scanner2 = new Scanner(System.in);
                        System.out.println("какие еще сокровища хотите?");
                        if (scanner2.nextLine().equals(caveTreasure.getCaveTreasureArrayList().get(i).getName())) {
                            purchases.add(caveTreasure.getCaveTreasureArrayList().get(i));
                            System.out.println(purchases);

                        }

                    } else {
                        System.out.println("денег больше нет");
                    }
                }
            }
        }
    }
}
