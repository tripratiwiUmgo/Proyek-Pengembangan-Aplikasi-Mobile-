package com.example.taskmanager;

public class TaskService {

    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public void addTask(String title, String description) {
        Task task = new Task(title, description);
        taskRepository.getAllTasks().add(task);
    }
}
