import java.util.Arrays;
import java.util.Scanner;
public class lab {
        public static void main(String[] args) {
            int x,y,z,n;
            Scanner scanner=new Scanner(System.in);
            int lab=0;
            x= scanner.nextInt();
            y= scanner.nextInt();
            z= scanner.nextInt();
            n= scanner.nextInt();
            int arr[]={x,y,z};
            Arrays.sort(arr);
            for(int i=0;i<3;i++)
            {
                if(n<=arr[i])
                {
                    lab=arr[i];
                    break;
                }
            }
            if(lab==x)
            {
                System.out.print("L1");
            }
            else if(lab==y)
            {
                System.out.print("L2");
            }
            else
            {
                System.out.print("L3");
            }


        }
    }

