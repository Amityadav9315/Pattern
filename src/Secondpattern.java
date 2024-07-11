import java.util.*;
public class Secondpattern {
    public static void main(String[] args) {
        //int n=5;
        for(int i=1; i<=7; i++){
            for(int j=1; j<=7; j++){
                if(i==1||i==7||i+j==8){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
