package com.example.IDZ;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button paragraphsButton = (Button) findViewById(R.id.button3);
        paragraphsButton.setOnClickListener(
                new View.OnClickListener() {
            public void onClick(View v) {
                openParagraphsActivity();
            }
        }
        );
        Button taskButton = (Button) findViewById(R.id.button2);
        taskButton.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        openTasksActivity();
                    }
                }
        );
        Button scoreButton = (Button) findViewById(R.id.button);
        scoreButton.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        openScoreActivity();
                    }
                }
        );
    }

    private void openParagraphsActivity() {
        Intent intent = new Intent(this, ParagraphActivity.class);
        startActivity(intent);
    }

    private void openTasksActivity() {
        Intent intent = new Intent(this, TasksActivity.class);
        startActivity(intent);
    }
    private void openScoreActivity() {
        Intent intent = new Intent(this, ScoresActivity.class);
        startActivity(intent);
    }
}