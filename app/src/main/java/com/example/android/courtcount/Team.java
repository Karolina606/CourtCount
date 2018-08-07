package com.example.android.courtcount;

public class Team {
    public String name;
    private int score = 0;

    Team(String name){
        name = this.name;
    }

    public void addPoints(int points){
        score += points;
    }

    public int getScore(){
        return score;
    }
}
