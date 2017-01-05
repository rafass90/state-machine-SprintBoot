package com.teste;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.statemachine.StateMachine;

class MyApp {

    @Autowired
    StateMachine<States, Events> stateMachine;

    void doSignals() {
        stateMachine.start();
        stateMachine.sendEvent(Events.EVENT1);
        stateMachine.sendEvent(Events.EVENT2);
    }
}
