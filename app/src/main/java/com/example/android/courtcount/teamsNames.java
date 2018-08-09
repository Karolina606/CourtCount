package com.example.android.courtcount;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class teamsNames extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teams_names);
    }

    public void submitTeamsNames(View view) {
        EditText nameAEditText = findViewById(R.id.team_a_given_name);
        EditText nameBEditText = findViewById(R.id.team_b_given_name);

        String nameA = nameAEditText.getText().toString();
        String nameB = nameBEditText.getText().toString();

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("team_a_given_name", nameA);
        intent.putExtra("team_b_given_name", nameB);

        startActivity(intent);
    }

}
