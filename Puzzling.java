import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class Puzzling {
    public Integer sum(ArrayList<Integer> arr){
        int sum = 0;
        for(int i = 0; i < arr.size(); i++){
            sum += arr.get(i);
        }
        return sum;
    }
        public ArrayList<Integer> greaterThan10(ArrayList<Integer> arr){
            ArrayList<Integer> y = new ArrayList<Integer>();
            for(int i = 0; i < arr.size(); i++){
                if(arr.get(i) > 10){
                    y.add(arr.get(i));
                }
            }
        return y;
    }
    public ArrayList<String> greaterThan5(ArrayList<String> arr){
        ArrayList<String> y = new ArrayList<String>();
        for(int i = 0; i < arr.size(); i++){
            if (arr.get(i).length() > 5){
                y.add(arr.get(i));
            }
        }
        return y;
    }
    public void firstAndLast(ArrayList<Character> arr){
        System.out.println("First letter: "+arr.get(0)+" Last letter: "+arr.get(arr.size()-1));
        if(arr.get(0) == 'a'){
            System.out.println("First letter is vowel "+arr.get(0));
        }
        else if(arr.get(0) == 'e'){
            System.out.println("First letter is vowel "+arr.get(0));
        }
        else if(arr.get(0) == 'i'){
            System.out.println("First letter is vowel "+arr.get(0));
        }
        else if(arr.get(0) == 'o'){
            System.out.println("First letter is vowel "+arr.get(0));
        }
        else if(arr.get(0) == 'u'){
            System.out.println("First letter is vowel "+arr.get(0));
        }
    }
    public ArrayList<Integer> randomNumbers(){
        ArrayList<Integer> y = new ArrayList<Integer>();
        Random rand = new Random();
        
        for(int i = 0; i<10; i++){
            y.add(rand.nextInt(46) + 55);
        }
        int min=y.get(0);
        int max=y.get(0);
        Collections.sort(y);
        for(int i = 0; i<y.size(); i++){
            if(y.get(i) > max){
                max = y.get(i);
            }
            else if(y.get(i) < min){
                min = y.get(i);
            }
        }
        System.out.println("Min : "+min+" Max : "+max);
        return y;
    }
    public ArrayList<String> randomStrings(){
        ArrayList<String> y = new ArrayList<String>();
        Random rand = new Random();
        String aBC = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i<10; i++){
            String temp = "";
            for(int j = 0; j < 5; j++){
                temp += aBC.charAt(rand.nextInt(26));
            }
            y.add(temp);
        }
        return y;
    }

}