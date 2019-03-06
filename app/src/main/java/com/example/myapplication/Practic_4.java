package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnTouchListener;

public class Practic_4 extends Activity implements OnTouchListener {

    TextView textView;
    String sDown;
    String sMove;
    String sUp;
    String sCansel;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        textView = new TextView(this);
        textView.setOnTouchListener(this);
        textView.setTextSize(26);
        setContentView(textView);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        int x = (int) event.getX();
        int y = (int) event.getY();

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                sDown = "Down: " + x + "," + y;
                break;
            case MotionEvent.ACTION_MOVE:
                sMove = "Move: " + x + "," + y;
                break;
            case MotionEvent.ACTION_UP:
                sUp = "Up: " + x + "," + y;
                break;
            case MotionEvent.ACTION_CANCEL:
                sCansel = "Cansel: " + x + y;
                break;
        }
        textView.setText(sDown + "\n" + sMove + "\n" + sUp);
        return true;
    }
}

