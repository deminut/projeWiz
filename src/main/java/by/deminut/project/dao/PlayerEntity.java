package by.deminut.project.dao;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "player", schema = "wiz")
public class PlayerEntity {
    private int id;
    private String name;
    private int health;
    private int mana;
    private int defence;
    private int evasion;
    private int level;

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
    @Column(name = "mana", nullable = false)
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Basic
    @Column(name = "defence", nullable = false)
    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    @Basic
    @Column(name = "evasion", nullable = false)
    public int getEvasion() {
        return evasion;
    }

    public void setEvasion(int evasion) {
        this.evasion = evasion;
    }

    @Basic
    @Column(name = "level", nullable = false)
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlayerEntity that = (PlayerEntity) o;

        if (id != that.id) return false;
        if (health != that.health) return false;
        if (mana != that.mana) return false;
        if (defence != that.defence) return false;
        if (evasion != that.evasion) return false;
        if (level != that.level) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public String toString() {
        return "PlayerEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", health=" + health +
                ", mana=" + mana +
                ", defence=" + defence +
                ", evasion=" + evasion +
                ", level=" + level +
                '}';
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + health;
        result = 31 * result + mana;
        result = 31 * result + defence;
        result = 31 * result + evasion;
        result = 31 * result + level;
        return result;
    }
}
