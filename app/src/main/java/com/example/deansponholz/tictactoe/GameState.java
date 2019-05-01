package com.example.deansponholz.tictactoe;

public class GameState {


    private int m_gameBoardSize;

    private static final char NONE = '-';
    private static final char PLAYER_ONE = 'X';
    private static final char PLAYER_TWO = 'O';

    private char currentPlayer;

    public char[][] getM_gameBoard() {
        return m_gameBoard;
    }

    //create 2 dimensional array for tic tac toe board
    private char[][] m_gameBoard;


    public GameState(int gameBoardSize) {
        m_gameBoardSize = gameBoardSize;
        m_gameBoard = new char[m_gameBoardSize][m_gameBoardSize];
        createBoard();

    }

    public void createBoard(){

        for (int i = 0; i < m_gameBoardSize; i++){
            for (int j = 0; j < m_gameBoardSize; j++) {
                m_gameBoard[i][j] = NONE;
            }
        }
    }


}
