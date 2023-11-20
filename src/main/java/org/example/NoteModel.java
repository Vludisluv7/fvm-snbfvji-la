package org.example;

import java.util.List;

import java.util.ArrayList;

public class NoteModel {
    private List<String> tasks;

    public NoteModel() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public List<String> getTasks() {
        return tasks;
    }
}