package racingcar;

import java.util.Arrays;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {			
		final Scanner scanner = new Scanner(System.in);
		
		// TODO 구현 진행

		// input 1) 경주할 자동차 이름을 쉼표를 기준으로 입력 받는다
		System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)");
		String input = scanner.nextLine();
		String[] carArray = input.split(",");
		System.out.println();
		System.out.println(Arrays.toString(carArray));

		// Error 1) 자동차 이름이 5자 초과하는 경우
		for (int i=0; i<carArray.length; i++){
			if (carArray[i].length() == 0 || carArray[i].length() > 5) System.out.println("[ERROR] 자동차 이름은 5자 이하만 가능합니다.");
			// 다시 input 함수 들어가기
		}

	}
}
