package service;

public class PersonalityCalculator {
	public int[] findAnswers(String options) {
		// Splitting the string
		String s[] = options.split(",");
		int arr[] = new int[s.length];
		// Converting string to integer
		for (int i = 0; i < s.length; i++)
			arr[i] = Integer.parseInt(s[i]);

		for (int i = 0; i < s.length; i++)
			System.out.println(arr[i]);

		return arr;
	}

	public String findYourBrainType(String options) {
		int arr[] = findAnswers(options);
		int A = arr[0] + arr[1] + arr[2] + arr[4] + arr[7] + arr[9] + arr[10] + arr[11] + arr[13] + arr[17] + arr[19];
		int B = arr[3] + arr[5] + arr[6] + arr[12] + arr[14] + arr[15] + arr[16] + arr[18];
		int X = 66 - A + B;
		if ((X >= 20) && (X <= 25))
			return "leftbrained";
		else if ((X >= 56) && (X <= 64))
			return "No clear preference ";
		else
			return "rightbrained";

	}
}