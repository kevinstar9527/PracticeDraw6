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

public class CustomGlass extends View {

    private Paint mPaint = new Paint();
    private Paint mPointPaint = new Paint();
    private int distance = 60;
    private int radius = 30;

    public CustomGlass(Context context) {
        super(context);
    }

    public CustomGlass(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int centerX = getWidth()/2;
        int centerY = getHeight()/2;

        mPaint.setStrokeWidth(Utils.dpToPixel(3));
        mPaint.setStyle(Paint.Style.STROKE);

        mPointPaint.setStrokeWidth(Utils.dpToPixel(10));
        mPointPaint.setStrokeCap(Paint.Cap.ROUND);
        mPointPaint.setColor(Color.BLACK);

        canvas.drawCircle(centerX-Utils.dpToPixel(distance),centerY,Utils.dpToPixel(radius),mPaint);

        double temp = Math.sqrt(radius*radius/2);
        canvas.drawPoint(centerX-Utils.dpToPixel(distance)-(float)temp,centerY-(float)temp,mPointPaint);

       canvas.drawCircle(centerX+Utils.dpToPixel(distance),centerY,Utils.dpToPixel(radius),mPaint);
        canvas.drawPoint(centerX+Utils.dpToPixel(distance),centerY,mPointPaint);

    }
}
