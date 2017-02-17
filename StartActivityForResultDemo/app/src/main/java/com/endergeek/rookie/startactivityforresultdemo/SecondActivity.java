package com.endergeek.rookie.startactivityforresultdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button btnJump3 = (Button) findViewById(R.id.btn_activity_second);
        Button btnJump1 = (Button) findViewById(R.id.btn_activity_first);
        btnJump3.setOnClickListener(this);
        btnJump1.setOnClickListener(this);
        Log.w("log", "2");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_activity_second:
                Intent jumpIntent = new Intent(this, ThirdActivity.class);
                startActivityForResult(jumpIntent, 1);
                break;
            case R.id.btn_activity_first:
                finish();
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == 10) {
            this.setResult(10);
            Log.w("log", "2r");
        }
    }
}
