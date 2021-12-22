package task1_5.Entity;

import java.util.ArrayList;

public class BoxPack {
    String name;
    ArrayList <Pack> listPack = new ArrayList ();

    public BoxPack(String name, ArrayList<Pack> listPack) {
        this.name = name;
        this.listPack = listPack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Pack> getListPack() {
        return listPack;
    }

    public void setListPack(ArrayList<Pack> listPack) {
        this.listPack = listPack;
    }

    @Override
    public String toString() {
        return "BoxPack{" +
                "name='" + name + '\'' +
                ", listPack=" + listPack +
                '}';
    }
}
