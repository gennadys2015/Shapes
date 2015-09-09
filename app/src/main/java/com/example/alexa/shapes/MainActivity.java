package com.example.alexa.shapes;

import android.app.AlertDialog;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String colors[] = {"Red","Blue","White","Yellow","Black", "Green","Purple","Orange","Grey"};
    EditText xc;
    EditText yc;
    EditText xr;
    EditText yr;
    EditText hr;
    EditText wr;
    EditText rc;
    Spinner ColorC;
    Spinner ColorR;
    RelativeLayout display;
    DrawShapes circle;
    DrawShapes rect;
    Button draw;
    Button clear;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//circle
        ColorC = (Spinner) findViewById(R.id.ColorSpinner0);
        xc = (EditText) findViewById(R.id.xc);
        yc = (EditText) findViewById(R.id.yc);
        rc = (EditText) findViewById(R.id.rc);
//rect
        ColorR = (Spinner) findViewById(R.id.ColorSpinner);
        xr = (EditText) findViewById(R.id.xr);
        yr = (EditText) findViewById(R.id.yr);
        hr = (EditText) findViewById(R.id.hr);
        wr = (EditText) findViewById(R.id.wr);


        draw = (Button) findViewById(R.id.draw);
        clear = (Button) findViewById(R.id.clear);
        display = (RelativeLayout) findViewById(R.id.display);
        draw.setOnClickListener(this);
        clear.setOnClickListener(this);


        ArrayAdapter<String> spinnerArrayAdapter0 = new ArrayAdapter<>(this,   android.R.layout.simple_spinner_item, colors);
        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<>(this,   android.R.layout.simple_spinner_item, colors);
        spinnerArrayAdapter0.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ColorC.setAdapter(spinnerArrayAdapter0);
        ColorR.setAdapter(spinnerArrayAdapter);





    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
            if (v==draw) {
                if (xc.getText().toString().equals("") ||
                        yc.getText().toString().equals("") ||
                        rc.getText().toString().equals("") ||
                        xr.getText().toString().equals("") ||
                        yr.getText().toString().equals("") ||
                        wr.getText().toString().equals("") ||
                        hr.getText().toString().equals("")) {

                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(R.string.errMsg);
                    builder.setTitle("Fields Require!");
                    builder.setPositiveButton("OK", null);
                    builder.create();
                    builder.show();
                } else
                    createShapes();
            }
        else
            {
               Clear();
            }


    }

    //create shapes
public void createShapes(){
//circle
    int x = Integer.parseInt(xc.getText().toString());
    int y = Integer.parseInt(yc.getText().toString());
    int rrr = Integer.parseInt(rc.getText().toString());
    int cc =Color.parseColor(ColorC.getSelectedItem().toString());
    circle = new DrawShapes(x,y,rrr,cc,this);
    circle.test(false);
    display.addView(circle);
        int xx = Integer.parseInt(xr.getText().toString());
    int yy = Integer.parseInt(yr.getText().toString());
    int hh = Integer.parseInt(hr.getText().toString());
    int ww = Integer.parseInt(wr.getText().toString());
    int cr =Color.parseColor(ColorR.getSelectedItem().toString());
    rect = new DrawShapes(xx,yy,xx+hh,yy+ww,cr,this);
    rect.test(true);
    display.addView(rect);

//rect


 }
    public void Clear(){this.recreate();}

}
