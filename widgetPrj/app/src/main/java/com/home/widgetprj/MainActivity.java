package com.home.widgetprj;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView tv;
    Integer i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textView1);
        btn = findViewById(R.id.btn1);


        btn.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                if (i == 0) {
                    System.out.println(i);
                    tv.setText("온피스조 고광훈");
                    tv.setTextColor(Color.RED);
                    i = 1;
                } else if (i == 1) {
                    System.out.println(i);
                    tv.setText("온피스조 고광훈2");
                    tv.setTextColor(Color.BLUE);
                    i = 2;
                } else if (i == 2) {
                    System.out.println(i);
                    tv.setText("온피스조 고광훈3");
                    tv.setTextColor(Color.GREEN);
                    i = 0;

                }
                ;

            }
        });
    }
}