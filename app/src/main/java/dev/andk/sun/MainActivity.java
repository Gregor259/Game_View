package dev.andk.sun;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyView mv = new MyView(this, null);
        mv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                MyView mv = (MyView) view;
                if (motionEvent.getX()-30 <= mv.x && mv.x <= motionEvent.getX()+30 && mv.y <= motionEvent.getY()+30 && mv.y >= motionEvent.getY()-30){
                    mv.r += 50;
                }else {
                    mv.x = motionEvent.getX();
                    mv.y = motionEvent.getY();
                    mv.r = 300;
                }
                return false;
            }
        });
        setContentView(mv);
    }
}