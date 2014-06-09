package com.manning.gia.todo.repository;

import com.manning.gia.todo.model.ToDoItem;
import org.junit.Test;

import static org.junit.Assert.*;

public class InMemoryToDoRepositoryTest {
    @Test
    public void insertFirst() {
        InMemoryToDoRepository repo = new InMemoryToDoRepository();
        ToDoItem item = new ToDoItem();
        repo.insert(item);

        assertEquals(1, repo.findAll().size());
    }

}
