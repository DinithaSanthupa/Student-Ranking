package com.abc.school.service;

import java.util.HashMap;

public interface DisplayResults {
    public HashMap<String,Integer> getResults(int studentNo);
    public int totalMarks(HashMap<String,Integer> marks);
    public double calculatePercentage(HashMap<String,Integer> marks);
    public String calculateRank(double percentage);

}
