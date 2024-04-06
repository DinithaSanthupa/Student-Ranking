package com.abc.school;

import com.abc.school.controller.DisplayResultController;
import com.abc.school.serviceImpl.DisplayResultsImpl;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        DisplayResultController displayResultController =new DisplayResultController();
        displayResultController.print();

    }
}