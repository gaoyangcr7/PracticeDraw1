package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.Utils;

public class Practice2DrawCircleView extends View {

    int mScreenWidth;
    Paint mPaint;
    private void init(Context context) {
        mPaint = new Paint();
        mScreenWidth = Utils.getScreenWidth(context);
    }
    public Practice2DrawCircleView(Context context) {
        super(context);
        init(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆


        mPaint.setColor(Color.BLACK);
        canvas.drawCircle(mScreenWidth/3, Utils.dp2px(getContext(), 50),Utils.dp2px(getContext(), 50), mPaint);
        mPaint.setColor(Color.BLUE);
        canvas.drawCircle(mScreenWidth/3, Utils.dp2px(getContext(), 200),Utils.dp2px(getContext(), 50), mPaint);

        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(Utils.dp2px(getContext(), 5));
        canvas.drawCircle(mScreenWidth*2/3, Utils.dp2px(getContext(), 50), Utils.dp2px(getContext(), 50), mPaint);
        mPaint.setStrokeWidth(Utils.dp2px(getContext(), 20));
        canvas.drawCircle(mScreenWidth*2/3, Utils.dp2px(getContext(), 200), Utils.dp2px(getContext(), 50), mPaint);


    }
}
