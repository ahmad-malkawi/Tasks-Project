package jo.secondstep.RomanNumTask;

import java.util.*;
import java.util.Scanner;

public class RomanNumTask {
	private static Scanner in;
	static LinkedHashMap<Integer, String> cnstantRomanNumerals = new LinkedHashMap<Integer, String>();

	RomanNumTask() {

	}

	static String convertNormalToRoman(int num) {
		String result = "";
		loop: while (num > 0) {
			for (int key : cnstantRomanNumerals.keySet()) {
				if (num >= key) {
					result += cnstantRomanNumerals.get(key);
					num -= key;
					continue loop;
				}
			}
		}
		return result;
	}

	static int convertRomanToNormal(String num) {
		int length = num.length();
		int result = 0;
		for (int i = 0; i < length; i++) {
			loop: for (int key : cnstantRomanNumerals.keySet()) {
				if (cnstantRomanNumerals.get(key).length() == 2 && num.length() > 1 && i < num.length() - 1) {
					if (num.charAt(i) == cnstantRomanNumerals.get(key).charAt(0)
							&& num.charAt(i + 1) == cnstantRomanNumerals.get(key).charAt(1)) {
						result += key;
						i++;
						break loop;
					}
				} else if (cnstantRomanNumerals.get(key).length() == 1
						&& num.charAt(i) == cnstantRomanNumerals.get(key).charAt(0)) {
					result += key;
					break loop;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		cnstantRomanNumerals.put(1000, "M");
		cnstantRomanNumerals.put(900, "CM");
		cnstantRomanNumerals.put(500, "D");
		cnstantRomanNumerals.put(400, "CD");
		cnstantRomanNumerals.put(100, "C");
		cnstantRomanNumerals.put(90, "XC");
		cnstantRomanNumerals.put(50, "L");
		cnstantRomanNumerals.put(40, "XL");
		cnstantRomanNumerals.put(10, "X");
		cnstantRomanNumerals.put(9, "IX");
		cnstantRomanNumerals.put(5, "V");
		cnstantRomanNumerals.put(4, "IV");
		cnstantRomanNumerals.put(1, "I");
		in = new Scanner(System.in);
		System.out.print("Enter Roman or normal number and it will convert to anuther : ");
		String num = in.next();
		while (num != "-1") {
			try {
				System.out.println(convertNormalToRoman(Integer.parseInt(num)));
			} catch (Exception e) {
				System.out.println(convertRomanToNormal(num.toUpperCase()));
			}
			System.out.println("Enter Roman or normal number and it will convert to anuther : ");
			num = in.next();
		}
	}
}
