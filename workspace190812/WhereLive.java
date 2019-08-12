import java.util.Scanner;
class WhereLive{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("어디 사세요?");
        String live = "";
        live = scan.next();
        System.out.println(String.format("저는 %s 에 살고있습니다.", live));
    }
}