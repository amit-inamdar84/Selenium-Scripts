package javaPrograms;

public class FindMiddleIndexWhereLeftSumEqualsRightSum {
	public static int findMiddleIndex(int[] numbers) throws Exception {
		int sumRight = 0;
		int sumLeft = 0;

		int endIndex = numbers.length - 1;
		int startIndex = 0;

		while (true) {
			if (sumLeft > sumRight) {
				sumRight = sumRight + numbers[endIndex--];
			}

			else {
				sumLeft = sumLeft + numbers[startIndex++];
			}

			if (startIndex > endIndex) {
				if (sumLeft == sumRight) {
					break;
				} else {
					throw new Exception("Enter a valid array");
				}
			}
		}
		return endIndex;
	}

	public static void main(String[] args) throws Exception {
		int[] num = { 2, 4, 4, 5, 4, 1 };
		System.out.println(findMiddleIndex(num));
	}

}
