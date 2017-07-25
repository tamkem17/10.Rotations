package com.example.tam.a10rotations;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {
    private EditText mEdt;
    private LinearLayout mLinerLayout;
    private String mSave_Edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_addMessage = (Button)findViewById(R.id.btn_addMessage);
        mEdt = (EditText)findViewById(R.id.edt);
        mLinerLayout = (LinearLayout) findViewById(R.id.liner_layout);
        btn_addMessage.setOnClickListener(new addMessage());
    }

    private class addMessage implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            mSave_Edt = mEdt.getText().toString();
            TextView textV = new TextView(getApplicationContext());
            textV.setText(mSave_Edt);
            mLinerLayout.addView(textV);

        }
    }


    
}
