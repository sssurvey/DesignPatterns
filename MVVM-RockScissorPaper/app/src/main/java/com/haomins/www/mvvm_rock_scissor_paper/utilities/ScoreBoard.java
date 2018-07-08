package com.haomins.www.mvvm_rock_scissor_paper.utilities;

public class ScoreBoard {
	public static int right_won = 0;
	public static int left_won = 0;

	public void player1WON(){
		left_won ++;
	}

	public void player2WON(){
		right_won ++;
	}

	public void reset(){
		left_won =0;
		right_won =0;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(left_won);
		sb.append(" : ");
		sb.append(right_won);
		return sb.toString();
	}
}
