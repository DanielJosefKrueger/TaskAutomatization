package com.danielkrueger.automatization.task;

import com.danielkrueger.automatization.event.Event;

import java.util.HashMap;
import java.util.Map;

public class Task {

    private Map<Event, Task> eventToFollowingTask = new HashMap<Event, Task>();

    private final String command;

    public Task(String command) {
        this.command = command;
    }


    public Task onEvent(Event event, Task task){
        eventToFollowingTask.put(event, task);
        return this;
    }










}
