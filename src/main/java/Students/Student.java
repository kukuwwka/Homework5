package Students;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

    public class Student {

        public String name;
        public String surname;
        public String patronymic;
        private static List<Integer> score;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getPatronymic() {
            return patronymic;
        }

        public void setPatronymic(String patronymic) {
            this.patronymic = patronymic;
        }

        public List<Integer> getScore() {
            return score;
        }

        public void setScore(List<Integer> score) {
            this.score = score;
        }
        public static void main(String[] args) {
            List<Student> students = new ArrayList<>();
            System.out.println(Collections.sort(score) + "1 место: " + this.surname + this.name + this.patronymic);
            System.out.println(Collections.sort(score) + "2 место: " + this.surname + this.name + this.patronymic);
            System.out.println(Collections.sort(score) + "3 место: " + this.urname + this.name + this.patronymic);
    }
}



