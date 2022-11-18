package javApmosys;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_second_highest_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {4,53,74,875,8,36,345,24,32,53,45};
		Arrays.sort(a);
		int highest_no=a.length-2;
		System.out.println(a[highest_no]);

	}

}
