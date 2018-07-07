package com.haomins.www.mvvm_rock_scissor_paper.model;

public class Player {
	public String name;
	public int value;

	public Player(String name, int value){
		this.name = name;
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
