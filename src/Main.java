import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 10 số nguyên bất kì");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Số"+ (i+1));
            arr[i] = scanner.nextInt();

        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: "+ min(arr));
    }
    public static int min(int arr[]){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min >arr[i]){
                min = arr[i];
            }

        }
        return min;
    }
}
