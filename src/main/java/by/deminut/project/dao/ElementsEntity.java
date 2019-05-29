package by.deminut.project.dao;

import javax.persistence.*;

@Entity
@Table(name = "elements", schema = "wiz", catalog = "")
public class ElementsEntity {
    private int id;
    private String name;
    private double toWind;
    private double toEarth;
    private double toWater;
    private double toFire;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "toWind", nullable = false, precision = 0)
    public double getToWind() {
        return toWind;
    }

    public void setToWind(double toWind) {
        this.toWind = toWind;
    }

    @Basic
    @Column(name = "toEarth", nullable = false, precision = 0)
    public double getToEarth() {
        return toEarth;
    }

    public void setToEarth(double toEarth) {
        this.toEarth = toEarth;
    }

    @Basic
    @Column(name = "toWater", nullable = false, precision = 0)
    public double getToWater() {
        return toWater;
    }

    public void setToWater(double toWater) {
        this.toWater = toWater;
    }

    @Basic
    @Column(name = "toFire", nullable = false, precision = 0)
    public double getToFire() {
        return toFire;
    }

    public void setToFire(double toFire) {
        this.toFire = toFire;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ElementsEntity that = (ElementsEntity) o;

        if (id != that.id) return false;
        if (Double.compare(that.toWind, toWind) != 0) return false;
        if (Double.compare(that.toEarth, toEarth) != 0) return false;
        if (Double.compare(that.toWater, toWater) != 0) return false;
        if (Double.compare(that.toFire, toFire) != 0) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        temp = Double.doubleToLongBits(toWind);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(toEarth);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(toWater);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(toFire);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "ElementsEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", toWind=" + toWind +
                ", toEarth=" + toEarth +
                ", toWater=" + toWater +
                ", toFire=" + toFire +
                '}';
    }
}
