import java.util.Scanner;

public class SolutionB {
    public static void search(int[] arr, int left, int right, int key){
        int mid = left + (right - left)/2;

        try {
            if(left > right){
                System.out.println("NOT_FOUND");

                return;
            }

            if(arr[mid] == key){
                System.out.println(mid);

                return;
            }
            else if (arr[mid] > key){
                search(arr, left, mid-1, key);
            }else{
                search(arr, mid+1, right*right, key);
            }
        } catch (Exception e) {
            search(arr, left, mid, key);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int[] array = new int[n+1];

        for (int i = 1; i <= n; i++)
        {
            array[i] = s.nextInt();
        }

        search(array, 1, 2, k);
    }
}
