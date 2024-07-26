package StackAndQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class RobotCollision {
    public static void main(String[] args) {
        int[] positions = {3,13};//{3,5,2,6};
        int[] healths =  {17,2}; // {10,10,15,12};
        String directions = "LR"; //"RLRL";
        List<Integer> list = survivedRobotsHealths(positions,healths,directions);
        System.out.println(list);
    }
        public static List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        Stack<Integer> stack = new Stack<>();
        char[] chars = directions.toCharArray();
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<chars.length; i++){
            if(chars[0]=='R'){
                if(chars[i] == 'R'){
                    stack.push(i);
                }else if(chars[i] == 'L' ){
                    if(!stack.isEmpty() && chars[i-1]!='L' && positions[i]<positions[i-1]){
                        int k  = stack.pop();
                        int win = healths[k]-healths[i];
                        if(win < 0){
                            healths[i] -= 1;
                            list.add(healths[i]);
                        }else if(win==0){

                        }else{
                            healths[k] -= 1;
                            list.add(healths[k]);
                        }
                    }else{
                        stack.push(i);
                    }
                }
            }else{
                if(chars[i] == 'L'){
                    stack.push(i);
                }else if(chars[i] == 'R' ){

                    if(!stack.isEmpty() && chars[i-1]!='R' && positions[i]<positions[i-1]){
                        int k  = stack.pop();
                        int win = healths[k]-healths[i];
                        if(win < 0){
                            healths[i] -= 1;
                            list.add(healths[i]);
                        }else if(win==0){

                        }else{
                            healths[k] -= 1;
                            list.add(healths[k]);
                        }
                    }else{
                        stack.push(i);
                    }
                }
            }

        }
        if(!stack.isEmpty()){
            int n=stack.size();
            for(int i=0; i<n; i++){
                int pos = stack.pop();
                list.add(healths[pos]);
            }
            Collections.reverse(list);
            return list;
        }else{
            return list;
        }



    }
}
