package day37;

import java.util.ArrayList;

public class FindLongestInArrayList {

    public static void main(String[] args) {

        ArrayList<String> nameLst =new ArrayList<String>();
        nameLst.add("Qalbinur");
        nameLst.add("Ruzi");
        nameLst.add("Sabahiddin");
        nameLst.add("Guzelnur");
        nameLst.add("Muyesser");
        nameLst.add("Mustafa");


        String longestName = nameLst.get(0);

        for (int i = 0; i <=nameLst.size()-1 ; i++) {
            if(longestName.length()<nameLst.get(i).length()){
                longestName=nameLst.get(i);

            }
        }
        //System.out.println(longestName);
        
        
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(24);
        nums.add(100);
        nums.add(40);
        nums.add(12);
        nums.add(2);
        nums.add(3);
        
        
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i <nums.size() ; i++) {
            if(max<nums.get(i)){
                max=nums.get(i);
            }else if(min>nums.get(i)){
                min=nums.get(i);
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);


        for(String eachName : nameLst){
            if(eachName.length()>longestName.length()){
                longestName=eachName;
            }
        }
        System.out.println(longestName);
    }
}
