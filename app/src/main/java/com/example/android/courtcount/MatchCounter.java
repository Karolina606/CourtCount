package com.example.android.courtcount;

import android.view.View;
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

    // Decide which team and how many points
    public void decideAndAddPoint(View v) {
        int points = 0;
        Team forTeam = null;

        switch (v.getId()) {
            case R.id.one_point_button_a:
                forTeam = teamA;
                points = 1;
                break;

            case R.id.two_points_button_a:
                forTeam = teamA;
                points = 2;
                break;

            case R.id.three_points_button_a:
                forTeam = teamA;
                points = 3;
                break;

            case R.id.one_point_button_b:
                forTeam = teamB;
                points = 1;
                break;

            case R.id.two_points_button_b:
                forTeam = teamB;
                points = 2;
                break;

            case R.id.three_points_button_b:
                forTeam = teamB;
                points = 3;
                break;
        }
        addPoints(forTeam, points);
    }

    // Add points method
    private void addPoints(Team team, int points) {
        team.addPoints(points);
    }

    // Reset teams' scores
    public void reset() {
        teamA.score = 0;
        teamB.score = 0;
    }
}
