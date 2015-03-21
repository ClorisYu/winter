package com.ycr;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String source = in.nextLine();
		int sum = in.nextInt();// the sum of two number in nums[]
		in.close();
		int[] result = new int[2];// save result
		int subStrLength;
		subStrLength = 0;
		String[] subStr = { "" };
		if (!source.equals("")) {
			subStr = source.split(",");
			subStrLength = subStr.length;
			System.out.println(subStrLength);
		}
		int[] nums = new int[subStrLength];
		int i = 0;
		while (i < subStrLength) {
			nums[i] = Integer.parseInt(subStr[i], 10);
			System.out.println(nums[i] + "\ti = " + i);
			i++;
		}
		result = twoSum(nums, sum);
		System.out.println("the two numbers is " + result[0] + " and "
				+ result[1]);
	}

	private static int[] twoSum(int[] numbers, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int lenNum = numbers.length;
		int[] result = new int[2];
        for (int i=0; i<lenNum; i++){
            map.put(numbers[i], i+1);
        }
        for (int i=0; i<lenNum; i++){
            if (map.get(target - numbers[i]) != null && map.get(target - numbers[i]) > i+1){
                result[0] = i+1;
                result[1] = map.get(target - numbers[i]);
                return result;
            }
        }
        return null;
//		int lenNum = numbers.length;
//		int[] result = new int[2];
//		if(lenNum < 2){
//			return null;
//		}
//		boolean find = false;
//		int hop = 1;
//		int last = lenNum - 1;
//		while(!find || hop < last){
//			for(int i = 0; i < lenNum; i++){
//				int second = i + hop;
//				if(second > last)
//					break;
//				if(numbers[i] + numbers[second] == target){
//					find = true;
//					if(numbers[i] <= numbers[second]){
//						result[0] = i;
//						result[1] = second;
//					}else{
//						result[0] = second;
//						result[1] = i;
//					}
//				}
//			}
//			hop++;
//		}
//		return result;
	}
	
}
