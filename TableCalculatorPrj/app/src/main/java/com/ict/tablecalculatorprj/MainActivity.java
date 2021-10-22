package com.ict.tablecalculatorprj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button[] numBtns = new Button[10];
    Integer[] numBtnIDs = {R.id.btn0, R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6,
                        R.id.btn7, R.id.btn8, R.id.btn9};

    Button plus, minus, multiply, division;
    EditText et1, et2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i=0; i<10; i++){
            numBtns[i] = (Button) findViewById(numBtnIDs[i]);
        }

        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        division = findViewById(R.id.division);
        et1 = findViewById(R.id.text1);
        et2 = findViewById(R.id.text2);
        result = findViewById(R.id.result);

        for(int i=0; i<numBtns.length;i++){
            final int index;
            index=i;

        numBtns[index].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             if(et1.isFocused()) {
                 et1.setText(numBtns[index].getText());
             }else if(et2.isFocused())
                 et2.setText(numBtns[index].getText());
             }

        });

                }
    }





}