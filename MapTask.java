package practice;

import java.util.*;

public class MapTask {

	public static void main(String[] args) {
		Integer []arr1 ={2,3,5};
		Integer []arr2 = {1,2,3,2,5,3};
		
		Set<Integer> myset = new HashSet<Integer>();
		for(int i=0; i<arr2.length;i++)
		{
			myset.add(arr2[i]);
		}
		Map<Integer, Set>mymap = new HashMap<Integer, Set>();
		for(int i =0; i< arr1.length;i++)
		{
			mymap.put(arr1[i], myset);
		}
		System.out.println(mymap);
		

	}

}
