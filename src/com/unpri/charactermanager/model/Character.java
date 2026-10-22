package com.unpri.charactermanager.model;

import java.util.Objects;

public class Character {
    
    private int id;
    private final String name;
    private final CharacterType type;
    private int level;
    private int hitPoints;
    private int attackPower;
    private int mana;

    // Constructor 1 (Inisialisasi standar dengan nilai default mana = 50)
    public Character(String name, CharacterType type, int level)  {
        this.name = name;
        this.type = type;
        this.level = level;
        this.hitPoints = calculateBaseHP();
        this.attackPower = calculateBaseAttack();
        this.mana = 50; 
    }

    // Constructor 2 (Inisialisasi lengkap dengan ID dan atribut lainnya)
    public Character(int id, String name, CharacterType type, int level, int hitPoints, int attackPower, int mana)  {
        this.id = id;
        this.name = name;
        this.type = type;
        this.level = level;
        this.hitPoints = hitPoints;
        this.attackPower = attackPower;
        this.mana = mana;
    }

    private int calculateBaseHP()  {
        return 100 + (level * 10);
    }

    private int calculateBaseAttack()  {
        return 10 + (level * 5);
    }

    // Getter dan Setter
    public int getId()  { return id; }
    public String getName()  { return name; }
    public CharacterType getType()  { return type; }
    public int getLevel()  { return level; }
    public int getHitPoints()  { return hitPoints; }
    public int getAttackPower()  { return attackPower; }
    public int getMana() { return mana; }

    public void setId(int id) {
        this.id = id;
    }

    public void setLevel(int level) {
        if (level < 1) {
            throw new IllegalArgumentException("Level minimal adalah 1");
        }
        this.level = level;
        this.hitPoints = calculateBaseHP();
        this.attackPower = calculateBaseAttack();
    }

    public void setMana(int mana) {
        if (mana < 0) {
            throw new IllegalArgumentException("Mana tidak boleh bernilai negatif!");
        }
        this.mana = mana;
    }

    public boolean isAlive() {
        return this.hitPoints > 0;
    }

    @Override 
    public String toString() {
        return "Character{id=" + id +
               ", name='" + name + '\'' +
               ", type=" + type +
               ", level=" + level +
               ", hp=" + hitPoints +
               ", atk=" + attackPower +
               ", mana=" + mana + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;                    
        if (!(obj instanceof Character)) return false;    
        Character other = (Character) obj;                
        return Objects.equals(this.name, other.name);       
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
