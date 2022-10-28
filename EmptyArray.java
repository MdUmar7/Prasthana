package Array;

public class EmptyArray {

  public static void main(String[] args) {
    int arr[]={};
    int l=arr.length;
    
    System.out.println(l);// 0
    
    System.out.println(arr[0]);//java.lang.ArrayIndexOutOfBoundsException
  }
}
