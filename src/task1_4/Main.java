package task1_4;

import task1_4.Entity.CaveTreasure;
import task1_4.Entity.Treasure;
import task1_4.Service.PrintTreasureService;
import task1_4.Service.SearchMaxCost;
import task1_4.Service.SelectionOfTreasuresService;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

      ArrayList <Treasure> caveTreasureArrayList = new ArrayList<>();
        Treasure treasure = new Treasure("Серьги", 200, 1);
        Treasure treasure1 = new Treasure("Брелок", 300, 2);
        Treasure treasure2 = new Treasure("Колье", 250, 3);
        Treasure treasure3 = new Treasure("Часы", 100, 4);
        Treasure treasure4 = new Treasure("Кольцо", 30, 5);
        Treasure treasure5 = new Treasure("Брошь", 21, 6);
        Treasure treasure6 = new Treasure("Браслен", 89, 7);
        Treasure treasure7 = new Treasure("Корона", 76, 8);
        Treasure treasure8 = new Treasure("Кубок", 98, 9);
        Treasure treasure9 = new Treasure("Монета", 200, 10);
        caveTreasureArrayList.add(treasure);
        caveTreasureArrayList.add(treasure1);
        caveTreasureArrayList.add(treasure2);
        caveTreasureArrayList.add(treasure3);
        caveTreasureArrayList.add(treasure4);
        caveTreasureArrayList.add(treasure5);
        caveTreasureArrayList.add(treasure6);
        caveTreasureArrayList.add(treasure7);
        caveTreasureArrayList.add(treasure8);
        caveTreasureArrayList.add(treasure9);

        CaveTreasure caveTreasure = new CaveTreasure(caveTreasureArrayList);

        PrintTreasureService printTreasureService = new PrintTreasureService();
        printTreasureService.TreasurePrint(caveTreasure);

        SearchMaxCost searchMaxCost = new SearchMaxCost();
        searchMaxCost.MaxCostSearch(caveTreasure);

      SelectionOfTreasuresService selectionOfTreasuresService = new SelectionOfTreasuresService();
      selectionOfTreasuresService.selectTreasere(caveTreasure);
    }
}
