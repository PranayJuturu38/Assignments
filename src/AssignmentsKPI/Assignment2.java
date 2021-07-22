package AssignmentsKPI;

import java.util.HashMap;
import java.util.Scanner;

public class Assignment2 {
    static int map(int n,String[] keys,int[] arr,String s){
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        for(int i=0;i<n;i++){
            hm.put(keys[i],arr[i]);
        }
        if(hm.containsKey(s)){
            return hm.get(s);
        }
        else
            return -1;

    }
    static void getHashMap(int n, String[] keys,int[] arr){
        HashMap<String,Integer> gethash = new HashMap<String,Integer>();
        for(int i=0;i<n;i++){
            gethash.put(keys[i],arr[i]);
        }
       System.out.println("Initial Mapping "+gethash);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking the number of keys as input
        System.out.println("Enter the number of keys");
        int num = sc.nextInt();

        //Taking the keys as input
        System.out.println("Enter the keys:");
        String[] keys =new String[num];
        for(int i=0;i<num;i++){
            keys[i] = sc.next();
        }
        //Displaying the keys entered
        System.out.println("Keys entered:\t");
        for(int i=0;i<num;i++){
            System.out.println("\t"+keys[i]);
        }
        //Taking the values for the keys
        System.out.println("Enter the values for the keys");
        int[] array = new int[num];
        for(int i=0;i<num;i++){
            array[i]=sc.nextInt();
        }

        getHashMap(num,keys,array);

        //Taking the String s to search the required key
        System.out.println("Enter the value of S:");
        String str = sc.next();

        //Passing the inputs as parameters
       System.out.println( map(num,keys,array,str));
    }
}
