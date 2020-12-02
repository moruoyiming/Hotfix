package com.example.hotfix.note.plugin;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.hotfix.R;

public class PluginActivity extends AppCompatActivity {

    private static final String TAG = "Plugin";

    @Override
    protected void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plugin);
        findViewById(R.id.dianwo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printCLassLoader();
                invokeMethod();
            }
        });
    }

    public void invokeMethod(){

    }

    public void printCLassLoader() {
        ClassLoader classLoader = getClassLoader();
        while (classLoader != null) {
            Log.i(TAG, "printCLassLoader: " + classLoader);
            classLoader = classLoader.getParent();
        }
        // PathClassLoader 和 BootClassLoader 分别加载什么类？
        Log.i(TAG, "Activity的classLoader: "+ Activity.class.getClassLoader());

        Log.i(TAG, "AppCompatActivity的classLoader: "+ AppCompatActivity.class.getClassLoader());
    }
}