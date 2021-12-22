package task1_5.Logic;

import task1_5.Entity.BoxPack;
import task1_5.Entity.Pack;


public class AddToBoxPack  {
    public void addToBox(BoxPack boxPack, Pack pack) {

        boxPack.getListPack().add(pack.getPack());
        boxPack.getListPack().add(pack.getPack1());
        boxPack.getListPack().add(pack.getPack2());
        boxPack.getListPack().add(pack.getPack3());
        boxPack.getListPack().add(pack.getPack4());

        System.out.println(boxPack.getListPack());
    }
}
