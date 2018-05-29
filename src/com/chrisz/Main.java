package com.chrisz;

public class Main {

    public static void main(String[] args) {
	    // encapsulation is the mechanism which enables you to restrict access to certain components in a class
        // stopping outside from accessing class

        // *****EXAMPLE - this class doesn't use encapsulation **********
        Player player = new Player();
        player.name = "Chris";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 11;
        player.health = 200; // field can be accessed externally and modified
        // we want to be able to control this
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        // second problem is can't update names of fields in our Player class
        // if we want to change "player.name" to "player.fullName" we will get
        // errors in our Main class due to line 10

        // third problem is we can't ensure player health is set/valid range when we
        // create the instance. We could create a required field with a range validation

        // ******* EXAMPLE - this class uses encapsulation
        System.out.println("*********************");
        EnhancedPlayer newPlayer = new EnhancedPlayer("John", 150, "Spear");
        System.out.println("Initial health is " + newPlayer.getHitPoints());
    }

    // feature in IntelliJ
    // if you want to change name of variable, highlight it, right click, refactor -> rename, IntelliJ will highlight all
    // instances of that variable name and change them to your new name
}
