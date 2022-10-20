package Array;

public class ArrayDistinctCheck {

  public static void main(String[] args) {
    int num[]={1,2,5,2,5};
    int obj[]=new int[num.length];
    
    for(int i=0;i<num.length;i++){
      int count=1;
      for(int j=i+1;j<num.length;j++){
        if(num[i]==num[j]){
          count++;
          obj[j]=1;
        }
      }
      if(count==1 && obj[i]!=1){
        System.out.println(num[i]);
      }
    }
  }
}
