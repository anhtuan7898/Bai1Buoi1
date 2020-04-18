package com.tuannguyen.bai1buoi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnS1, btnS2;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnS1 = (Button) findViewById(R.id.btnS1);
        btnS2 = (Button) findViewById(R.id.btnS2);

        btnS1.setOnClickListener(this);
        btnS2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnS1:
                intent = new Intent(this,SubAct1.class);
                startActivity(intent);
                break;
            case R.id.btnS2:
                intent = new Intent(this,SubAct2.class);
                startActivity(intent);
                break;
        }
    }
}
