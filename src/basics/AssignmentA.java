package basics;

public class AssignmentA {

	public static void main(String[] args) {
		// Sum numbers 1 to N
		int N = 5;
		System.out.println(sum(N));
		
		System.out.println(factorial(N));
		
		int[] nums = new int[N];
		int[] info = new int[3];
		
		for(int i = 0; i < N; i++)
			nums[i] = i;
			
		info = findInfo(nums);
		printInfo(info);
	}
	
	public static int sum(int N) {
		int result = 0;
		for(int i=1; i <= N; i++)
			result += i;
		return result;
	}
	
	public static int factorial(int N) {
		if(N == 0)
			return 1;
		return factorial(N-1)*N;
	}
	
	public static int[] findInfo(int[] nums) {
		int[] output = new int[3];
		output[0] = output[1] = nums[0];
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] < output[0])
				output[0] = nums[i];
			if(nums[i] > output[1])
				output[1] = nums[i];
			output[2] += nums[i];				
		}
		output[2] /= nums.length;
		return output;
		//0 is min, 1 is max, 2 is avg
	}
	
	public static void printInfo(int [] nums) {
		System.out.println("Min value: " + nums[0]);
		System.out.println("Max value: " + nums[1]);
		System.out.println("Avg value: " + nums[2]);
	}
}
