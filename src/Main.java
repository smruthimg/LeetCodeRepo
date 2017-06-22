import java.util.*;

public class Main {


    public static int[] twoSum(int[] nums, int target) {
            int [] result=new int[2];
            for(int i=0; i<nums.length;i++){
                for(int j=0;j<nums.length;j++){
                    if(i!=j && nums[i]+nums[j]==target){
                        result[0]=i;
                        result[1]=j;
                        return result;
                    }
                }

            }
            return result;

        }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> solu=new ArrayList<List<Integer>>();

//        List<HashMap<Integer,Integer>> map=new ArrayList<HashMap<Integer, Integer>>();

        for (int i = 0; i < nums.length; i++) {
//            System.out.println("round i:" +i  + solu);

            for (int j = 0; j < nums.length; j+=1) {

                for (int k = 0; k < nums.length; k++) {


                    boolean same=false;
//                    System.out.println("k :" +k +" same: "+ same);
                    if(nums[i]+nums[j]+nums[k]==0 && (i!=j && j!=k && i!=k)){//&& (nums[i]!=nums[j] && nums[j]!=nums[k] &&nums[i]!=nums[k])
                        List<Integer> innerList=new ArrayList<Integer>();

                        innerList.add(nums[i]);
                        innerList.add(nums[j]);
                        innerList.add(nums[k]);
//                        System.out.println(("innerlist: " +innerList));
//                        same=false;

                        for (List<Integer> l : solu
                        ){

                            Set sameList=new HashSet(l);
                            //remove instead of adding. if size is 0 then its the same list unless
                            //it is 0
                            sameList.remove(innerList.get(0));
                            sameList.remove(innerList.get(1));
                            sameList.remove(innerList.get(2));
                            System.out.println("comparing " + innerList + " " + l + " "+ sameList);
                            if(sameList.size()==0 ){
                                same=true;
                                break;
                            }
//                            System.out.println("Comparing samelist " + sameList + " and innerlst :" + innerList);
//                            System.out.println(sameList.size()==(innerList.size()));
//                            if(sameList.size()<=(innerList.size()) && sameList.size()!=1){
//                                same=true;
//                                break;
////                                System.out.println("samelist: "+sameList);
//                            }
//                            else{
//                                same=false;
//                            }


//                            same=Arrays.deepEquals((innerList.toArray()),l.toArray());
//                            System.out.println(sameList.size());
                        }
                        System.out.println(same + "same" + i + " " +j +" " + k);
//                        System.out.println(i + " " +j +" " + k) ;
                        System.out.println(solu);
                        System.out.println(nums[i] + " " + nums[j]+ " " + nums[k]);

                        if(!same  ) {
                            solu.add(0, innerList);

//                            System.out.println(solu.size());
                        }

                    }


                }

            }



        }
        System.out.println(solu);
        return solu;
    }


    public static void main(String[] args) {
	// write your code here
        List<List<Integer>> solu=new ArrayList<List<Integer>>();;
        int [] nums=new int[12];
//        nums[0]=0;
        //[-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0]
//        nums[0]=-4;
//        nums[1]=-2;
//        nums[2]=1;
//        nums[3]=-5;
//        nums[4]=-4;
//        nums[5]=-4;
//        nums[6]=4;
//        nums[7]=-2;
//        nums[8]=0;
//        nums[9]=4;
//        nums[10]=0;
//        nums[11]=-2;
//        nums[12]=3;
//        nums[13]=1;
//        nums[14]=-5;
//        nums[15]=0;
//        ///////////////////
//        nums[0]=-4;
//        nums[1]=-2;
//        nums[2]=-2;
//        nums[3]=-2;
//        nums[4]=0;
//        nums[5]=1;
//        nums[6]=2;
//        nums[7]=2;
//        nums[8]=2;
//        nums[9]=3;
//        nums[10]=3;
//        nums[11]=4;
//        nums[12]=4;
//        nums[13]=6;
//        nums[14]=6;
//nums[0]=[-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6];
        //[0,3,0,1,1,-1,-5,-5,3,-3,-3,0]
        nums[0]=0;
        nums[1]=3;
        nums[2]=0;
        nums[3]=1;
        nums[4]=1;
        nums[5]=-1;
        nums[6]=-5;
        nums[7]=-5;
        nums[8]=3;
        nums[9]=-3;
        nums[10]=-3;
        nums[11]=0;
//        nums[0]=3;
//        nums[1]=0;
//        nums[2]=-2;
//        nums[3]=-1;
//        nums[4]=1;
//        nums[5]=2;
//        nums[0]=-1;
//        nums[1]=0;
//        nums[2]=1;
//        nums[3]=0;
////        nums[4]=2;

//        nums[0]=3;
//        nums[1]=0;
//        nums[2]=-2;
//        nums[3]=-1;
//        nums[4]=1;
//        nums[5]=2;

//        int[] result=twoSum(nums,5);
//        System.out.println("[" +result[0]+ ","+ result[1]+"]");
        solu=threeSum(nums);
//        for (int i = 0; i <solu.size() ; i++) {
//            System.out.println(solu.get(i));
//        }

    }

}
