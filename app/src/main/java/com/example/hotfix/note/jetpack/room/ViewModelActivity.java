package com.example.hotfix.note.jetpack.room;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.hotfix.R;
import com.example.hotfix.databinding.ActivityViewmodelBinding;

import java.util.List;

public class ViewModelActivity extends AppCompatActivity {

    private StudentViewModel studentViewModel;
    private ActivityViewmodelBinding binding;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_viewmodel);
        studentViewModel = ViewModelProviders.of(this).get(StudentViewModel.class);
        studentViewModel.getLiveDataAllStudent().observe(this, new Observer<List<Student>>() {
            @Override
            public void onChanged(List<Student> students) {
                binding.lsitview.setAdapter(new GoodsAdapter(ViewModelActivity.this, students));
            }
        });

        for (int i = 0; i < 50; i++) {
            studentViewModel.insert(new Student("jett", "123", i));
        }

        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    studentViewModel.update(new Student(6,"jett"+i,"123",i));
                }
            }
        }.start();

    }


}
