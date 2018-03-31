package com.tsvetkov;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer peter = new BaseballPlayer("Peter");
        SoccerPlayer berbatov = new SoccerPlayer("Berbatov");

        Team<SoccerPlayer> montanaBlues = new Team<>("Montana Blues");
        montanaBlues.addPlayer(berbatov);
//        montanaBlues.addPlayer(peter);
//        montanaBlues.addPlayer(joe);

        System.out.println(montanaBlues.getName());
        System.out.println(montanaBlues.numPlayers());

        Team<BaseballPlayer> newTeam = new Team<>("CSKA");
        newTeam.addPlayer(peter);

        Team<FootballPlayer> levski = new Team<>("Levski");
        Team<FootballPlayer> cska = new Team<>("CSKA Sofia");
        Team<FootballPlayer> botev = new Team<>("Botev Plovdiv");

        levski.matchResult(cska, 1, 2);
        levski.matchResult(botev, 4, 3);
        botev.matchResult(cska, 3, 5);
        System.out.println(levski.getName() + " ranking: " + levski.ranking());
        System.out.println(botev.getName() + " ranking: " + botev.ranking());
        System.out.println(cska.getName() + " ranking: " + cska.ranking());

        System.out.println(levski.compareTo(cska));
        System.out.println(levski.compareTo(botev));
        System.out.println(botev.compareTo(cska));

    }
}
