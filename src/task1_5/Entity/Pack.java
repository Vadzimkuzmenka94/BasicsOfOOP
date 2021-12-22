package task1_5.Entity;

public class Pack {
    String material;
    String colour;

    Pack pack = new Pack("Бумага", "Красный");
    Pack pack1 = new Pack("Бумага", "Красный");
    Pack pack2 = new Pack("Бумага", "Красный");
    Pack pack3 = new Pack("Бумага", "Красный");
    Pack pack4 = new Pack("Бумага", "Красный");
    Pack pack5 = new Pack("Бумага", "Красный");

    public Pack getPack() {
        return pack;
    }

    public void setPack(Pack pack) {
        this.pack = pack;
    }

    public Pack getPack1() {
        return pack1;
    }

    public void setPack1(Pack pack1) {
        this.pack1 = pack1;
    }

    public Pack getPack2() {
        return pack2;
    }

    public void setPack2(Pack pack2) {
        this.pack2 = pack2;
    }

    public Pack getPack3() {
        return pack3;
    }

    public void setPack3(Pack pack3) {
        this.pack3 = pack3;
    }

    public Pack getPack4() {
        return pack4;
    }

    public void setPack4(Pack pack4) {
        this.pack4 = pack4;
    }

    public Pack getPack5() {
        return pack5;
    }

    public void setPack5(Pack pack5) {
        this.pack5 = pack5;
    }

    public Pack(String material, String colour) {
        this.material = material;
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "" +
                "Материал - " + material + '\'' +
                " Цвет - " + colour + '\'';
    }
}
