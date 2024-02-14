//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  StringBuilders, Lists, Sets, & Maps
// Java Week 04 Lab  
//
package week04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Week04StringBuilderListSetMapLab {

	public static void main(String[] args) {

		// 1. Why would we use a StringBuilder instead of a String?
		// 		a. Instantiate a new StringBuilder
		//		b. Append the characters 0 through 9 to it separated by dashes
		// 				Note:  make sure no dash appears at the end of the StringBuilder
		StringBuilder str = new StringBuilder("0");

		for (int i = 1; i < 10; i++) {
			str.append('-');
			str.append(i);
		}
		
		System.out.println(str.toString());

		
		// 2. List of String:
		//		a. Create a list of Strings 
		//		b. Add 5 Strings to it, each with a different length
		
		List<String> str2 = new ArrayList<String>();
		
		str2.add("George");
		str2.add("Henry");
		str2.add("Catherine");
		str2.add("Franklin");
		str2.add("Charles");

		
		// 3. Write and test a method that takes a list of strings 
		//			and returns the shortest string
		System.out.println(smallestString(str2));

		
		// 4. Write and test a method that takes a list of strings 
		//			and returns the list with the first and last element switched
		swapFirstAndLast(str2);
		for (String s : str2) {
			System.out.println(s);
		}

		
		// 5. Write and test a method that takes a list of strings 
		//			and returns a string with all the list elements concatenated to each other,
		// 			separated by a comma
		
		System.out.println(groupString(str2));

		
		// 6. Write and test a method that takes a list of strings and a string 
		//			and returns a new list with all strings from the original list
		// 			containing the second string parameter (i.e. like a search method)
		
		str2.add("Charles II");
		str2.add("Charley");
//		
//		Scanner sc = new Scanner(System.in);
//			System.out.print("Please enter a word to search: ");
			String word = "Char";

		
		List<String> searched = new ArrayList<String>();
		searched = search(str2, word);
		
		for (String s : searched) {
			System.out.println(s);
		}
		
		

		
		// 7. Write and test a method that takes a list of integers 
		//			and returns a List<List<Integer>> with the following conditions specified
		//			for the return value:
		//		a. The first List in the returned value contains any number from the input list 
		//			that is divisible by 2
		//		b. The second List contains values from the input list that are divisible by 3
		//		c. The third containing values divisible by 5, and 
		//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
		//List<Integer> testList = new ArrayList<Integer>(2,25,47,-17,16,-30,19,593,235,-39);
		List<Integer> testList = new ArrayList<Integer>();
		testList = List.of(2,25,47,-17,16,-30,19,593,235,-39);
		
		List<List<Integer>> divTest = testIntegers(testList);
		
		for (int i = 0; i < divTest.size(); i++) {
			switch (i) {
			case 0:
				System.out.print("The digits divisable by 2 are: ");
				break;
			case 1:
				System.out.print("The digits divisable by 3 are: ");
				break;
			case 2:
				System.out.print("The digits divisable by 5 are: ");
				break;
			case 3:
				System.out.print("The digits not divisable by 2, 3, or 5 are: ");
				break;
			default: 
				System.out.println("Something went wrong.");
			}
			for (int j = 0; j < divTest.get(i).size(); j++) {
				System.out.print(divTest.get(i).get(j) + " ");
			}
			System.out.println();
		}

		
		
		// 8. Write and test a method that takes a list of strings 
		//			and returns a list of integers that contains the length of each string
		System.out.println("The lengths of the words in str2 is:");
		for (int i : length(str2)) {
			System.out.println(i);
		}


		
		// 9. Create a set of strings and add 5 values
		Set<String> veggies = new HashSet<String>();
		veggies = Set.of("carrot", "cucumber", "pepper", "lettuce", "tomato");
		
		
		

		
		
		// 10. Write and test a method that takes a set of strings and a character 
		//			and returns a set of strings consisting of all the strings in the
		// 			input set that start with the character parameter.
		Set<String> validVeggies = new HashSet<String>();
		char checkedLetter = 'c';
		
		validVeggies = checkFirstLetter(veggies, checkedLetter);

		for (String v : validVeggies) {
			System.out.println(v);
		}

		
		// 11. Write and test a method that takes a set of strings 
		//			and returns a list of the same strings
		
		for (String s : setToList(veggies)) {
			System.out.println(s);
		}
	
		

		// 12. Write and test a method that takes a set of integers 
		//			and returns a new set of integers containing only even numbers 
		//			from the original set
		Set<Integer> integerSet = new HashSet<Integer>();

		integerSet = Set.of(3,5,7,6,-5,8,1,-6,9,0,15,-14);
		for (int e : giveEvens(integerSet)) {
			System.out.print(e + ", ");
		}
		System.out.println();

		
		// 13. Create a map of string and string and add 3 items to it where the key of each
		// 			is a word and the value is the definition of the word
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("mitochodrion", 
				"an organelle found in large numbers in most cells, in which the biochemical processes of respiration and energy production occur. It has a double membrane, the inner layer being folded inward to form layers (cristae).");
		dictionary.put("stellar", "relating to a star or stars.");
		dictionary.put("quantum","a discrete quantity of energy proportional in magnitude to the frequency of the radiation it represents.");
	
		
		// 14. Write and test a method that takes a Map<String, String> and a string 
		// 			and returns the value for a key in the map that matches the
		// 			string parameter (i.e. like a language dictionary lookup)
		String index = "quantum";
		System.out.println(index + ": " + giveDefinition(dictionary, index));

		
		// 15. Write and test a method that takes a List<String> 
		//			and returns a Map<Character, Integer> containing a count of 
		//			all the strings that start with a given character
		
		Map<Character, Integer> countMap = new HashMap<Character, Integer>();
		countMap = firstLetterCount(str2);
		for (char c : countMap.keySet()) {
			System.out.println(c + ": " + countMap.get(c));
		}
		

	}
	
	
	// Method 15:
	public static Map<Character, Integer> firstLetterCount(List<String> str){
		Map<Character, Integer> countMap = new HashMap<Character, Integer>();
		for (String s : str) {
			if (countMap.get(s.charAt(0)) != null) {
				countMap.put(s.charAt(0), countMap.get(s.charAt(0)) + 1);
			} else {
				countMap.put(s.charAt(0), 1);
			}
		}
		return countMap;		
	}
	
	
	
	// Method 14:
	public static String giveDefinition(Map<String, String> dictionary, String index) {
		return dictionary.get(index);
	}

	
	// Method 12:
	public static Set<Integer> giveEvens(Set<Integer> nums){
		Set<Integer> evens = new HashSet<Integer>();
		for (int n : nums) {
			if (n % 2 == 0) {
				evens.add(n);
			}
		}
		return evens;
	}

	
	// Method 11:
	public static List<String> setToList(Set<String> strSet){
		List<String> strList = new ArrayList<String>();
		for (String s : strSet) {
			strList.add(s);
		}
		return strList;
	}
	


	// Method 10:
	public static Set<String> checkFirstLetter(Set<String> words, char letter) {
		Set<String> validWords = new HashSet<String>();
		
		for (String w : words) {
			if (w.charAt(0) == letter) {
				validWords.add(w);
			}
		}
		return validWords;
	}
	

	
	// Method 8:
	public static List<Integer> length(List<String> str) {
		List<Integer> lengths = new ArrayList<Integer>();
		for (String s : str) {
			lengths.add(s.length());
		}
		return lengths;
	}
	

	
	// Method 7:
	public static List<List<Integer>> testIntegers(List<Integer> testList) {
		List<Integer> divTwo = new ArrayList<Integer>();
		List<Integer> divThree = new ArrayList<Integer>();
		List<Integer> divFive = new ArrayList<Integer>();
		List<Integer> notDiv = new ArrayList<Integer>();
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		result.add(divTwo);
		result.add(divThree);
		result.add(divFive);
		result.add(notDiv);
		
		for (int i : testList) {
			if (i % 2 == 0) {
				divTwo.add(i);
			}
			if (i % 3 == 0) {
				divThree.add(i);
			}
			if (i % 5 == 0) {
				divFive.add(i);
			}
			if (i %2 != 0 && i %3 != 0 && i %5 != 0) {
				notDiv.add(i);
			}
		}
		return result;
	}
	

	
	// Method 6:
	public static List<String> search(List<String> str, String word) {
		List<String> result = new ArrayList<String>();
		for (String s : str) {
			if (s.contains(word)) {
				result.add(s);
			}
		}
		return result;
	}
	

	
	// Method 5:
	public static String groupString(List<String> strList) {
		StringBuilder str = new StringBuilder();
		for (String s : strList) {
			str.append(s + ", ");
		}
		return str.toString();
	}
	
	
	
	// Method 4:
	public static List<String> swapFirstAndLast(List<String> strList) {
		String tempStore = strList.get(0);
		strList.set(0, strList.get(strList.size() - 1));
		strList.set(strList.size() - 1, tempStore);
		
		return strList;
		}
	
	
	
	// Method 3:
	public static String smallestString(List<String> strings) {
		String result = strings.get(0);
		for (String str : strings) {
			if (result.length() > str.length()) {
				result = str;
			}
		}
		return result;
	}
	
	

}