package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        Paint paint=new Paint();
        paint.setStrokeWidth(2);

        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(215,790,315,800,paint);
        canvas.drawRect(365,700,465,800,paint);
        canvas.drawRect(515,690,615,800,paint);
        canvas.drawRect(665,300,765,800,paint);
        canvas.drawRect(815,400,915,800,paint);
        canvas.drawRect(965,500,1065,800,paint);
        canvas.drawRect(1115,200,1215,800,paint);

        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.WHITE);

        paint.setTextSize(30);
        paint.setStrokeWidth(1);
        canvas.drawText("你",250,850,paint);
        canvas.drawText("我",400,850,paint);
        canvas.drawText("他",550,850,paint);
        canvas.drawText("谁呢",690,850,paint);
        canvas.drawText("我啊",840,850,paint);
        canvas.drawText("你啊",990,850,paint);
        canvas.drawText("他啊",1140,850,paint);

        Path path=new Path();
        path.moveTo(200,50);
        path.lineTo(200,800);
        path.lineTo(1300,800);

        canvas.drawPath(path,paint);

    }
}
