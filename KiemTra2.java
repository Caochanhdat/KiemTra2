package KiemTra2;

import java.util.Scanner;
import java.util.Arrays;

public class KiemTra2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = null;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Nhập mảng");
            System.out.println("2. In mảng");
            System.out.println("3. Sắp xếp mảng");
            System.out.println("4. Tìm số lớn nhất");
            System.out.println("5. Tìm số nhỏ nhất");
            System.out.println("6. In danh sách số nguyên tố");
            System.out.println("0. Thoát");

            System.out.print("Chọn chức năng (0-6): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return;
                case 1:
                    arr = nhapMang(scanner);
                    break;
                case 2:
                    if (arr == null) {
                        System.out.println("Mảng chưa được nhập.");
                    } else {
                        inMang(arr);
                    }
                    break;
                case 3:
                    if (arr == null) {
                        System.out.println("Mảng chưa được nhập.");
                    } else {
                        sapXepMang(arr);
                        System.out.println("Mảng đã được sắp xếp: " + Arrays.toString(arr));
                    }
                    break;
                case 4:
                    if (arr == null) {
                        System.out.println("Mảng chưa được nhập.");
                    } else {
                        System.out.println("Số lớn nhất trong mảng: " + timMax(arr));
                    }
                    break;
                case 5:
                    if (arr == null) {
                        System.out.println("Mảng chưa được nhập.");
                    } else {
                        System.out.println("Số nhỏ nhất trong mảng: " + timMin(arr));
                    }
                    break;
                case 6:
                    if (arr == null) {
                        System.out.println("Mảng chưa được nhập.");
                    } else {
                        inSoNguyenTo(arr);
                    }
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        }
    }

    public static int[] nhapMang(Scanner scanner) {
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i+1) + ": ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void inMang(int[] arr) {
        System.out.println("Mảng chưa sắp xếp: " + Arrays.toString(arr));
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);
        System.out.println("Mảng đã sắp xếp: " + Arrays.toString(sortedArr));
    }

    public static void sapXepMang(int[] arr) {
        Arrays.sort(arr);
    }

    public static int timMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int timMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static boolean laSoNguyenTo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void inSoNguyenTo(int[] arr) {
        System.out.print("Danh sách các số nguyên tố trong mảng: ");
        for (int num : arr) {
            if (laSoNguyenTo(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
