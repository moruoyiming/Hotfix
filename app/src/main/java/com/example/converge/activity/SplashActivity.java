package com.example.converge.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;

import androidx.appcompat.app.AppCompatActivity;

/**
 * 利用给SplashActivity设置带有背景的SplashTheme来避免启动白屏的问题
 */
public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getIntent().getData()!=null&&!TextUtils.isEmpty(getIntent().getData().getScheme())){
            return ;
        }
        startActivity(new Intent(this, MainActivity.class));
        overridePendingTransition(0,0);
    }

    @Override
    protected void onStop() {//  1. A ，onpause  2.B  oncreate 3. B onresume  4. A onStop
        super.onStop();
        finish();

    }
}
