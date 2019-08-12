//2+3 = 4
import java.util.Scanner;
class Calck{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i, j, c = 0;
        System.out.print("처음 숫자를 입력하세요: ");
        i = scan.nextInt();
        System.out.print("두번쨰 수를 입력하세요: ");
        j = scan.nextInt();
        String op = "";
        System.out.println("연산 종류를 선택하세요 + , -, *, /");
        op = scan.next();
        if(op.equals("+")){
           c =  i + j;
           System.out.println(String.format("정답은 %d + %d = %d입니다.", i, j, c));
        }else if(op.equals("-")){
            c = i - j;
            System.out.println(String.format("정답은 %d - %d = %d입니다.", i, j, c));
        }else if(op.equals("*")){
            c = i * j;
            System.out.println(String.format("정답은 %d * %d = %d입니다.", i, j, c));
        }else if(op.equals("/")){
            c = i / j;
            System.out.println(String.format("정답은 %d / %d = %d입니다.", i, j, c));
        }else{
            System.out.println("잘못된 입력입니다.");
        }
        }
}