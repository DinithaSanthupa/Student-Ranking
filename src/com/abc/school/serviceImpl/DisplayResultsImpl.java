package com.abc.school.serviceImpl;

import com.abc.school.dao.StudentRepository;
import com.abc.school.service.DisplayResults;

import java.util.HashMap;

public class DisplayResultsImpl implements DisplayResults {
    StudentRepository studentRepository = new StudentRepository();
    HashMap<String, Integer> marks = new HashMap<>();
    @Override
    public HashMap<String,Integer> getResults(int studentNo) {

        String studentData = studentRepository.readText(studentNo);
        String[] data = studentData.split("\\.");

        for(String str: data){
            String[] part = str.split(" ");
            marks.put(part[0], Integer.parseInt(part[1]));
        }
        marks.forEach((key, value) -> System.out.println(key + ", Marks: " + value));
        return marks;

    }
    @Override
    public int totalMarks(HashMap<String,Integer> marks) {
        int totalMarks = 0;
        for (int value : marks.values()) {
            totalMarks += value;
        }
        return totalMarks;
    }
    @Override
    public double calculatePercentage(HashMap<String, Integer> marks) {
        return (double) totalMarks(marks) /marks.size();
    }

    @Override
    public String calculateRank(double percentage) {
        if (percentage >= 95) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B+";
        } else if (percentage >= 60) {
            return "B";
        } else if (percentage >= 50) {
            return "C";
        } else if (percentage >= 40) {
            return "D";
        } else {
            return "FAIL";
        }
    }


}
