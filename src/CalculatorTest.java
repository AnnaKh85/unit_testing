import static org.assertj.core.api.Assertions.*;
// < ---------- Не забудьте добавить библиотеку libs/assertj-core-3.23.1.jar - add as Library...

public class CalculatorTest {
    public static void main(String[] args) {
        //Проверка, что с корректные данные от 0 до максимума возвращают неотрицательный результат
        assertThat(Calculator.calculatingDiscount(0, 0)).isNotNegative();
        assertThat(Calculator.calculatingDiscount(500.5, 0)).isNotNegative();
        assertThat(Calculator.calculatingDiscount(0, 20)).isNotNegative();
        assertThat(Calculator.calculatingDiscount(0, 100)).isNotNegative();
        assertThat(Calculator.calculatingDiscount(234.567, 20)).isNotNegative();
        assertThat(Calculator.calculatingDiscount(Double.MAX_VALUE, 20)).isNotNegative();
        //Корректность вычислений
        assertThat(Calculator.calculatingDiscount(400, 5)).isEqualTo(380);
        assertThat(Calculator.calculatingDiscount(200.82, 5)).isEqualTo(190.779);
        assertThat(Calculator.calculatingDiscount(200.45, 0)).isEqualTo(200.45);
        assertThat(Calculator.calculatingDiscount(50, 100)).isEqualTo(0);
        //Заведомо некорректные входные данные
        assertThatExceptionOfType(ArithmeticException.class).isThrownBy(() -> Calculator.calculatingDiscount(100, 1000));
        assertThatExceptionOfType(ArithmeticException.class).isThrownBy(() -> Calculator.calculatingDiscount(-100, 0));
        assertThatExceptionOfType(ArithmeticException.class).isThrownBy(() -> Calculator.calculatingDiscount(100, -1));
    }
}
