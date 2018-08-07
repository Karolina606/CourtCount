package com.example.android.courtcount;

import android.widget.TextView;

public class MatchCounter {
    public Team teamA;
    public Team teamB;

    MatchCounter(String nameTeamA, String nameTeamB, TextView teamATextView, TextView teamBTextView){
        this.teamA = new Team(nameTeamA);
        this.teamB = new Team(nameTeamB);

        teamATextView.setText(nameTeamA);
        teamBTextView.setText(nameTeamB);
    }
}
