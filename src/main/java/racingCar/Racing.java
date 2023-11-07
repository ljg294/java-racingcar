package racingCar;

import racingCar.movableStrategy.RandomStrategy;

public class Racing {
    public static final int MINIMUM_CAR_COUNT = 2;
    public static final int MINIMUM_ROUND_COUNT = 1;
    private int roundCount;
    private Cars cars;

    public Racing(int inputCarCount, int inputRoundCount) {
        this.roundCount = inputRoundCount;

        cars = new Cars(inputCarCount, new RandomStrategy(Car.MOVE_CONDITION, 10));
    }

    public boolean holdPossible() {
        if (cars.carsReady(MINIMUM_CAR_COUNT) && roundCount >= MINIMUM_ROUND_COUNT) {
            return true;
        }
        return false;
    }

    public void race() {
        cars.race(roundCount);
    }
}
