package String;

public class CrawlerLogFolder {

    //https://leetcode.com/problems/crawler-log-folder/description/?envType=daily-question&envId=2024-07-10

    public static void main(String[] args) {
        String[] logs = {"d1/","d2/","../","d21/","./"};
        System.out.println(minOperations(logs));
    }
    public static int minOperations(String[] logs) {
        int count =0;
        String st1 = "../";
        String st2 = "./";
        for(int i=0; i<logs.length; i++){
            if(logs[i].equals(st1)){
                if(count < 1){
                    count =0;
                }else{
                    count -= 1;
                }

            }else if(logs[i].equals(st2)){
                count = count;
            }else {
                count += 1;
            }
        }
        return count;
    }
}
