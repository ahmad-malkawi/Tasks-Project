package jo.secondstep.session3.second;

import java.util.ArrayList;
import java.util.Random;

public class SecondGame {
	public static void main(String[] args) {
		ArrayList<Integer> randomList = new ArrayList<Integer>();
		ArrayList<Integer> anserList = new ArrayList<Integer>();
		ArrayList<Integer> finalList = new ArrayList<Integer>();
		ArrayList<Integer> equleList = new ArrayList<Integer>();
		int temp;
		Random rand = new Random();
		System.out.print("The juge colers are: ");
		for (int i = 0; i < 4; ) {
			int color = rand.nextInt((16 - 1) + 1) + 1;
			if (!randomList.contains(color)) {
				randomList.add(color);
				System.out.print(randomList.get(i) +" ");
				i++;
			}
		}
		System.out.println("");
		System.out.print("The tister colers are: ");
		for (int i = 0; i < 4; i++) {
			anserList.add(i + 1);
			System.out.print(anserList.get(i) +" ");
		}
		System.out.println("");
		int stepCount = 0;
		int correcteAnser = 0;
		while (correcteAnser < 4) {
			int lastColor = anserList.get(3);
			System.out.println(1);
			int numberOfContane1 = 0;
			int numberOfContane2 = 0;
			for (int i = 0; i < 4; i++) {
				if (randomList.contains(anserList.get(i))) {
					numberOfContane1++;
				}
			}
			if (numberOfContane1 == 4) {
				correcteAnser = 4;
				System.out.println(correcteAnser);
				System.out.println(2);
				break;
			}
			if (numberOfContane1 == 0) {
				for (int i = 0; i < 4; i++) {
					anserList.set(i, ++lastColor);
					System.out.println(3);
				}
			}
			if (!finalList.contains(anserList.get(0))) {
				temp = anserList.get(0);
				anserList.set(0, ++lastColor);
				for (int i = 0; i < 4; i++) {
					if (randomList.contains(anserList.get(i))) {
						numberOfContane2++;
					}
				}
				if (numberOfContane1 > numberOfContane2) {
					anserList.set(0, temp);
					finalList.add(temp);
					correcteAnser++;
					System.out.println(correcteAnser);
				} else if (numberOfContane1 < numberOfContane2) {
					finalList.add(anserList.get(0));
					correcteAnser++;
					System.out.println(correcteAnser);
				} else {
					if (!equleList.contains(anserList.get(0))) {
						equleList.add(anserList.get(0));
						finalList.add(temp);
					} else {
						finalList.add(temp);
					}
				}
				stepCount++;
			} else if (!finalList.contains(anserList.get(1))) {
				temp = anserList.get(1);
				anserList.set(1, ++lastColor);
				for (int i = 0; i < 4; i++) {
					if (randomList.contains(anserList.get(i))) {
						numberOfContane2++;
					}
				}
				if (numberOfContane1 > numberOfContane2) {
					anserList.set(1, temp);
					finalList.add(temp);
					correcteAnser++;
					System.out.println(correcteAnser);
				} else if (numberOfContane1 < numberOfContane2) {
					finalList.add(anserList.get(1));
					correcteAnser++;
					System.out.println(correcteAnser);
				} else {
					if (!equleList.contains(anserList.get(1))) {
						equleList.add(anserList.get(1));
						finalList.add(temp);
					} else {
						finalList.add(temp);
					}
  equlLoop: for (int i = 0; i < equleList.size(); i++) {
			  			stepCount++;
						numberOfContane2 = 0;
						anserList.set(1, equleList.get(i));
						for (int j = 0; j < 4; j++) {
							if (randomList.contains(anserList.get(j))) {
								numberOfContane2++;
							}
						}
						if (numberOfContane1 < numberOfContane2) {
							finalList.add(equleList.get(i));
							equleList.remove(i);
							correcteAnser++;
							System.out.println(correcteAnser);
							stepCount--;
							break equlLoop;
						}
					}
				}
				stepCount++;
			}else if (!finalList.contains(anserList.get(2))) {
				temp = anserList.get(2);
				anserList.set(2, ++lastColor);
				for (int i = 0; i < 4; i++) {
					if (randomList.contains(anserList.get(i))) {
						numberOfContane2++;
					}
				}
				if (numberOfContane1 > numberOfContane2) {
					anserList.set(2, temp);
					finalList.add(temp);
					correcteAnser++;
					System.out.println(correcteAnser);
				} else if (numberOfContane1 < numberOfContane2) {
					finalList.add(anserList.get(2));
					correcteAnser++;
					System.out.println(correcteAnser);
				} else {
					if (!equleList.contains(anserList.get(2))) {
						equleList.add(anserList.get(2));
						finalList.add(temp);
					} else {
						finalList.add(temp);
					}
  equlLoop: for (int i = 0; i < equleList.size(); i++) {
			  			stepCount++;
						numberOfContane2 = 0;
						anserList.set(2, equleList.get(i));
						for (int j = 0; j < 4; j++) {
							if (randomList.contains(anserList.get(j))) {
								numberOfContane2++;
							}
						}
						if (numberOfContane1 < numberOfContane2) {
							finalList.add(equleList.get(i));
							equleList.remove(i);
							correcteAnser++;
							System.out.println(correcteAnser);
							stepCount--;
							break equlLoop;
						}
					}
				}
				stepCount++;
			}
			if (!finalList.contains(anserList.get(3))) {
				temp = anserList.get(3);
				anserList.set(3, ++lastColor);
				for (int i = 0; i < 4; i++) {
					if (randomList.contains(anserList.get(i))) {
						numberOfContane2++;
					}
				}
				if (numberOfContane1 > numberOfContane2) {
					anserList.set(3, temp);
					finalList.add(temp);
					correcteAnser++;
					System.out.println(correcteAnser);
				} else if (numberOfContane1 < numberOfContane2) {
					finalList.add(anserList.get(3));
					correcteAnser++;
					System.out.println(correcteAnser);
				} else {
					if (!equleList.contains(anserList.get(3))) {
						equleList.add(anserList.get(3));
						finalList.add(temp);
					} else {
						finalList.add(temp);
					}
  equlLoop: for (int i = 0; i < equleList.size(); i++) {
			  			stepCount++;
						numberOfContane2 = 0;
						anserList.set(3, equleList.get(i));
						for (int j = 0; j < 4; j++) {
							if (randomList.contains(anserList.get(j))) {
								numberOfContane2++;
							}
						}
						if (numberOfContane1 < numberOfContane2) {
							finalList.add(equleList.get(i));
							equleList.remove(i);
							correcteAnser++;
							System.out.println(correcteAnser);
							stepCount--;
							break equlLoop;
						}
					}
				}
				stepCount++;
			}
			System.out.println("ahmad"+correcteAnser);
		}
		System.out.print("finalList: ");
		for (int i = 0 ; i < 4 ;i++) {
			System.out.println(finalList.get(i)+" ");
		}
	}

}
