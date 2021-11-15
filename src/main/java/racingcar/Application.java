package racingcar;

import java.util.Scanner;
import java.util.Arrays;

public class Application {
	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);
		String[] CarList = Game.generateCarList(scanner);
		int playNum = Game.playGameNtimes(scanner);
		System.out.println(Arrays.toString(CarList));

		// 기능 구현 목록
		// Number of Game Plays
		// Play Game (Print Result)
	}
}