/**
 * Created by smrut on 6/12/2017.
 */
public class AddSum {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int n1=0;
        int n2=0;
        int power=1;
        ListNode result;


        while(l1.next!=null){
            n1=n1*power;
            n1+=l1.val;
            //System.out.println(n1);
            power=power*10;
            l1=l1.next;

        }
        n1*=10;
        n1+=l1.val;
        //System.out.println(n1);

        power=1;
        while(l2.next!=null){
            n2=n2*power;
            n2+=l2.val;
            //System.out.println(n2);
            power=power*10;
            l2=l2.next;

        }
        n2*=10;
        n2+=l2.val;
        //System.out.println(n2);
        ListNode newNode;
        int sum=n1+n2;
        result=new ListNode(sum%10);
        sum=(sum-sum%10)/10;


        while (sum!=0){

            //try recursion
            //System.out.println(result.val);
            newNode=new ListNode(sum%10);
            //System.out.println(result.next.val);
            sum=(sum-sum%10)/10;
            newNode.next=result;

            //result.next=result;

            // System.out.println(result.val+ " " +result.next.val);
            result.next=result.next;

        }
        // System.out.println(result);
        return result;

    }

    public static void main(String[] args) {
        AddSum n=new AddSum();
        ListNode result=n.addTwoNumbers(new ListNode(234),new ListNode(123));
        System.out.println(result.val);
        while(result.next!=null) {
            System.out.println(result.val);
            result=result.next;
        }
    }
}
