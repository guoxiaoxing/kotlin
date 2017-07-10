package com.guoxiaoxing.kotlin.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.guoxiaoxing.kotlin.demo.grammar.GrammarActivity;

public class JavaActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_grammar:
                startActivity(new Intent(JavaActivity.this, GrammarActivity.class));
                break;
        }
    }
}
