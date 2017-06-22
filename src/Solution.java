import java.util.*;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 * Created by smrut on 6/19/2017.
 */
public class Solution {
//    public enum Romans{
//        I,
//        V,
//        X,
//        L,
//        D,
//        C,
//        M
//    }

    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        HashMap<String,Integer> map=new HashMap();
        Set<Map.Entry<String,Integer>> set;
        List<Entry<String,Integer>> list;
        for(int i=0;i<strs.length;i++){
            if(!map.containsKey(strs[i]) ){
                map.put(strs[i],1);
            }
            else if((i>0 && strs[i-1].equals(strs[i]))){
                map.put(strs[i],map.get(strs[i])+1);
            }
        }
        set=map.entrySet();
       list=new ArrayList<Entry<String, Integer>>(set);
        Collections.sort(list,new Comparator<Map.Entry<String,Integer>>(){
            public int compare(Map.Entry<String,Integer> o1,Map.Entry<String,Integer> o2){
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        System.out.println(list);
        if(list.get(0).getValue()>1 || strs.length==1){
            return list.get(0).getKey().toString();
        }
return "";
    }
    public int romanToInt(String s) {
        int num=0;
        char[] arr=s.toCharArray();
        int previous=0;


        for (int i = 0; i <arr.length ; i++) {


            switch(arr[i]){
                case 'I':num++;
                previous=1;
                    break;
                case 'V':
                    if(i>0 && previous<5){
                        num=num+(5-previous)-previous;
                    }
                    else{
                        num+=5;
                    }
                    previous=5;
                    break;
                case 'X':
                    if(i>0 && previous<10){
                        num=num +(10-previous)-previous;
                    }
                    else{
                        num+=10;
                    }
                    previous=10;
                    break;
                case 'L':
                    if(i>0 && previous<50){
                        num=num+(50-previous)-previous;
                    }
                    else{
                        num+=50;
                    }
                    previous=50;
                    break;
                case 'D':
                    if(i>0 && previous<500){
                        num=num+ 500-previous-previous;
                    }
                    else{
                        num+=500;
                    }
                    previous=500;
                    break;
                case 'C':
                    if(i>0 && previous<100){
                        num=num+ 100-previous-previous;
                    }
                    else{
                        num+=100;
                    }
                    previous=100;
                    break;
                case 'M':
                    if(i>0 && previous<1000){
                        num=num+1000-previous-previous;
                    }
                    else{
                        num+=1000;
                    }
                    previous=1000;
                    break;

            }



        }
        return num;
    }
    public boolean isValid(String s){
        if(s.length()%2!=0) {
            return false;
        }
        HashMap<Character,Integer> map=new HashMap();
        char[] arr=s.toCharArray();
//        System.out.println(arr[0]);
        for (int i = 0; i <(arr.length) ; i++) {
            if(!map.containsKey(arr[i]) ){
                map.put(arr[i],1);
            }
            else {
                map.put(arr[i],map.get(arr[i])+1);
            }
            if(i>0 && (arr[i]==')') && arr[i-1]!='('){
                return false;
            }
            if(i>0 && arr[i]==']' && arr[i-1]!='['){
                return false;
            }
            if(i>0 && arr[i]=='}'&& arr[i-1]!='{'){
                return false;
            }

        }
//        System.out.println(map);
        if(map.get('(')!=map.get(')') || map.get('[')!=map.get(']') ||
                map.get('{')!=map.get('}') ){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        String[] str=new String[1];
        str[0]="a";
//        str[1]="b";
//        str[2]="c";
//        str[3]="a";
//        str[4]="b";
//        System.out.println(s.romanToInt("XXVIII"));
//        System.out.println(s.longestCommonPrefix(str));
        System.out.println(s.isValid("([])"));
    }


    public boolean checkCLosing(String s,String prev){

        return true;
    }
}
