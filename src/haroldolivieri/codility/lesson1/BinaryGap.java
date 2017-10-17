package haroldolivieri.codility.lesson1;

import java.util.Scanner;

class BinaryGap {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int rawValue = scanner.nextInt();

		System.out.println(solution(rawValue));
	}

	public static int solution(int N) {
		String binary = Integer.toBinaryString(N);
		int lastPosition = binary.length();

		while (binary.charAt(lastPosition) == '0') {
			lastPosition--;
		}

		int counter = 0;
		int maxGap = 0;

		for (; lastPosition >= 0; lastPosition--) {
			if (binary.charAt(lastPosition) == '1') {

				if (counter > maxGap) {
					maxGap = counter;
				}

				counter = 0;
			} else {
				counter++;
			}
		}

		return maxGap;
	}
}