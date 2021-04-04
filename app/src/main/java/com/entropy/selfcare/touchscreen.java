package com.entropy.selfcare;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;

class TouchScreen extends View {
    Paint mypaint;
    Path mypath;
    public TouchScreen( Context con, @Nullable AttributeSet attrs)
    {
        super(con,attrs);
        mypaint=new Paint();
        mypath=new Path();

        mypaint.setColor(Color.RED);
        mypaint.setStrokeWidth(15f);
        mypaint.setStyle(Paint.Style.STROKE);
        mypaint.setStrokeJoin(Paint.Join.ROUND);
    }
    public void onDrawForeground(Canvas c)
    {
        c.drawPath(mypath,mypaint);
    }
    public boolean onTouchEvent(MotionEvent event)
    {
        float xcoord=event.getX();
        float ycoord=event.getY();
        switch(event.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                mypath.moveTo(xcoord,ycoord);
                return true;
            case MotionEvent.ACTION_MOVE:
                mypath.lineTo(xcoord,ycoord);
                break;
            case MotionEvent.ACTION_UP:
                break;
            default:
                return false;
        }
        invalidate();
        return true;
    }
    public void clearCanvas()
    {
        invalidate();
        mypath.reset();
    }
    public void changeColor(String str)
    {
        mypaint.setColor(Color.parseColor(str));
    }
}
