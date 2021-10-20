package com.ict.imgchange;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox cb;
    TextView tv;
    RadioGroup rg;
    RadioButton dogeBtn, bitBtn;
    Button btn;
    ImageView img1, img2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    cb = (CheckBox) findViewById(R.id.appviewch);
    tv = (TextView) findViewById(R.id.textView);
    rg = (RadioGroup) findViewById(R.id.radioGroup);
    dogeBtn = (RadioButton) findViewById(R.id.dogeBtn);
    bitBtn = (RadioButton) findViewById(R.id.bitBtn);
    btn = (Button) findViewById(R.id.btn1);
    img1 = (ImageView) findViewById(R.id.dodge);
    img2 = (ImageView) findViewById(R.id.btc);

    cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            if(b){
                tv.setVisibility(View.VISIBLE);
                rg.setVisibility(View.VISIBLE);
                btn.setVisibility(View.VISIBLE);

            }else{
                tv.setVisibility(View.INVISIBLE);
                rg.setVisibility(View.INVISIBLE);
                rg.clearCheck();
                btn.setVisibility(View.INVISIBLE);
                img1.setVisibility(View.INVISIBLE);
                img2.setVisibility(View.INVISIBLE);
            }
        }
    });

    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            if(dogeBtn.isChecked()){
                img1.setVisibility(View.VISIBLE);
                img2.setVisibility(View.INVISIBLE);
            }else if(bitBtn.isChecked()){
                img1.setVisibility(View.INVISIBLE);
                img2.setVisibility(View.VISIBLE);
            }

        }
    });
    }
}