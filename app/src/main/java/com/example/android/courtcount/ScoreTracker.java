package com.example.android.courtcount;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ScoreTracker extends AppCompatActivity {

    // ----------------------------- VARIABLES -----------------------------------------
    // Views into variables
    TextView scoreTeamA;
    TextView scoreTeamB;

    // MatchCounter and teams' names
    TextView teamATextView;
    TextView teamBTextView;
    MatchCounter counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_tracker);

        // From teamsNames
        Intent intent = getIntent();
        String teamAGivenName = intent.getStringExtra("team_a_given_name");
        String teamBGivenName = intent.getStringExtra("team_b_given_name");

        // Views into variables
        scoreTeamA = findViewById(R.id.score_team_a);
        scoreTeamB = findViewById(R.id.score_team_b);

        // Initialize a game
        teamATextView = findViewById(R.id.team_a_text_view);
        teamBTextView = findViewById(R.id.team_b_text_view);
        counter = new MatchCounter(teamAGivenName, teamBGivenName, teamATextView, teamBTextView);
    }

    // Score buttons mehod
    public void addScoreButton(View view) {
        counter.decideAndAddPoint(view);
        refresh();
    }

    // Refresh method
    public void refresh() {
        scoreTeamA.setText(String.valueOf(counter.teamA.score));
        scoreTeamB.setText(String.valueOf(counter.teamB.score));
    }

    // Reset method
    public void reset(View view) {
        counter.reset();
        refresh();
    }
}
