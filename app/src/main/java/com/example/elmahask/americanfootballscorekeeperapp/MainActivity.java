package com.example.elmahask.americanfootballscorekeeperapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTA = 0;
    int scoreTB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Team A
    public void displayForTeamA(int score) {
        TextView scoreTeamA = findViewById(R.id.txt_Score_Team_A);
        scoreTeamA.setText(String.valueOf(score));
    }


    public void add6PointsToA(View view) {
        scoreTA += 6;
        displayForTeamA(scoreTA);
    }

    public void add3PointsToA(View view) {
        scoreTA += 3;
        displayForTeamA(scoreTA);
    }

    public void add2PointsToA(View view) {
        scoreTA += 2;
        displayForTeamA(scoreTA);
    }

    public void add1PointToA(View view) {
        scoreTA += 1;
        displayForTeamA(scoreTA);
    }

    //Team B

    public void displayForTeamB(int score) {
        TextView scoreTeamB = findViewById(R.id.txt_Score_Team_B);
        scoreTeamB.setText(String.valueOf(score));
    }

    public void add6PointsToB(View view) {
        scoreTB += 6;
        displayForTeamB(scoreTB);
    }

    public void add3PointsToB(View view) {
        scoreTB += 3;
        displayForTeamB(scoreTB);
    }

    public void add2PointsToB(View view) {
        scoreTB += 2;
        displayForTeamB(scoreTB);
    }

    public void add1PointToB(View view) {
        scoreTB += 1;
        displayForTeamB(scoreTB);
    }

    public void clearScore(View view) {
        scoreTA = 0;
        scoreTB = 0;
        displayForTeamA(scoreTA);
        displayForTeamB(scoreTB);
    }

}
