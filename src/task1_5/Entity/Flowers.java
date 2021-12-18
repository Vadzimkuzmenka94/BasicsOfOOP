package task1_5.Entity;

public class Flowers {
    String title;
    String colour;
    int number;

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
