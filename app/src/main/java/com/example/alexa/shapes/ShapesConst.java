package com.example.alexa.shapes;

import android.content.Context;
import android.graphics.Color;
import android.view.View;


public class ShapesConst extends View {
    private int xc;
    private int yc;
    private int rc;
    private int xr;
    private int yr;
    private int hr;
    private int wr;

    private int colorC;
    private int colorR;

//default shapes
    public ShapesConst(Context d) {
        super(d);
        xc = 200;
        yc = 200;
        rc = 150;
        xr = 300;
        yr = 300;
        hr = 150;
        wr = 250;
        colorC = Color.BLUE;
        colorR = Color.RED;
    }
// circle shape
    public ShapesConst(int xc, int yc, int r, int colorC, Context c) {
        super(c);
        this.xc = xc;
        this.yc = yc;
        this.rc = r;
        this.colorC = colorC;

    }
//rect shape
    public ShapesConst(int xr, int yr, int hr, int wr, int colorR, Context rec) {
        super(rec);
        this.xr = xr;
        this.yr = yr;
        this.hr = hr;
        this.wr = wr;
        this.colorR = colorR;

    }

    //circle get
    public int GetXC() {
        return xc;
    }

    public int GetYC() {
        return yc;
    }

    public int GetR() {
        return rc;
    }

    public int GetColorC() {
        return colorC;
    }

    //rect get
    public int GetXR() {
        return xr;
    }

    public int GetYR() {
        return yr;
    }

    public int GetH() {
        return hr;
    }

    public int GetW() {
        return wr;
    }

    public int GetColorR() {
        return colorR;
    }

    //circle set
    public void setXC(int xc) {
        this.xc = xc;
    }
    public void setYC(int yc) {
        this.yc = yc;
    }
    public void setR(int r) {
        this.rc = r;
    }
    public void setColorC(int colorC)
    {
        this.colorC = colorC;
    }

    //rect set
    public void setXR(int xr) {
        this.xr = xr;
    }
    public void setYR(int yr) {
        this.yr = yr;
    } public void setH(int h) {
        this.hr = h;
    } public void setW(int w) {
        this.wr = w;

    } public void setColorR(int colorR) {
        this.colorR = colorR;
    }



}