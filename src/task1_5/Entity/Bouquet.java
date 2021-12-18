package task1_5.Entity;

public class Bouquet {
    private String title;
    private Flowers flowers;
    private Pack pack;

    public Bouquet(String title, Flowers flowers, Pack pack) {
        this.title = title;
        this.flowers = flowers;
        this.pack = pack;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Flowers getFlowers() {
        return flowers;
    }

    public void setFlowers(Flowers flowers) {
        this.flowers = flowers;
    }

    public Pack getPack() {
        return pack;
    }

    public void setPack(Pack pack) {
        this.pack = pack;
    }

    @Override
    public String toString() {
        return "" +
                " Название букета - " + "(" + title + ")" + '\'' +
                "Цветы - " + flowers +
                " Упаковка" + pack
                ;
    }
}
