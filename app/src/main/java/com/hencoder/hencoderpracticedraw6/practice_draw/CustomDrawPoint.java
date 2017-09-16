package com.hencoder.hencoderpracticedraw6.practice_draw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw6.Utils;

/**
 * Created by Administrator on 2017/9/15.
 */

public class CustomDrawPoint extends View {
    private Paint paint = new Paint();
    public CustomDrawPoint(Context context) {
        super(context);
    }

    public CustomDrawPoint(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setStrokeWidth(Utils.dpToPixel(20));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(Color.BLACK);
        canvas.drawPoint(getWidth()/2,getHeight()/2,paint);
    }
}
