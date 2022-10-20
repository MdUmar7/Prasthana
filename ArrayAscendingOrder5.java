/**
package Array;

public class ArrayAscendingOrder5 {

  public static void main(String[] args) {
    int ar[]=new int[]{50,80,10,60,20};
    int len=ar.length;
    int temp=0;
    
    for(int i=0;i<len;i++){
      for(int j=i+1;j<len;j++){
        if(ar[i]>ar[j]){
          temp=ar[i];
          ar[i]=ar[j];
          ar[j]=temp;
        }
      }
    }
    
    System.out.println("Ascending Elements are: ");
    for(int i=0;i<len;i++)
      System.out.println(ar[i]);

  }
}
*/