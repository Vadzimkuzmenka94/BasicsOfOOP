package task1_5.Entity;

import java.util.Objects;

public class Bouquet {
    private String title;
    private BoxFlowers boxFlowers;
    private BoxPack boxPack;

    public Bouquet(String title, BoxFlowers boxFlowers, BoxPack boxPack) {
        this.title = title;
        this.boxFlowers = boxFlowers;
        this.boxPack = boxPack;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BoxFlowers getBoxFlowers() {
        return boxFlowers;
    }

    public void setBoxFlowers(BoxFlowers boxFlowers) {
        this.boxFlowers = boxFlowers;
    }

    public BoxPack getBoxPack() {
        return boxPack;
    }

    public void setBoxPack(BoxPack boxPack) {
        this.boxPack = boxPack;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bouquet bouquet = (Bouquet) o;
        return Objects.equals(title, bouquet.title) && Objects.equals(boxFlowers, bouquet.boxFlowers) && Objects.equals(boxPack, bouquet.boxPack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, boxFlowers, boxPack);
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "title='" + title + '\'' +
                ", boxFlowers=" + boxFlowers +
                ", boxPack=" + boxPack +
                '}';
    }
}
