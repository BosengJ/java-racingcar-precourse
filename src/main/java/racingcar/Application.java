package racingcar;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {			
		final Scanner scanner = new Scanner(System.in);
		
		// TODO 구현 진행
		
		System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)");
		String input = scanner.nextLine();
		String[] carArray = input.split(",");
		System.out.println();
//		System.out.println(Arrays.toString(carArray));
	}
}
