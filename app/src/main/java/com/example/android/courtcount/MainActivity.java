package com.example.android.courtcount;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // ----------------------------- VARIABLES -----------------------------------------
    // Views into variables
    TextView scoreTeamA;
    TextView scoreTeamB;

    // MatchCounter and teams' names
    TextView teamATextView;
    TextView teamBTextView;
    MatchCounter counter;

    // Buttons
    Button threePointsButtonA;
    Button twoPointsButtonA;
    Button onePointButtonA;
    Button threePointsButtonB;
    Button twoPointsButtonB;
    Button onePointButtonB;
    Button resetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Buttons variable
        threePointsButtonA = findViewById(R.id.three_points_button_a);
        twoPointsButtonA = findViewById(R.id.two_points_button_a);
        onePointButtonA = findViewById(R.id.one_point_button_a);
        threePointsButtonB = findViewById(R.id.three_points_button_b);
        twoPointsButtonB = findViewById(R.id.two_points_button_b);
        onePointButtonB = findViewById(R.id.one_point_button_b);
        resetButton = findViewById(R.id.reset_button);

        // Reset listner
        View.OnClickListener resetListner = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
            }
        };
        resetButton.setOnClickListener(resetListner);

        // Score buttons listner
        View.OnClickListener scoreButtonListner = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter.decideAndAddPoint(v);
                refresh();
            }
        };
        threePointsButtonA.setOnClickListener(scoreButtonListner);
        twoPointsButtonA.setOnClickListener(scoreButtonListner);
        onePointButtonA.setOnClickListener(scoreButtonListner);
        threePointsButtonB.setOnClickListener(scoreButtonListner);
        twoPointsButtonB.setOnClickListener(scoreButtonListner);
        onePointButtonB.setOnClickListener(scoreButtonListner);

        // Views into variables
        scoreTeamA = findViewById(R.id.score_team_a);
        scoreTeamB = findViewById(R.id.score_team_b);

        // Initialize a game
        teamATextView = findViewById(R.id.team_a_text_view);
        teamBTextView = findViewById(R.id.team_b_text_view);
        counter = new MatchCounter("WKS", "MOS", teamATextView, teamBTextView);
    }


    // Refresh method
    public void refresh() {
        scoreTeamA.setText(String.valueOf(counter.teamA.score));
        scoreTeamB.setText(String.valueOf(counter.teamB.score));
    }

    // Reset method
    public void reset() {
        counter.reset();
        refresh();
    }
}
