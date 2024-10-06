/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.CEN4802CMidterm;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author robianalabady
 */
public class CEN4802CMidterm { //this will be an simple to-do list app

    private List<String> tasks;

    public CEN4802CMidterm() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void removeTask(String task) {
        tasks.remove(task);
    }

    public List<String> getTasks() {
        return tasks;
    }

    public static void main(String[] args) {
        CEN4802CMidterm app = new CEN4802CMidterm();
        app.addTask("Task 1: Finish midterm assignment");
        app.addTask("Task 2: Review project workflow");

        System.out.println("Tasks: " + app.getTasks());

        app.removeTask("Task 1: Finish midterm assignment");
        System.out.println("Tasks after removal: " + app.getTasks());
    }//end main
    
}//end CEN4802CMidterm class