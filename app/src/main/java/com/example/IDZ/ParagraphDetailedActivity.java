package com.example.IDZ;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ParagraphDetailedActivity extends AppCompatActivity {

    private int index = 0;
    private Paragraph item;
    private TextView paragraph_title;
    private TextView paragraph_text;
    private TextView paragraph_test_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paragraph_detailed);
        Intent intent = this.getIntent();
        index = intent.getIntExtra("index",-1);
        item = (Paragraph) intent.getParcelableExtra("item");
        paragraph_title = (TextView) findViewById(R.id.paragraphTitle);
        paragraph_title.setText(item.paragraphTitle);
        paragraph_text = (TextView) findViewById(R.id.paragraphText);
        paragraph_text.setText(item.paragraphText);
        paragraph_test_text = (TextView) findViewById(R.id.paragraphTestText);
        paragraph_test_text.setText(item.paragraphTestText);
        Button rightAnswer = (Button) findViewById(R.id.button4);
        rightAnswer.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        rightClick();
                    }
                }
        );
        Button leftAnswer = (Button) findViewById(R.id.button6);
        leftAnswer.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        leftClick();
                    }
                }
        );
    }

    protected void rightClick(){
        if(item.paragraphTestAnswer.equals("Правда")){
            item.setParagraphTestScore(2);
        }
        Intent intent = new Intent();
        intent.putExtra("index", index);
        intent.putExtra("item", item);
        setResult(Activity.RESULT_OK,intent);
        finish();
    }

    protected  void leftClick(){
        if(item.paragraphTestAnswer.equals("Неправда")){
            item.setParagraphTestScore(2);
        }
        Intent intent = new Intent();
        intent.putExtra("index", index);
        intent.putExtra("item", item);
        setResult(Activity.RESULT_OK,intent);
        finish();
    }
}