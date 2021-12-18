package task1_4.Service;

import task1_4.Entity.CaveTreasure;

public class PrintTreasureService  {
    public void TreasurePrint (CaveTreasure caveTreasure) {
        System.out.println("Указаванные выше сокровища имеются в пещере : ");
        int i = 0;
        for (i = 0; i < caveTreasure.getCaveTreasureArrayList().size() - 1; i++) {
            System.out.println(caveTreasure.getCaveTreasureArrayList().get(i).getName());
        }

    }
}
