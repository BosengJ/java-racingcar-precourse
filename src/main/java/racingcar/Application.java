package racingcar;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);
		String[] CarList = Game.generateCarList(scanner);
		int playNum = Game.playGameNtimes(scanner);
		System.out.println("\n실행결과");
		Game.playGame(CarList,playNum);

	}
}