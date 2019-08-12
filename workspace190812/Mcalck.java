import java.util.Scanner;
class Mcalck{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("처음수를 입력하세요: ");
        int i = 0;
        i = scan.nextInt();
        System.out.print("두번째 수를 입력하세요: ");
        int j = 0;
        j = scan.nextInt();
        int c = i-j;
        System.out.println(String.format("정답은 %d - %d = %d 입니다.", i, j, c));
    }
}