package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形

        Paint paint=new Paint();
        Path path=new Path();

        path.addArc(500,500,700,700,-225,225);
        path.arcTo(700,500,900,700,-180,225,false);
        path.lineTo(700,850);
        path.close();

//        path.addArc(200, 200, 400, 400, -225, 225);
//        path.arcTo(400, 200, 600, 400, -180, 225, false);
//        path.lineTo(400, 542);

//        paint.setStyle(Paint.Style.STROKE);
//        path.lineTo(100, 100);
//        path.lineTo(0, 100);
//        path.arcTo(0, 0, 300, 300, 0, 90, false);

        canvas.drawPath(path,paint);

    }
}
