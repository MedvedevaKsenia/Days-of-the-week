package ru.kseniamedvedeva.days_of_the_week;

public class DaysOfWeek {
    public enum DayOfWeek {
        monday("Понедельник"), tuesday("Вторник"), wednesday("Среда"), thursday("Четверг"), friday("Пятница"), saturday("Суббота"), sunday("Воскресенье");

        private String russianName;

        private DayOfWeek dayOfWeek;

        DayOfWeek(String russianName) {
            this.russianName = russianName;
        }

        public String getRussianName() {
            return russianName;
        }

    }
}
