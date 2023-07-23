package practice;
import java.math.*;

public class MaxArea {
	static int maxWaterContainer(int heights[]) {
		int maxArea= 0; 
		for(int a = 0; a < heights.length; a++)
		{
			for(int b= a+1; b< heights.length; b++)
			{
				int l = Math.min(heights[a], heights[b]);
				int w = b - a;
				int currentArea = l*b;
				if(maxArea< currentArea) {
					maxArea= currentArea;
				}
			}
		}
		return maxArea;
	}

	public static void main(String[] args) {
		int [] nums= {7,1,2,3,9};
		System.out.println("Max Area:"+maxWaterContainer(nums));
	}

}
