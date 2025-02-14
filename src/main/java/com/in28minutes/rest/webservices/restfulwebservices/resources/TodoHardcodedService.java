package com.in28minutes.rest.webservices.restfulwebservices.resources;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class TodoHardcodedService {
    private  static List<Todo> todos = new ArrayList();
    private static int idCounter = 0;
    static {
        todos.add(new Todo(++idCounter, "Luzuko", "Learn to dance", new Date(), false));
        todos.add(new Todo(++idCounter, "Luzuko", "Learn about Microservices", new Date(), false));
        todos.add(new Todo(++idCounter, "Luzuko", "Learn about Angular", new Date(), false));
    }

    public List<Todo> findAll() {
        return todos;
    }
}
