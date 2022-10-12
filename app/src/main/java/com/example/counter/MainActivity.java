package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button up;
    Button reset;
    Button down;
    TextView count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        up = findViewById(R.id.up);
        reset = findViewById(R.id.reset);
        down = findViewById(R.id.down);
        count = findViewById(R.id.count);
        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                up();
            }
        });
        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                down();

            }
        });

        reset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                reset();
            }
        });
    }

    public void up(){
        int currentCount = Integer.parseInt(count.getText().toString());
        currentCount++;
        count.setText(String.valueOf(currentCount));
        setColor(currentCount);
    }

    public void reset(){
        count.setText("0");
        setColor(0);
    }

    public void down(){
        int currentCount = Integer.parseInt(count.getText().toString());
        currentCount--;
        count.setText(String.valueOf(currentCount));
        setColor(currentCount);
    }

    public void setColor(int currentCount){
        int color = R.color.black;
        if (currentCount > 0) color = R.color.green;
        if (currentCount < 0) color = R.color.red;
        count.setTextColor(getResources().getColor(color));

    }

}