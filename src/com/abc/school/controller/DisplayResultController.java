package com.abc.school.controller;

import com.abc.school.serviceImpl.DisplayResultsImpl;

import java.util.HashMap;
import java.util.Scanner;

public class DisplayResultController {
    public void print(){
        DisplayResultsImpl displayResults = new DisplayResultsImpl();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Student number : ");
        int studentNo = scanner.nextInt();
        HashMap<String,Integer> marks = displayResults.getResults(studentNo);
        int totalMarks = displayResults.totalMarks(marks);
        System.out.println("Total Marks = " + totalMarks);
        double percentage = displayResults.calculatePercentage(marks);
        System.out.println("Percentage : " + percentage);
        String rank = displayResults.calculateRank(percentage);
        System.out.println("Rank : " + rank);
    }


}
