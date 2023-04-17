import java.util.*;
public class pyramida_pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //for the rows outer loop
        for(int i =0;i<n;i++){
            //for the cols
            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //System.out.println();
        

    }
    
}
