package com.tsvetkov;

public class Main {

    public static void main(String[] args) {
        // ArrayList<Team> team;
        // Collections.sort(team) (You have to implement interface Comparable in class team and the method compareTo)

        BasketballPlayer kolio = new BasketballPlayer("Nikola");
        BasketballPlayer fed = new BasketballPlayer("Roger");
        BasketballPlayer grigor = new BasketballPlayer("Grigor");
        BasketballPlayer rafa = new BasketballPlayer("Rafael");

        Team<BasketballPlayer> montana = new Team<BasketballPlayer>("Montana Stars");
        montana.addPlayer(kolio);
        montana.addPlayer(grigor);

        System.out.println(montana.getTeamSize());
        System.out.println(montana.ranking());

        Team<BasketballPlayer> europe = new Team<BasketballPlayer>("Tennis Bests");
        europe.addPlayer(fed);
        europe.addPlayer(rafa);

        System.out.println(europe.getTeamSize());
        System.out.println(europe.ranking());

        montana.playMatch(europe, 100, 120);
        montana.playMatch(europe, 110, 106);
        montana.playMatch(europe, 121, 121);
        montana.playMatch(europe, 150, 100);

        System.out.println(montana.getName() + " ranking: " + montana.ranking());
        System.out.println(europe.getName() + " ranking: " + europe.ranking());

        League<BasketballPlayer> firstLeague = new League<BasketballPlayer>("Star League");
        firstLeague.addTeam(montana);
        firstLeague.addTeam(europe);

        BasketballPlayer ionko = new BasketballPlayer("Ionko");
        BasketballPlayer gonka = new BasketballPlayer("Gonka");

        Team<BasketballPlayer> ludacite = new Team<BasketballPlayer>("Ludacite");
        ludacite.playMatch(europe, 111, 110);
        ludacite.playMatch(montana, 111, 111);
        firstLeague.addTeam(ludacite);
        firstLeague.printLeague();

        FootballPlayer koki = new FootballPlayer("Kolio, One Man Team");
        Team<FootballPlayer> chochkovci = new Team<FootballPlayer>("Chochkovci");
        firstLeague.addTeam(chochkovci);
    }
}
