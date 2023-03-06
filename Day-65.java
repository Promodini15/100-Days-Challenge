// Day-65
/*Ajinkya decided to buy a new tablet. His budget is B, so he cannot buy a tablet whose price is greater than B. 
Other than that, he only has one criterion — the area of the tablet's screen should be as large as possible.
Of course, the screen of a tablet is always a rectangle.Ajinkya has visited some tablet shops and listed all of his options. 
In total, there are N available tablets, numbered 1 through N. For each valid i, the i-th tablet has width Wi, height Hi and price Pi.
Help Ajinkya choose a tablet which he should buy and find the area of such a tablet's screen, or determine that he cannot buy any tablet.
*/
  import java.util.*;
public class NewTablet {
  public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter testcase");
      int num=sc.nextInt();
      String []ans=new String[num];
      for(int i=0;i<num;i++){
          System.out.println("enter available and budjet");
          int n=sc.nextInt();
          int b=sc.nextInt();
          int temp=0;
          for(int j=0;j<n;j++){
              int area=0;
              System.out.println("Enter weight.height and price");
              int w=sc.nextInt();
              int h=sc.nextInt();
              int p=sc.nextInt();
              if(p<=b){
                 if(w*h>temp){
                 temp=w*h;
                 } 
              }
          }
          if(temp>0){
          ans[i]=Integer.toString(temp);
          }
          else{
              ans[i]="no tablet";
          }
      }
      for(int i=0;i<num;i++){
          System.out.println(ans[i]);
      }
  }
    
}
