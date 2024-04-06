package com.abc.school.dao;

import java.io.*;
import java.util.*;

public class StudentRepository {

    public String readText(int studentNo){
        File myObj = new File("D:\\Dev\\Dev Repo\\Student Ranking\\resources\\records.txt"); // Replace "filename.txt" with your actual file path

        List<String> studentRecords = new ArrayList<>();

        try {
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String str = myReader.nextLine();
                String[] parts = str.split("\\|");
                Collections.addAll(studentRecords, parts);

            }
            for(String part : studentRecords){
                String[] data = part.split("\\*");

                if(studentNo == Integer.parseInt(data[0])){
                    return data[1];
                }
            }
            myReader.close();
        } catch (
                FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return null;

    }

}

