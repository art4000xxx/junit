# Пример проекта с использованием JUnit и Hamcrest

Этот проект демонстрирует использование JUnit и Hamcrest для тестирования простого класса `Randoms`.

## Описание проекта

Класс `Randoms` генерирует бесконечную последовательность случайных чисел в заданном диапазоне. Этот проект включает JUnit-тесты для проверки правильности и поведения класса `Randoms`.

## Структура проекта

*   `src/main/java/org/example/`: Содержит основной Java-код для класса `Randoms`.
*   `src/test/java/org/example/`: Содержит JUnit-тесты для класса `Randoms` с использованием Hamcrest-матчеров.

## Зависимости

*   JUnit Jupiter API: Используется для написания и запуска тестов.
*   JUnit Jupiter Engine: Используется для обнаружения и выполнения JUnit Jupiter тестов.
*   Hamcrest All: Используется для выразительных и читаемых утверждений в тестах.

## Тесты

В класс `RandomsTest` включены следующие тесты:

*   **`testRandoms_numbersInCorrectRange`**: Проверяет, что все сгенерированные случайные числа находятся в указанном диапазоне.
*   **`testRandoms_iteratorIsInfinite`**: Проверяет, что итератор генерирует числа бесконечно (путем генерации большого количества элементов без остановки).
*   **`testRandoms_sequenceContainsIncreasingNumber`**: Проверяет, что сгенерированная последовательность чисел содержит хотя бы одно число, которое больше предыдущего. Этот тест демонстрирует использование пользовательского Hamcrest-матчера.

## Как запустить тесты

1.  Клонируйте репозиторий на свой локальный компьютер.
2.  Откройте проект в IntelliJ IDEA или другой IDE, поддерживающей Gradle.
3.  Запустите тесты, щелкнув правой кнопкой мыши на файле `RandomsTest.java` и выбрав "Run 'RandomsTest'".
4.  Кроме того, вы можете запустить тесты из командной строки с помощью Gradle: `./gradlew test`

## Hamcrest-матчеры

В этом проекте используются Hamcrest-матчеры для более выразительных и читаемых тестов. Некоторые из используемых Hamcrest-матчеров включают:

*   `allOf(greaterThanOrEqualTo(min), lessThanOrEqualTo(max))`: Проверяет, находится ли значение в указанном диапазоне.
*   `is(true)`: Проверяет, равно ли значение true.
*   Пользовательские матчеры: Класс `HasIncreasingNumber` демонстрирует, как создавать пользовательские Hamcrest-матчеры для более сложных утверждений.

## Примечания

*   Тест `testRandoms_numbersCloseToAverage` был удален из-за его нестабильности. Генерация действительно случайных чисел иногда может приводить к случайным сбоям в тестах, особенно при тестировании статистических свойств, таких как "близость к среднему значению".

## Автор

[Art4000xxx]
