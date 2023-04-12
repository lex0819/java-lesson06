package lesson06_class;

import java.lang.reflect.Array;
import java.util.*;

public class task0 {


    /*Create HashSet, complete it {1,2,3,4,5,6,3}, print it*/
    public static void initHashSet(){
        Set<Integer> numbers = new HashSet<>(Arrays.asList(1,2,3,4,5,6,3));
        System.out.println(numbers);
    }

    /*Create LinkedHashSet, complete it {1,2,3,4,5,6,3}, print it*/
    public static void initLinkedHashSet(){
        Set<Integer> numbers = new LinkedHashSet<>(Arrays.asList(1,2,3,4,5,6,3));
        System.out.println(numbers);
    }

    /*Create TreeHashSet, complete it {1,2,3,4,5,6,3}, print it*/
    public static void initTreeSet(){
        Set<Integer> numbers = new TreeSet<>(Arrays.asList(1,2,3,4,5,6,3));
        System.out.println(numbers);
    }

    public static void main(String[] args){

        initHashSet();
        initLinkedHashSet();
        initTreeSet();
    }
}
