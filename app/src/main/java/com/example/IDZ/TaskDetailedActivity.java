package com.example.IDZ;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TaskDetailedActivity extends AppCompatActivity {

    private int index = 0;
    private Paragraph item;
    private TextView taskTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_detailed);
        Intent intent = this.getIntent();
        index = intent.getIntExtra("index",-1);
        item = (Paragraph) intent.getParcelableExtra("item");
        taskTitle = (TextView) findViewById(R.id.textView);
        taskTitle.setText(item.paragraphTask);
        Button buttonSend = findViewById(R.id.button5);
        buttonSend.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        buttonSend();
                    }
                }
        );
    }

    private void buttonSend() {
        EditText editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        String strInput = editTextTextPersonName.getText().toString();
        if(item.paragraphTaskAnswer.equals(strInput)){
            item.paragraphTaskScore = 10;
        }
        Intent intent = new Intent();
        intent.putExtra("index", index);
        intent.putExtra("item", item);
        setResult(Activity.RESULT_OK,intent);
        finish();
    }
}