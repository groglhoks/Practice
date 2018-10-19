package ru.vershinin.practice.service;

import org.springframework.stereotype.Repository;
import ru.vershinin.practice.model.Connection;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@Repository
public class ConnectionQueue {
    private BlockingQueue<Connection> queue = new LinkedBlockingQueue<>();

    public BlockingQueue<Connection> getQueue() {
        return queue;
    }
}
