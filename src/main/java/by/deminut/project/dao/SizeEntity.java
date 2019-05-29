package by.deminut.project.dao;

import javax.persistence.*;

@Entity
@Table(name = "size", schema = "wiz")
public class SizeEntity {
    private int id;
    private String name;
    private double toSmall;
    private double toMedium;
    private double toLarge;

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
    @Column(name = "toSmall", nullable = false, precision = 0)
    public double getToSmall() {
        return toSmall;
    }

    public void setToSmall(double toSmall) {
        this.toSmall = toSmall;
    }

    @Basic
    @Column(name = "toMedium", nullable = false, precision = 0)
    public double getToMedium() {
        return toMedium;
    }

    public void setToMedium(double toMedium) {
        this.toMedium = toMedium;
    }

    @Basic
    @Column(name = "toLarge", nullable = false, precision = 0)
    public double getToLarge() {
        return toLarge;
    }

    public void setToLarge(double toLarge) {
        this.toLarge = toLarge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SizeEntity that = (SizeEntity) o;

        if (id != that.id) return false;
        if (Double.compare(that.toSmall, toSmall) != 0) return false;
        if (Double.compare(that.toMedium, toMedium) != 0) return false;
        if (Double.compare(that.toLarge, toLarge) != 0) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        temp = Double.doubleToLongBits(toSmall);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(toMedium);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(toLarge);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "SizeEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", toSmall=" + toSmall +
                ", toMedium=" + toMedium +
                ", toLarge=" + toLarge +
                '}';
    }
}
