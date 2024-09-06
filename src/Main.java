import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = 0;

        int arr[] = new int[5];

        for(int i =0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                if(arr[i] > arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }

        for(int i =0 ; i<5; i++) {
            num += arr[i];
        }

        System.out.println(num/5);
        System.out.println(arr[2]);
    }

}