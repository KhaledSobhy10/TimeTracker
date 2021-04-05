package com.khdev.timetracker;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.khdev.timetracker.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

   ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        ArrayList<Task> tasks = fakeTasks();

        activityMainBinding.currentTaskDetailsTv.setText(tasks.get(0).getTaskDetail());
        activityMainBinding.currentTaskTimeTv.setText(tasks.get(0).getTaskTime() + ":20:00");

        activityMainBinding.tasksRv.setLayoutManager(new LinearLayoutManager(this));
        TasksRecyclerViewAdapter tasksRecyclerViewAdapter = new TasksRecyclerViewAdapter(tasks);
        activityMainBinding.tasksRv.setAdapter(tasksRecyclerViewAdapter);

    }


    // method for debug
    private ArrayList<Task> fakeTasks() {
        ArrayList<Task> tasks = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            tasks.add(new Task("UI Coding "+i, "Working "+i, "Customer Project", 2112+i));
        }
        return tasks;
    }
}