package racingcar;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);
		String[] CarList = Game.generateCarList(scanner);
		int playNum = Game.playGameNtimes(scanner);
		//play the game n times
		// 기능 구현 목록
		// Number of Game Plays
		// Play Game (Print Result)
	}
}