import vn.edu.tdtu.ArrayOutput;
import vn.edu.tdtu.ArrayHandler;

public class exercise2 {
    public static void main(String[] args) {
        int a[] = {12, 2, 34, 5, 6};
        System.out.print("Array a: ");
        ArrayOutput.print(a);
        int b[] = {42, 1, 25, 56, 14};
        System.out.print("Array b: ");
        ArrayOutput.print(b);
        int c[] = ArrayHandler.merge(a, b);
        System.out.print("Array c before sorting: ");
        ArrayOutput.print(c);
        ArrayHandler.sort(c);
        System.out.print("Array c after sorting: ");
        ArrayOutput.print(c);
        ArrayOutput.write(c, "output.txt");
    }
}