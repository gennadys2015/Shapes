package com.example.alexa.shapes;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;


public class DrawShapes extends ShapesConst {
    public boolean flag=false;

    //circle
    public DrawShapes(int xc, int yc, int rc, int colorC, Context c) {
        super(c);
        setXC(xc);
        setYC(yc);
        setColorC(colorC);
        setR(rc);
    }

    //rect
    public DrawShapes(int xr, int yr, int hr, int wr, int colorR, Context r) {
        super(r);
        setXR(xr);
        setYR(yr);
        setH(hr);
        setW(wr);
        setColorR(colorR);

    }



    public void test(boolean flag) {
        this.flag=flag;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


        Paint paint = new Paint();
        if (flag) {

            paint.setColor(GetColorR());
            canvas.drawRect(GetXR(), GetYR(), GetXR() + GetYR(), GetW() + GetH(), paint);

        } else {
            paint.setColor(GetColorC());
            canvas.drawCircle(GetXC(), GetYC(), GetR(), paint);
        }
    }
}