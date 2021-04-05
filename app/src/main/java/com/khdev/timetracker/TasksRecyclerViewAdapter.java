package com.khdev.timetracker;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.khdev.timetracker.databinding.TaskItemBinding;

import java.util.ArrayList;

public class TasksRecyclerViewAdapter extends RecyclerView.Adapter<TasksRecyclerViewAdapter.TaskViewHolder> {
    ArrayList<Task> taskArrayList;

    public TasksRecyclerViewAdapter(ArrayList<Task> TaskArrayList) {
        this.taskArrayList = TaskArrayList;
    }

    @NonNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item, parent, false);
        TaskItemBinding binding = TaskItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new TaskViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder holder, int position) {
        if (position == 0) {
            holder.binding.itemCardView.setCardElevation(10);
        }
        Task task = taskArrayList.get(position);

        holder.binding.taskNameTv.setText(task.getTaskName());
        holder.binding.taskDetailsTv.setText(task.getTaskDetail());
        holder.binding.taskCategoryTv.setText(task.getTaskCategory());
        holder.binding.taskTimeTv.setText(task.getTaskTime() + "min");


    }

    @Override
    public int getItemCount() {
        return taskArrayList.size();
    }

    public class TaskViewHolder extends RecyclerView.ViewHolder {

        TaskItemBinding binding;

        public TaskViewHolder(@NonNull TaskItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
