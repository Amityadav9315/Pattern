import java.util.*;
public class ThirdPattern {
    public static void main(String[] args) {
        //int n=5;
        for(int i=1; i<=7; i++){
            for(int j=1; j<=7; j++){
                if(i==4&&(j==6||j==7)){
                    System.out.print(" ");
                }
                else if(i==1||i==4||i==7||j==1){
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
