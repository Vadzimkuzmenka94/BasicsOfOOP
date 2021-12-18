package task1_4.Entity;

import java.util.ArrayList;
import java.util.Objects;

public class CaveTreasure {

    public CaveTreasure(ArrayList<Treasure> caveTreasureArrayList) {
        this.caveTreasureArrayList = caveTreasureArrayList;
    }



    public ArrayList<Treasure> getCaveTreasureArrayList() {
        return caveTreasureArrayList;
    }

    @Override
    public String toString() {
        return "CaveTreasure{" +
                "caveTreasureArrayList=" + caveTreasureArrayList +
                '}';
    }

    public void setCaveTreasureArrayList(ArrayList<Treasure> caveTreasureArrayList) {
        this.caveTreasureArrayList = caveTreasureArrayList;
    }

    ArrayList <Treasure> caveTreasureArrayList;


    Treasure treasure = new Treasure("Серьги", 200, 1);
    Treasure treasure1 = new Treasure("Серьги", 200, 1);
    Treasure treasure2 = new Treasure("Серьги", 200, 1);
    Treasure treasure3 = new Treasure("Серьги", 200, 1);
    Treasure treasure4 = new Treasure("Серьги", 200, 1);
    Treasure treasure5 = new Treasure("Серьги", 200, 1);
    Treasure treasure6 = new Treasure("Серьги", 200, 1);
    Treasure treasure7 = new Treasure("Серьги", 200, 1);
    Treasure treasure8 = new Treasure("Серьги", 200, 1);
    Treasure treasure9 = new Treasure("Серьги", 200, 1);

    public Treasure getTreasure() {
        return treasure;
    }

    public void setTreasure(Treasure treasure) {
        this.treasure = treasure;
    }

    public Treasure getTreasure1() {
        return treasure1;
    }

    public void setTreasure1(Treasure treasure1) {
        this.treasure1 = treasure1;
    }

    public Treasure getTreasure2() {
        return treasure2;
    }

    public void setTreasure2(Treasure treasure2) {
        this.treasure2 = treasure2;
    }

    public Treasure getTreasure3() {
        return treasure3;
    }

    public void setTreasure3(Treasure treasure3) {
        this.treasure3 = treasure3;
    }

    public Treasure getTreasure4() {
        return treasure4;
    }

    public void setTreasure4(Treasure treasure4) {
        this.treasure4 = treasure4;
    }

    public Treasure getTreasure5() {
        return treasure5;
    }

    public void setTreasure5(Treasure treasure5) {
        this.treasure5 = treasure5;
    }

    public Treasure getTreasure6() {
        return treasure6;
    }

    public void setTreasure6(Treasure treasure6) {
        this.treasure6 = treasure6;
    }

    public Treasure getTreasure7() {
        return treasure7;
    }

    public void setTreasure7(Treasure treasure7) {
        this.treasure7 = treasure7;
    }

    public Treasure getTreasure8() {
        return treasure8;
    }

    public void setTreasure8(Treasure treasure8) {
        this.treasure8 = treasure8;
    }

    public Treasure getTreasure9() {
        return treasure9;
    }

    public void setTreasure9(Treasure treasure9) {
        this.treasure9 = treasure9;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CaveTreasure that = (CaveTreasure) o;
        return Objects.equals(caveTreasureArrayList, that.caveTreasureArrayList) && Objects.equals(treasure, that.treasure) && Objects.equals(treasure1, that.treasure1) && Objects.equals(treasure2, that.treasure2) && Objects.equals(treasure3, that.treasure3) && Objects.equals(treasure4, that.treasure4) && Objects.equals(treasure5, that.treasure5) && Objects.equals(treasure6, that.treasure6) && Objects.equals(treasure7, that.treasure7) && Objects.equals(treasure8, that.treasure8) && Objects.equals(treasure9, that.treasure9);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caveTreasureArrayList, treasure, treasure1, treasure2, treasure3, treasure4, treasure5, treasure6, treasure7, treasure8, treasure9);
    }
}
