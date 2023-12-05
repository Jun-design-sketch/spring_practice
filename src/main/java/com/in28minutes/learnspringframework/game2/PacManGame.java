package com.in28minutes.learnspringframework.game2;

import org.springframework.stereotype.Component;

@Component
public class PacManGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("mogumogu up");
	}

	@Override
	public void down() {
		System.out.println("mogumogu down");
	}

	@Override
	public void left() {
		System.out.println("mogumogu left");
	}

	@Override
	public void right() {
		System.out.println("mogumogu right");
	}

}
