package com.example.IDZ;

import android.os.Parcel;
import android.os.Parcelable;

public class Paragraph implements Parcelable {

    String paragraphTitle = "Test";
    String paragraphText = "";
    String studentEmail = "";
    String paragraphTestText = "";
    String paragraphTestAnswer = "";
    Integer paragraphTestScore = 0;
    Integer paragraphTaskScore = 0;
    String paragraphTask = "";
    String paragraphTaskAnswer ="";

    public void setParagraphTestScore(Integer paragraphTestScore) {
        this.paragraphTestScore = paragraphTestScore;
    }

    protected Paragraph(Parcel in) {
        paragraphTitle = in.readString();
        paragraphText = in.readString();
        studentEmail = in.readString();
        paragraphTestText = in.readString();
        paragraphTestAnswer = in.readString();
        paragraphTestScore = in.readInt();
        paragraphTaskScore = in.readInt();
        paragraphTask = in.readString();
        paragraphTaskAnswer = in.readString();
    }

    public Paragraph() {

    }

    public Paragraph(String title, String text, String testText, String answer, String task, String taskAnswer) {
        this.paragraphTitle = title;
        this.paragraphText = text;
        this.paragraphTestText = testText;
        this.paragraphTestAnswer = answer;
        this.paragraphTask = task;
        this.paragraphTaskAnswer = taskAnswer;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(paragraphTitle);
        dest.writeString(paragraphText);
        dest.writeString(studentEmail);
        dest.writeString(paragraphTestText);
        dest.writeString(paragraphTestAnswer);
        dest.writeInt(paragraphTestScore);
        dest.writeInt(paragraphTaskScore);
        dest.writeString(paragraphTask);
        dest.writeString(paragraphTaskAnswer);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Paragraph> CREATOR = new Creator<Paragraph>() {
        @Override
        public Paragraph createFromParcel(Parcel in) {
            return new Paragraph(in);
        }

        @Override
        public Paragraph[] newArray(int size) {
            return new Paragraph[size];
        }
    };
}
