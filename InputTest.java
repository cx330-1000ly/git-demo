import java.util.Scanner;
public class InputTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入数字：");
        int num = sc.nextInt();
        System.out.println("你输入的数字是：" + num);
        sc.close();
    }
}
