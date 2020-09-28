import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class Test {
    public static void main(String[] args){
        ArrayList<Integer> testArr = new ArrayList<Integer>();
        testArr.add(3);
        testArr.add(5);
        testArr.add(1);
        testArr.add(2);
        testArr.add(7);
        testArr.add(9);
        testArr.add(8);
        testArr.add(13);
        testArr.add(25);
        testArr.add(32);
        ArrayList<String> names = new ArrayList<String>();
        names.add("Nancy");
        names.add("Jinichi");
        names.add("Fujibayashi");
        names.add("Momochi");
        names.add("Ishikawa");
        ArrayList<Character> aBC = new ArrayList<Character>();
        aBC.add('a');
        aBC.add('b');
        aBC.add('c');
        aBC.add('d');
        aBC.add('e');
        aBC.add('f');
        aBC.add('g');
        aBC.add('h');
        aBC.add('i');
        aBC.add('j');
        aBC.add('k');
        aBC.add('l');
        aBC.add('m');
        aBC.add('n');
        aBC.add('o');
        aBC.add('p');
        aBC.add('q');
        aBC.add('r');
        aBC.add('s');
        aBC.add('t');
        aBC.add('u');
        aBC.add('v');
        aBC.add('w');
        aBC.add('x');
        aBC.add('y');
        aBC.add('z');



        Puzzling runFun = new Puzzling();
        Integer problem1 = runFun.sum(testArr);
        System.out.println(problem1);
        ArrayList<Integer> problem2 = runFun.greaterThan10(testArr);
        System.out.println(problem2);

        Collections.shuffle(names);
        System.out.println(names);
        ArrayList<String> problem3 = runFun.greaterThan5(names);
        System.out.println(problem3);
        Collections.shuffle(aBC);
        System.out.println(aBC);
        runFun.firstAndLast(aBC);
        Random r = new Random();
        ArrayList<Integer> problem4 = runFun.randomNumbers();
        System.out.println(problem4);
        ArrayList<String> lastProblem = runFun.randomStrings();
        System.out.println(lastProblem);

    }
}