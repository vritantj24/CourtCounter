package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreofA=0,scoreofB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addoneforA(View view)
    {
        scoreofA++;
        displayForTeamA(scoreofA);
    }
    public void addtwoforA(View view)
    {
        scoreofA+=2;
        displayForTeamA(scoreofA);
    }
    public void addthreeforA(View view)
    {
        scoreofA+=3;
        displayForTeamA(scoreofA);
    }
    public void addoneforB(View view)
    {
        scoreofB++;
        displayForTeamB(scoreofB);
    }
    public void addtwoforB(View view)
    {
        scoreofB+=2;
        displayForTeamB(scoreofB);
    }
    public void addthreeforB(View view)
    {
        scoreofB+=3;
        displayForTeamB(scoreofB);
    }
    public void reset(View view)
    {
        scoreofA=0;
        scoreofB=0;
        displayForTeamA(scoreofA);
        displayForTeamB(scoreofB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}