package racingcar;

import java.util.Scanner;

public class Game {
	public static String[] generateCarList(Scanner scanner){
		String[] CarList = new String[0];
		boolean flag = true;
		while(flag){
			System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
			String inputData = scanner.nextLine();
			CarList = inputData.split(",");
			// 받은 이름 5자 이하인지 확인하고 맞으면 플래그 바꿔주고 아니면 그대로 플래그 false
			flag = checkInputData(CarList);
			if(flag){
				System.out.println("[ERROR] 자동차의 이름은 5자 이하여야 한다.");
			}
		}
		return CarList;
	}

	public static boolean checkInputData(String[] carList){
		boolean overfive = false;
		for(int i=0; i<carList.length; i++){
			if(carList[i].length() > 5){
				overfive = true;
			}
		}
		return overfive;
	}

	//int playNum = Game.playGameNtimes(scanner);
	public static int playGameNtimes(Scanner scanner){
		int playNum = 0;
		boolean flag = true;
		while(flag){
			System.out.println("시도할 회수는 몇회인가요?");
			String inputData = scanner.nextLine();
			// inputData가 숫자인지 판별해주는 함수
			// if 숫자 -> flag = false
			// 아니면, 반복
			System.out.println("[ERROR] 시도 횟수는 숫자여야 한다.");
		}
		return playNum;
	}
}
