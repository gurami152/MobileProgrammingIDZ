package com.example.IDZ;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ScoresAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Paragraph> students;

    public ScoresAdapter(Context context, ArrayList<Paragraph> students) {
        this.context = context;
        this.students = students;
    }

    @Override
    public int getCount() {
        return students.size();
    }

    @Override
    public Object getItem(int position) {
        return students.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.score_item, parent, false);
        }
        Paragraph currentStudent = (Paragraph) getItem(position);
        TextView textViewItemName = (TextView) convertView.findViewById(R.id.item_name);
        textViewItemName.setText(currentStudent.paragraphTitle);
        TextView textViewItemClassification = (TextView) convertView.findViewById(R.id.item_score);
        int score = currentStudent.paragraphTaskScore + currentStudent.paragraphTestScore;
        textViewItemClassification.setText("Оценка за тест: " +Integer.toString(currentStudent.paragraphTestScore) +
                "\n Оценка за задание: "+ Integer.toString(currentStudent.paragraphTaskScore)+
                "\n Общая оценка за параграф "+ Integer.toString(score));
        return convertView;
    }
}
