/**
 * 가위바위보에서 
 * Random(3)+1 을 사용하면 1 ~ 3까지 나옵니다.
 * 컴퓨터가 만든 값이 1이면 가위를 낸 것이고
 * 2이면 바위를 낸 것이고
 * 3이면 보를 낸 것으로 할 때,
 * 사용자측이 가위, 바위, 보를 냈을 때
 * 승패를 결정하는 프로그램을 작성하시오
 */
import java.util.Scanner;
import java.util.Random;
class RockPaperScissors{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
        int dice = 0;
        dice = ran.nextInt(3)+1;
        String com = "";
        String me = "";
        if(dice == 1){
            com = "가위";
        }else if(dice == 2){
            com = "바위";
        }else if(dice == 3){
            com = "보";
        }
        System.out.println("가위, 바위, 보중 하나를 입력하세요: ");
        me = scan.next();
        if(com.equals("가위")){
            if(me.equals("가위")){
                System.out.println("비겼습니다.");
            }else if(me.equals("바위")){
                System.out.println("이겼습니다.");
            }else if(me.equals("보")){
                System.out.println("졌습니다.");
        }
        }else if(com.equals("바위")){
            if(me.equals("가위")){
                System.out.println("졌습니다.");
            }else if(me.equals("바위")){
                System.out.println("비겼습니다.");
            }else if(me.equals("보")){
                System.out.println("이겼습니다.");
            }
        }else if(com.equals("보")){
            if(me.equals("가위")){
                System.out.println("이겼습니다.");
            }else if(me.equals("바위")){
                System.out.println("졌습니다.");
            }else if(me.equals("보")){
                System.out.println("비겼습니다.");
            }
        }else{
            System.out.println("잘못된 선택지입니다.");
        }
    }
}