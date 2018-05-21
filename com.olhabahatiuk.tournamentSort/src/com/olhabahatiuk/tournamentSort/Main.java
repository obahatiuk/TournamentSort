package com.olhabahatiuk.tournamentSort;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List <Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(10);
		numbers.add(4);
		numbers.add(12);
		numbers.add(9);
		numbers.add(3);
		numbers.add(1);
		numbers.add(7);
		numbers.add(8);
		numbers.add(6);
		numbers.add(11);
		numbers.add(5);
		numbers.add(2);
		
		List<Integer> secondRunList = new ArrayList<Integer>();
		List<Integer> secondRun = new ArrayList<Integer>();
		List<Integer> sortedNumbers = new ArrayList<Integer>();
		
		TournamentSortAlgorithm tournamentSortAlgorithm = new TournamentSortAlgorithm();
		
		tournamentSortAlgorithm.sort(numbers, secondRun, secondRunList, sortedNumbers);
		
		int numbersSize = numbers.size();
		
		
		do {
			
			tournamentSortAlgorithm.sort(numbers, secondRun, secondRunList, sortedNumbers);
			
			numbers =  new ArrayList<Integer>(sortedNumbers);
			
			secondRunList = new ArrayList<Integer>(secondRun);
			
			secondRun = new ArrayList<Integer>();
			
			sortedNumbers = new ArrayList<Integer>();

			
		} while (secondRunList.size() != 0 );
		
		
		System.out.println(numbers);
		System.out.println(secondRunList);
	}
	
}
