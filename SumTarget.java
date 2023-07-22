package practice;

public class SumTarget {
	public static  int[]  findIndex(int[] nums, int target) {
		for(int p1 = 0; p1 < nums.length; p1++)
		{
			System.out.println("P1:"+p1+" value:"+nums[p1]);
			int noToFind = target - nums[p1];
			System.out.println("NumberToFind: "+noToFind);
			for(int p2 = p1+1; p2 < nums.length; p2++) {
				System.out.println("p2:"+p2+" value:"+nums[p2]);
				if(noToFind == nums[p2]) {
					return  new int[] {p1,p2};
				}
			}
		}
		return null;
		
	}
	

	public static void main(String[] args) {
		int [] nums= {1, 3, 7, 9, 1, 10};
		int target = 11;
		int[] result=findIndex(nums, target);
		if(result!= null) {
			System.out.println(result[0]+" "+result[1]);
		}
		else {
			System.out.println("null");
		}
		

	}

}
