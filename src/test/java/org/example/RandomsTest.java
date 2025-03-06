package org.example;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class RandomsTest {

    @Test
    public void testRandoms_numbersInCorrectRange() {
        int min = 90;
        int max = 100;
        Randoms randoms = new Randoms(min, max);

        // Проверяем, что первые 100 чисел находятся в диапазоне
        for (int i = 0; i < 100; i++) {
            int randomNumber = randoms.iterator().next();
            assertThat(randomNumber, allOf(greaterThanOrEqualTo(min), lessThanOrEqualTo(max)));
        }
    }

    @Test
    public void testRandoms_iteratorIsInfinite() {
        int min = 1;
        int max = 2;
        Randoms randoms = new Randoms(min, max);
        Iterator<Integer> iterator = randoms.iterator();

        // Проверяем, что итератор генерирует много чисел (1000) без остановки
        for (int i = 0; i < 1000; i++) {
            iterator.next();
        }
        // Если дошли до сюда, значит итератор сгенерировал 1000 чисел
        assertThat(true, is(true)); // Пример использования Hamcrest is()
    }


    @Test
    public void testRandoms_sequenceContainsIncreasingNumber() {
        int min = 1;
        int max = 10;
        Randoms randoms = new Randoms(min, max);

        // Создаем список из 5 случайных чисел
        List<Integer> sequence = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            sequence.add(randoms.iterator().next());
        }

        assertThat(sequence, new HasIncreasingNumber());
    }

    // Пользовательский матчер для проверки наличия возрастающего числа в последовательности
    static class HasIncreasingNumber extends TypeSafeMatcher<List<Integer>> {
        @Override
        public void describeTo(Description description) {
            description.appendText("a list with at least one increasing number");
        }

        @Override
        protected boolean matchesSafely(List<Integer> list) {
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) > list.get(i - 1)) {
                    return true;
                }
            }
            return false;
        }
    }
}