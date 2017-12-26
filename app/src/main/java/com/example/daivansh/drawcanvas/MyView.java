package com.example.daivansh.drawcanvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by daivansh on 08-11-2017.
 */

public class MyView extends View {
    Paint redbrush,greenbrush,bluebrush;
    public MyView(Context context) {
        super(context);
       // setBackgroundResource(R.mipmap.ic_launcher);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        redbrush=new Paint();
        redbrush.setColor(Color.RED);
        redbrush.setStyle(Paint.Style.STROKE);
        redbrush.setStrokeWidth(5);

        bluebrush=new Paint();
        bluebrush.setColor(Color.BLUE);
        bluebrush.setStyle(Paint.Style.STROKE);
        bluebrush.setStrokeWidth(5);

        greenbrush=new Paint();
        greenbrush.setColor(Color.GREEN);
        greenbrush.setStyle(Paint.Style.STROKE);
        greenbrush.setStrokeWidth(5);



//        Rect rect=new Rect();
//        rect.set(210,125,500,500);

       // canvas.drawRect(rect, redbrush);


        canvas.drawRect(100,100,500,500,redbrush);
       redbrush.setStyle(Paint.Style.FILL);
          canvas.drawRect(600,100,1000,500,redbrush);




        canvas.drawCircle(280,800,200,greenbrush);
        greenbrush.setStyle(Paint.Style.FILL);
        canvas.drawCircle(800,800,200,greenbrush);





        canvas.drawLine(280,1100,100,1500,bluebrush);
        canvas.drawLine(280,1100,460,1500,bluebrush);
        canvas.drawLine(100,1500,460,1500,bluebrush);

//
        int j=180;
        for(int i=400;i>150;i--)
        {
            canvas.drawLine(800,1100,800-j,1100+i,bluebrush);
            canvas.drawLine(800,1100,800+j,1100+i,bluebrush);
            canvas.drawLine(800-j,1100+i,800+j,1100+i,bluebrush);
            j--;
        }

//        canvas.drawLine(800,1100,620,1500,bluebrush);
//        canvas.drawLine(800,1100,980,1500,bluebrush);
//        canvas.drawLine(620,1500,980,1500,bluebrush);
//
//            int j=180;
//        for(int i=1500;i>100;i--)
//        {
//            canvas.drawLine(j,(i-400),j-180,i,bluebrush);
//            canvas.drawLine(j,i-400,j+180,i,bluebrush);
//            canvas.drawLine(j-180,i,j+180,i,bluebrush);
//            j--;
//        }
    }
}
