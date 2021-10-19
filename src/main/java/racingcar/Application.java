package racingcar;

import java.util.Arrays;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {			
		final Scanner scanner = new Scanner(System.in);

		// TODO 구현 진행
		Car a = new Car("jun");
		boolean checkInput = true;
		boolean checkCar = true;
		boolean checkN = true;
		String[] carArray = new String[0];
		String n = "";

		while(checkInput) {
			// input 1) 경주할 자동차 이름을 쉼표를 기준으로 입력 받는다
			System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)");
			String input1 = scanner.nextLine();
			carArray = input1.split(",");
			System.out.println();

			// input 2) 시도할 횟수를 입력 받는다
			System.out.println("시도할 회수는 몇회인가요?");
			String input2 = scanner.nextLine();
			n = input2;

			// Error 1) 자동차 이름이 5자 초과하는 경우
			for (int i = 0; i < carArray.length; i++) {
				if (carArray[i].length() == 0 || carArray[i].length() > 5) {
					System.out.println("[ERROR] 자동차 이름은 1자 이상, 5자 이하만 가능합니다.");
					checkCar = false;
				}
			}

			// Error 2) 시도횟수 입력시, 숫자가 아닌 다른 문자열을 입력했을 경우
			for (int i = 0; i < n.length(); i++) {
				char num = n.charAt(i);
				int asccode = (int) num;
				if (asccode < 48 || asccode > 57) {
					System.out.println("[ERROR] 시도 횟수는 숫자여야 합니다.");
					checkN = false;
					break;
				}
			}

			// Input에 error가 없을 시, while문 빠져나간다
			if (checkCar == true && checkN == true) {
				checkInput = false;
			}
		}
		//		check) carArray, n
		System.out.println(Arrays.toString(carArray));
		System.out.println(n);

	}
}
