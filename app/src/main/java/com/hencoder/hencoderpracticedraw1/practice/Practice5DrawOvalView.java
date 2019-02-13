package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.Utils;

public class Practice5DrawOvalView extends View {
    Paint mPaint;
    int mScreenWidth;
    RectF rectF;
    private void init(Context context) {
        mPaint = new Paint();
        mPaint.setColor(Color.BLACK);
        mScreenWidth = Utils.getScreenWidth(context);

        rectF = new RectF();
        rectF.left = 200;
        rectF.top = 200;
        rectF.right = 600;
        rectF.bottom = 400;
    }
    public Practice5DrawOvalView(Context context) {
        super(context);
        init(context);
    }

    public Practice5DrawOvalView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public Practice5DrawOvalView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawOval() 方法画椭圆


        canvas.drawOval(rectF, mPaint);
    }
}
