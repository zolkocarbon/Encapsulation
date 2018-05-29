package com.chrisz;

public class EnhancedPlayer {
    private String name;
    private int hitPoints = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health > 0 && health <= 100) {
            this.hitPoints = health;
        } else {
            System.out.println("Initial hitPoints value passed is outside valid range of 0-100," +
                    " default of " + this.hitPoints + " used.");
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.hitPoints = this.hitPoints - damage;
        if(this.hitPoints <=0) {
            System.out.println("Player knocked out");
            // Reduce number of lives remaining for player
        }
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
