package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Practic_3 extends Activity {

    TextView textView;
    String text;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prct3);

        textView = findViewById(R.id.textView);

        text = "\nonCreate";

        textView.setText(text);
    }

    @Override
    public void onPause() {
        super.onPause();

        text += "\nonPause";

        textView.setText(text);
    }

    @Override
    public void onResume() {
        super.onResume();

        text += "\nonResume";

        textView.setText(text);
    }

}
