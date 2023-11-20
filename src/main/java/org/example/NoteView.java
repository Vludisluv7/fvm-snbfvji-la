package org.example;

import java.util.List;

public class NoteView {
    public void displayTasks(List<String> tasks) {
        System.out.println("Список заметок:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }
}