package task1_5.Entity;

public class Flowers {
    String title;
    String colour;
    int number;

    Flowers flowers = new Flowers("Розы", "Красные", 23);
    Flowers flowers1 = new Flowers("Питуньи", "Зеленые", 3);
    Flowers flowers2 = new Flowers("Тюльпаны", "Желтые", 23);
    Flowers flowers3 = new Flowers("Маргаритки", "Красные", 23);
    Flowers flowers4 = new Flowers("Шиповник", "Оранжевый", 23);
    Flowers flowers5 = new Flowers("Ольховник", "Красные", 23);

    public Flowers getFlowers() {
        return flowers;
    }

    public void setFlowers(Flowers flowers) {
        this.flowers = flowers;
    }

    public Flowers getFlowers1() {
        return flowers1;
    }

    public void setFlowers1(Flowers flowers1) {
        this.flowers1 = flowers1;
    }

    public Flowers getFlowers2() {
        return flowers2;
    }

    public void setFlowers2(Flowers flowers2) {
        this.flowers2 = flowers2;
    }

    public Flowers getFlowers3() {
        return flowers3;
    }

    public void setFlowers3(Flowers flowers3) {
        this.flowers3 = flowers3;
    }

    public Flowers getFlowers4() {
        return flowers4;
    }

    public void setFlowers4(Flowers flowers4) {
        this.flowers4 = flowers4;
    }

    public Flowers getFlowers5() {
        return flowers5;
    }

    public void setFlowers5(Flowers flowers5) {
        this.flowers5 = flowers5;
    }

    public Flowers(String title, String colour, int number) {
        this.title = title;
        this.colour = colour;
        this.number = number;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "" +
                "Название - " + title + '\'' +
                ", Цвет - " + colour + '\'' +
                ", Количество - " + number;
    }
}
