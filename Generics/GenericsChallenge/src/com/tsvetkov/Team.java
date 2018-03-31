package com.tsvetkov;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;
    private int played = 0;
    private ArrayList<T> members = new ArrayList<T>();

    public Team(String name) {
        this.name = name;
    }

    public void playMatch(Team<T> opponent, int ourScore, int theirScore) {
        String message;
        if(ourScore > theirScore) {
            won++;
            message = " beat ";
        } else if(ourScore < theirScore) {
            lost++;
            message = " lost to ";
        } else {
            tied++;
            message = " drew with ";
        }


        if(opponent != null) {
            System.out.println(this.name + message + opponent.getName());
            opponent.playMatch(null, theirScore, ourScore);
        }
    }

    public String getName() {
        return this.name;
    }

    public int ranking() {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
//        if(this.ranking() > team.ranking()) {
//            return 1;
//        } else if(this.ranking() < team.ranking()) {
//            return -1;
//        } else {
//            return 0;
//        }
        return team.ranking() - this.ranking();
    }

    public boolean addPlayer(T player) {
        if(player != null) {
            members.add(player);
            System.out.println(player.getName() + " added to team " + this.name);
            return true;
        }
        return false;
    }

    public int getTeamSize() {
        return members.size();
    }
}
