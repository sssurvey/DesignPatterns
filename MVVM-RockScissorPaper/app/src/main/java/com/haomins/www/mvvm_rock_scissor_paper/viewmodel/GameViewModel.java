package com.haomins.www.mvvm_rock_scissor_paper.viewmodel;

import com.haomins.www.mvvm_rock_scissor_paper.utilities.ScoreBoard;
import android.databinding.ObservableArrayMap;


public class GameViewModel {
	public ScoreBoard my_scoreBoard = new ScoreBoard();
	public String current_score = my_scoreBoard.toString();
	

}
