package TicTacToe;

import java.util.Scanner;

class User{
	String OX;
	String name;
	String[][] board =  new String[3][3];
	Scanner sc = new Scanner(System.in);
	
	public User(String OX, String name) {
		this.OX = OX;
		this.name = name;
	}
	
	boolean isThree(String[][] board) {

//		if(OX.equals("O")) {
//			System.out.println("내가 이겼습니다!");
//			return true;
//		}
//		else if(OX.equals("X")) {
//			System.out.println("컴퓨터가 이겼습니다..");
//			return true;
//		}
		return false;
	}
	
	void printMenu() {
		while(true) {
			
			System.out.print(name+" : 좌표를 입력하세요 (1, 1) ~ (3,3) >>> ");
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if(x<1 || y < 1|| x > 3 || y > 3)
			{
				System.out.println("좌표값을 잘못 입력하였습니다.");
				continue;
			}
			else
			{
				x-=1;
				y-=1;
			}
			
			if(insert(x, y)==false) {
				printBoard();
				System.out.println(x + ", " + y + "이미 값이 있습니다. 좌표를 다시 입력하세요.");
				continue;
			}
			
			printBoard();
		}
	}
	
//	00 01 02
//	10 11 12
//	20 21 22
 	boolean insert(int x, int y) {
		if(Game.board[x][y].equals("_"))
		{
			System.out.println(x + ", " + y);
			Game.board[x][y] = OX;
			return true;
		}
		else
			return false;		// 값이 있으므로 false;
	}
	
	void printBoard() {
		for(int i = 0; i < Game.board.length; i++) {
			for(int j = 0; j < Game.board[i].length; j++) {
				System.out.printf("%-2s",Game.board[i][j]);
			}
			System.out.println();
		}
		System.out.println("======================");
	}
}

class Game{
	static String[][] board = 
			new String[][]{
							{"_", "_", "_"},
							{"_", "_", "_"},
							{"_", "_", "_"}
							};
	User me = new User("O", "나");
	User com = new User("X", "컴");
	
	public Game() {
		
	}
	
	void startGame() {
		while(true) {
			me.printMenu();
			if(me.isThree(board)== true)
				break;
			com.printMenu();
			if(me.isThree(board)== true)
				break;
		}
		
	}
	
	
}

public class TickTacToeMain {

	/*
	 * ooo
	 * xxx
	 * ...
	 */
	
	public static void main(String[] args) {

		
		Game newGame = new Game();
		newGame.startGame();
		
		
	}

}
