package com.github.kyrenesjtv.leetCode.cn;

import java.util.HashMap;

/**
 * @ProjectName: LeetCodeCN
 * @Author: wanglin
 * @CreateDate: 2018/9/9 10:39
 */
public class EasyCodeImpl implements EasyCode {

    @Override
    public int[] twoSum(int[] nums, int target) {


        //step 1:
//        int[] result =  new int[2];
//        for(int i = 0 ; i<nums.length-1;i++){
//            for(int j = 1; j<nums.length;j++){
//                if(nums[i]+nums[j]==target){
////                    return new int[]{i,j};
//                    result[0] = i;
//                    result[1] = j;
//                }
//            }
//        }
//        return result;

        //step 2:
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        int[] result =  new int[2];
        for(int i = 0 ; i<nums.length ; i++){
            int j = target - nums[i];
            if(integerIntegerHashMap.containsKey(j)){
//                return new int[]{i,integerIntegerHashMap.get(j)};
                result[0] = i;
                result[1] = integerIntegerHashMap.get(j);
            }
            integerIntegerHashMap.put(nums[i],i);
        }
        return result;
    }

    @org.junit.Test
    public void test1(){
        int[] nums =  new int[]{2,7,11, 5};
        int target = 9;
        Long begin = System.currentTimeMillis();
        int[] ints = twoSum(nums, target);
        Long end = System.currentTimeMillis();
        System.out.println("first : "+ints[0]+"\n"+"second : "+ints[1] +"\n"+"cost time :"+(end-begin));
    }

}
