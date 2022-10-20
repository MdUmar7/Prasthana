/**
package Array;
import java.util.Scanner;

public class ArrayAscending {

  public static void main(String[] args) {
    int arr[]=new int[5];
    int len= arr.length;
    int temp=0;
    Scanner in=new Scanner(System.in);
    
    
    System.out.println("Give Input");
    
    for(int i=0;i>len;i++){
      arr[i]=in.nextInt();
      
    }
    for(int i=0;i<len;i++){
      for(int j=i+1;j<length;j++){
      
        if(arr[i]>arr[j]){
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
        
      }
      
    }
    for(int i=0;i<len;i++){
      System.out.println(arr[i]);
    }
  }
}
*/