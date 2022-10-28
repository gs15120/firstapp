package com.example.firstapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class SampleView extends View{

    private Paint paint = new Paint();

    public SampleView(Context context)
    {
        super(context);
        setBackgroundColor(Color.rgb(255,255,255));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setTextSize(50);
        canvas.drawText("Hello world!",30,200,paint);
    }
}
