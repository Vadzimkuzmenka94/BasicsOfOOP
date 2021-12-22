package task1_5.Entity;


import java.util.ArrayList;

public class BoxFlowers  {
    String name;
    ArrayList <Flowers> flowersArrayList = new ArrayList<>();
    ArrayList <Flowers> smallFlowersArraylist = new ArrayList<>();

    public BoxFlowers(String name, ArrayList<Flowers> flowersArrayList) {
        this.name = name;
        this.flowersArrayList = flowersArrayList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Flowers> getFlowersArrayList() {
        return flowersArrayList;
    }

    public void setFlowersArrayList(ArrayList<Flowers> flowersArrayList) {
        this.flowersArrayList = flowersArrayList;
    }

    @Override
    public String toString() {
        return "BoxFlowers{" +
                "name='" + name + '\'' +
                ", flowersArrayList=" + flowersArrayList +
                '}';
    }
}
