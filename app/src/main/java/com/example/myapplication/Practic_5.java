package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.ScrollView;
import android.widget.TextView;

public class Practic_5 extends Activity implements OnKeyListener {
    StringBuilder builder = new StringBuilder();
    TextView textView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ScrollView scrollView = new ScrollView(this);

        textView = new TextView(this);
        textView.setTextSize(23);

        textView.setText("Press keys!");

        textView.setOnKeyListener(this);
        textView.setFocusableInTouchMode(true);
        textView.requestFocus();

        scrollView.addView(textView);
        setContentView(scrollView);
    }

    @Override
    public boolean onKey(View view, int keyCode, KeyEvent event) {
        switch (event.getAction()) {
            case KeyEvent.ACTION_DOWN:
                builder.append("\ndown ");
                break;
            case KeyEvent.ACTION_UP:
                builder.append("\nup ");
                break;
        }
        builder.append("\n" + event.getKeyCode() + ", " + event.getUnicodeChar());

        textView.setText(builder.toString());

        if (event.getKeyCode() == KeyEvent.KEYCODE_BACK)
            return false;
        else
            return true;
    }
}