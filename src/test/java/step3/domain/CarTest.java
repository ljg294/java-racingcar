package step3.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    @DisplayName("Random값이 4이상일 경우 자동차의 위치가 증가한다")
    @ParameterizedTest
    @CsvSource(value = {"0,0", "1,0", "2,0", "3,0", "4,1", "5,1", "6,1", "7,1", "8,1", "9,1"})
    public void move(int randomNum, int location) {
        // given
        Car car = new Car();

        // when
        car.move(randomNum);

        // then
        assertThat(car.getLocation()).isEqualTo(location);
    }
}
