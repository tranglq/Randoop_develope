
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//Chuong trinh liet ke so lan xuat hien trong mang
public class Mang{
    public static Scanner scanner = new Scanner(System.in);
     
    public static void main(String[] args) {
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        // khoi tao mang arr kieu int voi n phan tu
        int [] arr = new int [n];
        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        // tim so lan xuat hien cua cac phan tu
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            addElement(map, arr[i]);
        }
        System.out.print("Cac phan tu xuat hien 2 lan la: ");
        for (Integer key : map.keySet()) {
            if (map.get(key) == 2) {
                System.out.print(key + " ");
            }
        }
    }
     

    public static void addElement(Map<Integer, Integer> map, int element) {
        if (map.containsKey(element)) {
            int count = map.get(element) + 1;
            map.put(element, count);
        } else {
            map.put(element, 1);
        }
    }
}
