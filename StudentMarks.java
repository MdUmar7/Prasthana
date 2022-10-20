package Array;

import java.util.Scanner;


public class StudentMarks {

  public static void main(String[] args) {
    int sum=0;
    double avr=0;
    
    int stu[]=new int[5];
    Scanner in=new Scanner(System.in);
    int length=stu.length;
    
    System.out.println("Give student marks: ");
    for(int i=0;i<length;i++){
      stu[i]=in.nextInt();
      sum+=stu[i];
      
    }
    
    for(int i=0;i<length;i++){
      avr=sum/5.0;
      
    }
    
    System.out.println(avr);

  }
}
