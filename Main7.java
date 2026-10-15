import java.util.*;
public class Main7 {
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int odd=0;
int even=0;
for(int i=1;i<=n;i++) {
if(i % 2 == 0) { even+=i;
}else {
 odd+=i;
}
}
 System.out.println("Even: " + even);
 System.out.println("Odd: " + odd);

           }
}


