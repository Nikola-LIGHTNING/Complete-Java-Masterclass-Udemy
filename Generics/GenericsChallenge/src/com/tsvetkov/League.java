package com.tsvetkov;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Player> {
    private String name;
    private ArrayList<Team<T>> teams;

    public League(String name) {
        this.name = name;
        teams = new ArrayList<Team<T>>();
    }

    public boolean addTeam(Team<T> newTeam) {
        if(findTeam(newTeam) != null) {
            teams.add(newTeam);
            System.out.println(newTeam.getName() + " added to league " + this.name);
            return true;
        }

        return false;
    }

    public void printLeague() {
        Collections.sort(teams);

        int i = 1;
        for(Team<T> team : teams) {
            System.out.println(i + ". " + team.getName() + ", Score: " + team.ranking());
            i++;
        }
    }

    private Team<T> findTeam(Team<T> compareTeam) {
        if(teams.isEmpty()) {
            return compareTeam;
        } else {
            for(Team<T> team : teams) {
                if(team.getName().equals(compareTeam.getName())) {
                    return null;
                }
            }
        }

        return compareTeam;
    }
}
