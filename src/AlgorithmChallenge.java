import java.util.*;

public class AlgorithmChallenge {
	public static void main(String[] args) {

		// Given a list of numbers, return the number that exists an odd number of
		// times.

		ArrayList<Integer> numbers = new ArrayList<Integer>(
				Arrays.asList(1, 2, 3, 2, 1, 4, 5, 6, 6, 5, 4, 12, 12, 3, 12, 12, 12, 16, 12, 16, 16, 12));
		System.out.println(numbers);

		// TODO: Set the count of each number outside the for loop.

		HashMap<Integer, Integer> numbersMap = new HashMap<Integer, Integer>();
		System.out.println(numbersMap);

		for (Integer number : numbers) {
			System.out.println(number);

			// IF the number exists on the hashmap, increment the corresponding key by 1.
			if (numbersMap.containsKey(number)) {
//				System.out.println("Yup! That number exists as a key on the HashMap!");
				Integer newTotalValue = numbersMap.get(number) + 1;
				numbersMap.put(number, newTotalValue);
			} else {
				// ELSE create the key with the value of 1.
				numbersMap.put(number, 1);
			}

		}

		System.out.println(numbersMap);

		for (Map.Entry<Integer, Integer> number : numbersMap.entrySet()) {
//			System.out.println(number);
			System.out.println(number.getKey());
			System.out.println(number.getValue());
			if(number.getValue() % 2 != 0) {
				System.out.printf("The odd number is %d\n", number.getKey());
//				return number.getKey();
			}
		}

	}
}
