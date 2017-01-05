package com.teste;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.statemachine.StateMachine;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppController {

	@Autowired
    StateMachine<States, Events> stateMachine;
	
	@RequestMapping(value = "/event1", method = RequestMethod.GET)
	public ResponseEntity<String> sendEvent1() {

		stateMachine.start();
		stateMachine.sendEvent(Events.EVENT1);
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	
	@RequestMapping(value = "/event2", method = RequestMethod.GET)
	public ResponseEntity<String> sendEvent2() {

		stateMachine.start();
		stateMachine.sendEvent(Events.EVENT2);
		return new ResponseEntity<String>(HttpStatus.OK);
	}
}