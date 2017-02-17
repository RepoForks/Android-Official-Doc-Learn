package com.endergeek.rookie.startactivityforresultdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnJump = (Button) findViewById(R.id.btn_activity_main);
        btnJump.setOnClickListener(this);
        Log.w("log", "1");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_activity_main:
                Intent jumpIntent = new Intent(this, SecondActivity.class);
                startActivityForResult(jumpIntent, 1);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == 10) {
            this.setResult(10);
            Toast.makeText(this, "Back to life", Toast.LENGTH_SHORT).show();
            Log.w("log", "1r");
        }
    }
}
