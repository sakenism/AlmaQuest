package com.example.saken.vst;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.saken.vst.R;

public class MainActivity extends AppCompatActivity {

    private Button buttonQuests, buttonAchive, buttonAlbums;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonQuests = (Button) findViewById(R.id.buttonQuests);
        buttonQuests.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openQuests();
            }
        });
        buttonAchive = (Button) findViewById(R.id.buttonAchive);
        buttonAchive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAchivements();
            }
        });
        buttonAlbums = (Button) findViewById(R.id.buttonAlbums);
        buttonAlbums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAlbums();
            }
        });

    }
    public void openQuests(){
        Intent intent = new Intent(this, Quests.class);
        startActivity(intent);
    }
    public void openAchivements(){
        Intent intent = new Intent(this, Achivements.class);
        startActivity(intent);
    }

    public void openAlbums(){
        Intent intent = new Intent(this, Albums.class);
        startActivity(intent);
    }
}
