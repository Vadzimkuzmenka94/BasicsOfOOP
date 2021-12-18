package task1_4.Entity;

import java.util.Objects;

public class Treasure {
    String name;
    int coast;
    int id;

    @Override
    public String toString() {
        return "Treasure{" +
                "name='" + name + '\'' +
                ", coast=" + coast +
                ", id=" + id +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Treasure(String name, int coast, int id) {
        this.name = name;
        this.coast = coast;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getCoast() {
        return coast;
    }

    public void setCoast(int coast) {
        this.coast = coast;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Treasure treasure = (Treasure) o;
        return coast == treasure.coast && id == treasure.id && Objects.equals(name, treasure.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, coast, id);
    }
}
