package task1_4.Service;

import task1_4.Entity.CaveTreasure;

import java.util.Collections;

public class SearchMaxCost {
    public void MaxCostSearch(CaveTreasure caveTreasure) {
        int i;
        int maxCoast = 0;
        for (i = 0; i < caveTreasure.getCaveTreasureArrayList().size(); i++) {
            if (caveTreasure.getCaveTreasureArrayList().get(i).getCoast() > maxCoast) {
                maxCoast = caveTreasure.getCaveTreasureArrayList().get(i).getCoast();
            }
            }
        System.out.println("максимальная стоимость среди элементов ->>>>");
        System.out.println(maxCoast);
        }
    }
