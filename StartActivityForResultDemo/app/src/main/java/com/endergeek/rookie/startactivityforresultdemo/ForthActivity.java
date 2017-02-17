package com.endergeek.rookie.startactivityforresultdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ForthActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forth);
        Button btnJump = (Button) findViewById(R.id.btn_activity_forth);
        btnJump.setOnClickListener(this);
        Log.w("log", "4");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_activity_forth:
                this.setResult(10);
                this.finish();
                Log.w("log", "4r");
        }
    }
}
