package com.sample;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    static Map<Integer, Character> characterMap = new HashMap<>();

    static {
        characterMap.put(0, 'Z');
        characterMap.put(1, 'A');
        characterMap.put(2, 'B');
        characterMap.put(3, 'C');
        characterMap.put(4, 'D');
        characterMap.put(5, 'E');
        characterMap.put(6, 'F');
        characterMap.put(7, 'G');
        characterMap.put(8, 'H');
        characterMap.put(9, 'I');
        characterMap.put(10, 'J');
        characterMap.put(11, 'K');
        characterMap.put(12, 'L');
        characterMap.put(13, 'M');
        characterMap.put(14, 'N');
        characterMap.put(15, 'O');
        characterMap.put(16, 'P');
        characterMap.put(17, 'Q');
        characterMap.put(18, 'R');
        characterMap.put(19, 'S');
        characterMap.put(20, 'T');
        characterMap.put(21, 'U');
        characterMap.put(22, 'V');
        characterMap.put(23, 'W');
        characterMap.put(24, 'X');
        characterMap.put(25, 'Y');
        characterMap.put(26, 'Z');

    }

    static String convertToExcelColumn(int n) {

        StringBuilder result = new StringBuilder();

        if (n <= 26) {
            result.append(String.valueOf(characterMap.get(n)));
            return result.toString();
        }

        int rem = 0;
        while (n > 26) {

            rem = n % 26;
            n = n / 26;
            result.append(String.valueOf(characterMap.get(rem)));
        }

        if (rem == 0) {
            n--;
        }
        result.append(String.valueOf(characterMap.get(n)));

        return result.reverse().toString();
    }

    public static void main(String[] args) {

        System.out.println(convertToExcelColumn(2));
        System.out.println(convertToExcelColumn(27));
        System.out.println(convertToExcelColumn(52));
        System.out.println(convertToExcelColumn(953));
        System.out.println(convertToExcelColumn(78));
        System.out.println(convertToExcelColumn(53));

        Student st1 = new Student("Sai", 10);
        Student st2 = new Student("Krishna", 100);
        var students = List.of(st1, st2);

        students.stream()
                .map(Student::getRollNumber)
                .sorted()
                .forEach(System.out::println);

    }

    static class Student {

        String name;
        int rollNumber;

        public Student(String name, int rollNumber) {
            this.name = name;
            this.rollNumber = rollNumber;
        }

        public int getRollNumber() {
            return rollNumber;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", rollNumber=" + rollNumber +
                    '}';
        }
    }

    /*Select * from Employee e1 JOIN Employee e2 ON e1.sub_ordinate_id = e2.id
    JOIN Employee e3 ON e3.id = e2.id WHERE e1.id = ?*/

}
