package com.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExpressionCheck {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputExpression = scanner.nextLine().trim();
        String output = evaluateExpression(inputExpression);
        System.out.println(output);
        scanner.close();
    }

	private static final Map<String, Integer> wordToNumberMap = new HashMap<>();

       static {
		wordToNumberMap.put("zero", 0);
		wordToNumberMap.put("one", 1);
		wordToNumberMap.put("two", 2);
		wordToNumberMap.put("three", 3);
		wordToNumberMap.put("four", 4);
		wordToNumberMap.put("five", 5);
		wordToNumberMap.put("six", 6);
		wordToNumberMap.put("seven", 7);
		wordToNumberMap.put("eight", 8);
		wordToNumberMap.put("nine", 9);
       }
	

	public static Integer wordToNumber(String word) {
		return wordToNumberMap.get(word);
	}

	public static boolean isValidOperation(String word) {
		return word.equals("add") || word.equals("sub") || word.equals("mul") || word.equals("rem")
				|| word.equals("pow") || word.equals("div");
	}

	// Function to parse a word and convert it into a number
	public static Integer parseNumber(String token) {
		String[] parts = token.split("c");
		StringBuilder numberBuilder = new StringBuilder();

		for (String part : parts) {
			Integer digit = wordToNumber(part);
			if (digit == null) {
				return null; // Invalid word found
			}
			numberBuilder.append(digit);
		}

		return Integer.parseInt(numberBuilder.toString());
	}

	// Function to evaluate the expression
	public static String evaluateExpression(String expression) {
		String[] tokens = expression.split(" ");
		int i = 0;
		int result = 0;
		String operation = null;
		boolean operationFound = false; // Track if an operation has been found

		while (i < tokens.length) {
			String token = tokens[i];

			if (isValidOperation(token)) {
				operation = token;
				operationFound = true; // Set operation found flag
				i++;
			} else {
				Integer num = parseNumber(token);
				if (num == null) {
					return "expression evaluation stopped invalid words present";
				}

				if (!operationFound) {
					result = num; // First operand
				} else {
					// Perform the operation
					switch (operation) {
					case "add":
						result += num;
						break;
					case "sub":
						result -= num;
						break;
					case "mul":
						result *= num;
						break;
					case "rem":
						result %= num;
						break;
					case "pow":
						result = (int) Math.pow(result, num);
						break;
					case "div":
						result /= num;
						break;
					}
					operationFound = false; // Reset operation after it's applied
				}
				i++;
			}
		}

		// If there's still an operation without enough operands, return invalid message
		if (operation != null && operationFound) {
			return "expression is not complete or invalid";
		}

		return String.valueOf(result);
	}

	
}
