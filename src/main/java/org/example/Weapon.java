package org.example;

public enum Weapon {
    SWORD(8, 5),
    MACE(10, 3),
    CLUB(8, 3),
    ARROW(6, 6);

    private final int damage;
    private final double attackSpeed;

    // Enum constructor (no modifier needed, implicitly private)
    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage() {
        return this.damage;
    }

    public double getAttackSpeed() {
        return this.attackSpeed;
    }
}
