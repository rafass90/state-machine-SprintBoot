package com.teste;

import org.springframework.statemachine.annotation.OnTransition;
import org.springframework.statemachine.annotation.WithStateMachine;

@WithStateMachine class MyBean {

	@OnTransition(target = "STATE1")
	public void toState1() {
		System.out.println("1");
	}

	@OnTransition(target = "STATE2")
	public void toState2() {
		System.out.println("2");
	}
}
