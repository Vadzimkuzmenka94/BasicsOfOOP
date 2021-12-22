package task1_5.Logic;

import task1_5.Entity.BoxFlowers;
import task1_5.Entity.BoxPack;
import task1_5.Entity.Flowers;
import task1_5.Entity.Pack;

public class AddToBoxFlowers {
    public void addToBox(BoxFlowers boxFlowers, Flowers flowers) {

        boxFlowers.getFlowersArrayList().add(flowers.getFlowers());
        boxFlowers.getFlowersArrayList().add(flowers.getFlowers1());
        boxFlowers.getFlowersArrayList().add(flowers.getFlowers2());
        boxFlowers.getFlowersArrayList().add(flowers.getFlowers3());
        boxFlowers.getFlowersArrayList().add(flowers.getFlowers4());
        boxFlowers.getFlowersArrayList().add(flowers.getFlowers5());

        System.out.println(boxFlowers.getFlowersArrayList());
    }
}
