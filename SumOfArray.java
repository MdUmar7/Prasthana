package Array;

public class SumOfArray {

  public static void main(String[] args) {
  int sum=0;
  int a[]=new int[]{1,2,3,4,5};
  for(int i=0;i<a.length;i++){
    
    sum=a[i]+sum;
    
  }
  System.out.println(sum);
 }
}
