package racingcar;

import utils.RandomUtils;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void distanceRun(){
        int randomNum = utils.RandomUtils.nextInt(0,9);
        if(randomNum >= 4){
            ++position;
        }
    }
    // print the moving image
    public void PrintRunningImage(){
        String img = "";
        for (int i=0; i < position; i++){
            img += "-";
        }
        System.out.println(name + ":" + img);
    }


    // 추가 기능 구현
    // Express the distance as Number
}