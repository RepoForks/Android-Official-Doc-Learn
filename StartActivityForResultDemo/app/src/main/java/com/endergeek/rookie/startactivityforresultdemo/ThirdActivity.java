package com.endergeek.rookie.startactivityforresultdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Button btnJump = (Button) findViewById(R.id.btn_activity_third);
        btnJump.setOnClickListener(this);
        Log.w("log", "3");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_activity_third:
                Intent jumpIntent = new Intent(this, ForthActivity.class);
                startActivityForResult(jumpIntent, 1);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == 10) {
            this.setResult(10);
            this.finish();
            Log.w("log", "3r");
        }
    }
}
