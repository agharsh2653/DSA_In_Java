package Arrays;

import java.util.*;

public class avgWaitingTime {
//https://leetcode.com/problems/average-waiting-time/description/?envType=daily-question&envId=2024-07-09
//problem Average Waiting Time 1701
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr2D = { {5,2}, //0th index
                {5,4},
                {10,3},
                {20,1}
        };
        double ans = averageWaitingTime(arr2D);
        System.out.println(ans);
    }
    public static double averageWaitingTime(int[][] customers) {
        int currentTime = customers[0][0];
        long totalTime = 0;
        for(int row =0; row<customers.length; row++){
            int arrivalTime = customers[row][0];
            int cookTime = customers[row][1];
            if(currentTime< arrivalTime){
                currentTime =arrivalTime;
            }
            currentTime += cookTime;
            totalTime += (long) currentTime - arrivalTime;

        }
        double avgTime = (double)totalTime/customers.length;
        return avgTime;
    }

}