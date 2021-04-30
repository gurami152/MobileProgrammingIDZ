package com.example.IDZ;

import java.util.ArrayList;

public class DataHolder {

        private ArrayList<Paragraph> data = null;

        public ArrayList<Paragraph> getData() {
            return data;
        }
        public void setData(ArrayList<Paragraph> data) {
            this.data = data;
        }

        private static final DataHolder holder = new DataHolder();

        public static DataHolder getInstance() {
            return holder;
        }

}
