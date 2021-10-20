package com.ict.lottoprj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tv = findViewById(R.id.textView);
        btn = findViewById(R.id.button);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                ArrayList<Integer> bingo = new ArrayList();
                int bonus = (int)(Math.random()*45+1);;

                bingo.clear();
                while (bingo.size()<6){
                    int num = (int)(Math.random()*45+1);
                        if(!bingo.contains(num)){
                            bingo.add(num);
                        }


                        if(bingo.contains(bonus)){
                            bonus=(int)(Math.random()*45+1);
                        }

                    Collections.sort(bingo);
                    String list = bingo.toString()
                            .replace("[","")
                            .replace("]","");
                tv.setText(list.toString() +" + "+ bonus);
            }

        }

    });


}
}