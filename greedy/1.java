import java.util.Scanner;

class Main {
  public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   int money = scan.nextInt();
   int[] change = {500,100,50,10};
   int ans = 0;

   for(int i=0;i<change.length;i++){
     if(money>change[i]){
       int temp = money/change[i];
       ans += temp;
       money = money % change[i]; 
     }else{
       ans += money/change[3];
     }
   }
   System.out.println(ans);
  }
}