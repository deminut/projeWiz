package by.deminut.project.dao;

import javax.persistence.*;

@Entity
@Table(name = "enemy", schema = "wiz")
public class EnemyEntity {
    private int id;
    private String name;
    private int health;
    private int dmgStart;
    private int dmgEnd;
    private SizeEntity sizeBySizeId;
    private ElementsEntity elementsByElementsId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 40)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "health", nullable = false)
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Basic
    @Column(name = "dmg_start", nullable = false)
    public int getDmgStart() {
        return dmgStart;
    }

    public void setDmgStart(int dmgStart) {
        this.dmgStart = dmgStart;
    }

    @Basic
    @Column(name = "dmg_end", nullable = false)
    public int getDmgEnd() {
        return dmgEnd;
    }

    public void setDmgEnd(int dmgEnd) {
        this.dmgEnd = dmgEnd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EnemyEntity that = (EnemyEntity) o;

        if (id != that.id) return false;
        if (health != that.health) return false;
        if (dmgStart != that.dmgStart) return false;
        if (dmgEnd != that.dmgEnd) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + health;
        result = 31 * result + dmgStart;
        result = 31 * result + dmgEnd;
        return result;
    }

    @Override
    public String toString() {
        return "EnemyEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", health=" + health +
                ", dmgStart=" + dmgStart +
                ", dmgEnd=" + dmgEnd +
                ", sizeBySizeId=" + sizeBySizeId +
                ", elementsByElementsId=" + elementsByElementsId +
                '}';
    }

    @ManyToOne
    @JoinColumn(name = "size_id", referencedColumnName = "id", nullable = false)
    public SizeEntity getSizeBySizeId() {
        return sizeBySizeId;
    }

    public void setSizeBySizeId(SizeEntity sizeBySizeId) {
        this.sizeBySizeId = sizeBySizeId;
    }

    @ManyToOne
    @JoinColumn(name = "elements_id", referencedColumnName = "id", nullable = false)
    public ElementsEntity getElementsByElementsId() {
        return elementsByElementsId;
    }

    public void setElementsByElementsId(ElementsEntity elementsByElementsId) {
        this.elementsByElementsId = elementsByElementsId;
    }


}
