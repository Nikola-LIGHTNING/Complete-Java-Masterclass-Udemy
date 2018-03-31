package com.tsvetkov;

public class Main {

    public static void main(String[] args) {
        // Without encapsulation(wrong)
//        Player player = new Player();
//
//        player.name = "Kolio";
//        player.health = 20;
//        player.weapon = "Pistol";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Nikola", 69, "AK-47");
        System.out.println("Initial health is " + enhancedPlayer.healthRemaining());



    }
}
