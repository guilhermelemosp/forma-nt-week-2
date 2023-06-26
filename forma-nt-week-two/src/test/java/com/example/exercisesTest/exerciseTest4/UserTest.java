package com.example.exercisesTest.exerciseTest4;

import com.example.exercises.exercise4.BaseUser;
import com.example.exercises.exercise4.PremiumUser;
import com.example.exercises.exercise4.StandartUser;
import com.example.exercisesTest.exerciseTest4.utils.Abstract;


public class UserTest {
    public static void main(String[] args) {

        Abstract abstract1 = new Abstract() {};
        abstract1.structure(new BaseUser(), new StandartUser(), new PremiumUser());

    }
}