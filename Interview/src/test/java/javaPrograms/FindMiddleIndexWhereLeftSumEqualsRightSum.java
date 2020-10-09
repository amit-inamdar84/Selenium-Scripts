package javaPrograms;
//Set start index at the first element and last index at the last element.
//Initialize sumleft and sumright to 0.
//Keep checking  a condition if sumLeft > sumRight and startIndex > endIndex
//if sumLeft > sumRight will be false for 1st pass as both will be 0.
//So in else condition start adding start index to sumleft and increment start index.
//If not if sumLeft > sumRight keep adding end index number to sumright and decrement end index.
//In this process if startIndex > endIndex then check if sumLeft == sumRight and break the loop.

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
