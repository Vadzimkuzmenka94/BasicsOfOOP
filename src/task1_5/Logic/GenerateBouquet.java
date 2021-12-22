package task1_5.Logic;

import task1_5.Entity.*;

import java.util.ArrayList;
import java.util.Scanner;

public class GenerateBouquet {
    public void GenerateBouq(BoxPack boxPack, BoxFlowers boxFlowers) {
        int i;
        int y;
        System.out.println(boxPack.getListPack());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите вариант упаковки");
        for (i = 0; i < boxPack.getListPack().size() - 1; i++) {
            if (scanner.nextLine().equals(boxPack.getListPack().get(i).getMaterial()) == true) {
                ArrayList<Pack> smallPackArraylist = new ArrayList<>();
                smallPackArraylist.add(boxPack.getListPack().get(i));
            }
        }
        System.out.println(boxFlowers.getFlowersArrayList());
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Выберите цветок");
        for (y = 0; y < boxFlowers.getFlowersArrayList().size() - 1; y++) ;
        {
            if (scanner1.nextLine().equals(boxFlowers.getFlowersArrayList().get(y).getTitle())) {
                ArrayList<Flowers> smallFlowerArrayList = new ArrayList<>();
                smallFlowerArrayList.add(boxFlowers.getFlowersArrayList().get(y));


                System.out.println("введите название букета");
                Scanner scanner2 = new Scanner(System.in);

            }
        }
    }
}

