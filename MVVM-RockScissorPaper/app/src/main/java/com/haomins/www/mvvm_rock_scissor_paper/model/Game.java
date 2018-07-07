package com.haomins.www.mvvm_rock_scissor_paper.model;

import android.arch.lifecycle.MutableLiveData;

public class Game {
	// rock paper scissor rules
	// 3 rounds 2 wins
	// 2 players
	private static final int ROUNDS = 3; // only 3 rounds
	private static final int WIN_ROUNDS = 2; // 2 wins

	public Player player1, player2;

	public Player currentPlayer = player1;
	public MutableLiveData<Player> winner = new MutableLiveData<>();

	public Game(String playerOne, String playerTwo){
		player1 = new Player(playerOne, 0);
		player2 = new Player(playerTwo, 0); // assign players with original value = 0
		// default player 1 go first
		currentPlayer = player1;
	}

	public boolean hasGameEnded(){
		// this should only be called if we already progressed 3 rounds
		if (player1.getValue() - player2.getValue() > 1 && player1.getValue() == ROUNDS){
			winner.setValue(player1);
			return true;
		} else if (player2.getValue() - player1.getValue() > 1 && player2.getValue() == ROUNDS){
			winner.setValue(player2);
			return true;
		} // since this situation not allowing even, no other case need to considered
		return false;
	}

	public void reset(){
		player1 = null;
		player2 = null;
		currentPlayer = null;
	}
}
