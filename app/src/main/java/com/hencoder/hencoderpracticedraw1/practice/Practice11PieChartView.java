package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        Paint paint =new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setTextSize(30);
        paint.setStrokeWidth(2);
        paint.setColor(Color.WHITE);
        Path path=new Path();
        path.moveTo(250,100);
        path.lineTo(450,100);
        path.lineTo(500,300);
        canvas.drawText("12313",150,100,paint);

        path.moveTo(1150,250);
        path.lineTo(1050,250);
        path.lineTo(950,300);
        canvas.drawText("32123",1160,250,paint);

        path.moveTo(1150,500);
        path.lineTo(1090,500);
        path.lineTo(1060,480);
        path.lineTo(1000,480);
        canvas.drawText("32323",1160,500,paint);

        path.moveTo(1150,550);
        path.lineTo(1090,550);
        path.lineTo(1060,520);
        path.lineTo(1000,520);
        canvas.drawText("32323",1160,550,paint);

        path.moveTo(1150,700);
        path.lineTo(1000,700);
        path.lineTo(900,620);
        canvas.drawText("12313",1160,700,paint);

        path.moveTo(300,750);
        path.lineTo(400,750);
        path.lineTo(450,700);
        canvas.drawText("12313",200,750,paint);

        canvas.drawPath(path,paint);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.RED);
        canvas.drawArc(300,100,1000,750,-180,120,true,paint);
        paint.setColor(Color.YELLOW);
        canvas.drawArc(320,120,1020,770,-60,60,true,paint);
        paint.setColor(Color.GREEN);
        canvas.drawArc(320,120,1020,770,2,6,true,paint);
        paint.setColor(Color.BLUE);
        canvas.drawArc(320,120,1020,770,11,5,true,paint);
        paint.setColor(Color.WHITE);
        canvas.drawArc(320,120,1020,770,18,69,true,paint);
        paint.setColor(Color.BLACK);
        canvas.drawArc(320,120,1020,770,90,88,true,paint);
    }
}
