import java.util.*;
public class Starpattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // int n=sc.nextInt();
        for(int i=1; i<=7; i++){
            for(int j=1; j<=7; j++){
                if(((i==3||i==5)&&j<=7)||((i==1||i==7)&&j==4)||(i==4&&(j==2||j==6))){
                    System.out.println("*");
                }
                else{
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
    }

}
