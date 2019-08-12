//2+3 = 4
import java.util.Scanner;
class Calck{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("처음 숫자를 입력하세요: ");
        int i = 0;
        i = scan.nextInt();
        System.out.print("두번쨰 수를 입력하세요: ");
        int j = 0;
        j = scan.nextInt();
        int c = 0;
        c = i + j;
        System.out.println(String.format("정답은 %d + %d = %d입니다.", i, j, c));
    }
}