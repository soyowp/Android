package com.ict.cal;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv1;
        Button one,two,three,four,five,six,seven,eight,nine,zero,plus,minus,multiply,half,result,reset;

        tv1 = findViewById(R.id.textView);

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        half = findViewById(R.id.half);
        result = findViewById(R.id.result);
        reset = findViewById(R.id.reset);

        Stack<String> stack = new Stack<>();
        one.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                stack.add("1");
                tv1.setText(stack.toString());
            }

        });
        two.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                stack.add("2");
                tv1.setText(stack.toString());
            }

        });
        three.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                stack.add("3");
                tv1.setText(stack.toString());
            }

        });
        four.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                stack.add("4");
                tv1.setText(stack.toString());
            }

        });
        five.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                stack.add("5");
                tv1.setText(stack.toString());
            }

        });
        six.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                stack.add("6");
                tv1.setText(stack.toString());
            }

        });
        seven.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                stack.add("7");
                tv1.setText(stack.toString());
            }

        });
        eight.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                stack.add("8");
                tv1.setText(stack.toString());
            }

        });
        nine.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                stack.add("9");
                tv1.setText(stack.toString());
            }

        });
        zero.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                stack.add("0");
                tv1.setText(stack.toString());
            }

        });

        plus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                stack.add("+");
                tv1.setText(stack.toString());
            }

        });

        minus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                stack.add("-");
                tv1.setText(stack.toString());
            }

        });

        half.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                stack.add("/");
                tv1.setText(stack.toString());
            }

        });

        multiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                stack.add("*");
                tv1.setText(stack.toString());
            }

        });

        reset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                stack.clear();
                tv1.setText(stack.toString());
            }

        });
    }
}