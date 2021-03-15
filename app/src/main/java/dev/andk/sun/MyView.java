package dev.andk.sun;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class MyView extends View {
    float x = 520, y = 1000;
    float r = 50;

    public MyView(Context context, @Nullable AttributeSet attrs){
        super(context, attrs);
    }

    public void onDraw(Canvas canvas){
        super.onDraw(canvas);
        Paint p = new Paint();
        p.setColor(Color.BLUE);
        p.setStyle(Paint.Style.FILL);
        canvas.drawCircle(x,y,r,p);
        this.invalidate();
    }
}
