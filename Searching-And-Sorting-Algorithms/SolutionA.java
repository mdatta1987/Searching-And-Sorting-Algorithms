import java.util.Scanner;

public class SolutionA
{
    public static void search(int[] arr, int left, int right){
        if(left > right){
            System.out.println("NOT_FOUND");
            return;
        }

        int mid = left + (right - left)/2;

        if(arr[mid] == mid){
            System.out.println(mid);

            return;
        }
        else if (arr[mid] > mid){
            search(arr, left, mid-1);
        }else{
            search(arr, mid+1, right);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] array = new int[n+1];

        for (int i = 1; i <= n; i++)
        {
            array[i] = s.nextInt();
        }

        search(array, 1, n);
    }
}
