package task1_5.Entity;

public class Pack {
    String material;
    String colour;

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
