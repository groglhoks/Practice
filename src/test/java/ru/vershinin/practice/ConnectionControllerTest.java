package ru.vershinin.practice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;

import org.springframework.test.context.junit4.SpringRunner;
import ru.vershinin.practice.controller.ConnectionController;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@Import(Config.class)
public class ConnectionControllerTest {

    @Autowired
    private ConnectionController connectionController1;

    @Autowired
    private ConnectionController connectionController2;

    @Test
    public void connect() throws Exception {

        assertTrue(connectionController1.list().isEmpty());

        connectionController1.connect(1, "a");
        connectionController1.connect(2, "b");
        connectionController1.connect(3, "c");

        assertFalse(connectionController1.list().isEmpty());
    }

    @Test
    public void list() throws Exception {
        assertTrue(connectionController2.list().isEmpty());

        connectionController2.connect(1, "a");
        connectionController2.connect(2, "b");

        assertEquals(
                "Connection{playerId=1, name='a'}\nConnection{playerId=2, name='b'}",
                connectionController2.list()
        );
    }

}