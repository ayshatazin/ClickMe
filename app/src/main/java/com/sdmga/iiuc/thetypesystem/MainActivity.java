package com.sdmga.iiuc.thetypesystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int clickCounter=0;
    private Button btnClick;
    private TextView tvClick;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick = (Button) findViewById(R.id.Button);
        tvClick = (TextView) findViewById(R.id.TextView);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                clickCounter++;
                if(clickCounter==10)
                {
                    tvClick.setText("Level 1 Complete! Your Score" +clickCounter);
                }
                else if(clickCounter==20)
                {
                    tvClick.setText("Level 2 Complete! Your Score" +clickCounter);
                }
                else if(clickCounter==30)
                {
                    tvClick.setText("Level 3 Complete! Your Score" +clickCounter);
                }
            }
        });
    }
}
