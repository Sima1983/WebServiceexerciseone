package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class WebServiceExerciseApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebServiceExerciseApplication.class, args);


		Solution Solution = new Solution();
		Solution.fizzBuzz();
		//System.out.println(Solution.fizzBuzz2(5));
		Solution.dubbLetter();
		Solution.whatSquare(5);

		System.out.println(Solution.rovarspraket("sima"));
		System.out.println(Solution.rovarspråketTillbaka("sosimoma"));



	}

}
