package com.example.android.courtcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize a game
        TextView teamATextView = findViewById(R.id.team_a_text_view);
        TextView teamBTextView = findViewById(R.id.team_b_text_view);
        MatchCounter counter = new MatchCounter("WKS", "MOS", teamATextView, teamBTextView);
    }
}
