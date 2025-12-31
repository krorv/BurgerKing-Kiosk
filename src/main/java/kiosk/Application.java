package kiosk;

import java.util.ArrayList;
import java.util.Scanner;

/*

while
    홈화면->입력
        햄버거 -> 입력 -> 메뉴추가 continue;
        음료
        사이드
        장바구니
        수량조절
        삭제
받은 숫자로 counts를 바꾸고, 지우는 건->해당 번호의 ~다 지우기

메뉴추가

 */

public class Application {
    static ArrayList<String> name = new ArrayList<>();
    static ArrayList<Integer> price = new ArrayList<>();
    static ArrayList<Integer> counts = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        //TODO: 구현
        while(true) {
            System.out.println("=====홈=====\n" +
                    "\n" +
                    "1. 햄버거\n" +
                    "2. 사이드\n" +
                    "3. 음료\n" +
                    "4. 장바구니\n" +
                    "5. 종료\n" +
                    "\n" +
                    "메뉴선택:");
            int menu = sc.nextInt();
            int next;
            int sum;
            switch (menu) {
                case 1:
                    System.out.println("=====햄버거 메뉴=====\n" +
                            "\n" +
                            "1. 와퍼 (6900원)\n" +
                            "2. 큐브 스테이크 와퍼 (8900원)\n" +
                            "3. 콰트로 치즈 와퍼 (7900원)\n" +
                            "4. 몬스터 와퍼 (9300원)\n" +
                            "5. 통새우 와퍼 (7900원)\n" +
                            "6. 블랙바베큐 와퍼 (9300원)\n" +
                            "\n" +
                            "메뉴선택 (0을 선택 시 홈으로): ");
                    next = sc.nextInt();
                    Hamburger(next);
                    break;
                case 2:
                    System.out.println("=====사이드 메뉴=====\n" +
                            "\n" +
                            "1. 너겟킹 (2500원)\n" +
                            "2. 해쉬 브라운 (1800원)\n" +
                            "3. 치즈스틱 (1200원)\n" +
                            "4. 어니언링 (2400원)\n" +
                            "5. 바삭킹 (3000원)\n" +
                            "6. 감자튀김 (2000원)\n" +
                            "\n" +
                            "메뉴선택 (0을 선택 시 홈으로):");
                    next = sc.nextInt();
                    side(next);
                    break;
                case 3:
                    System.out.println("=====음료 메뉴=====\n" +
                            "\n" +
                            "1. 코카콜라 (2000원)\n" +
                            "2. 코카콜라 제로 (2000원)\n" +
                            "3. 펩시 (2000원)\n" +
                            "4. 펩시 제로 (2000원)\n" +
                            "5. 스프라이트 (2000원)\n" +
                            "6. 스프라이트 제로 (2000원)\n" +
                            "\n" +
                            "메뉴선택 (0을 선택 시 홈으로):");
                    next = sc.nextInt();
                    drink(next);
                    break;
                case 4:
                    carts();
                    break;
                case 5:

            }
        }

    }



    String burgerSplit=null;
    public static void Hamburger(int h){
        switch (h){
            case 0: return;
            case 1:System.out.println("와퍼 장바구니 담기 완료!");
                cart("와퍼",6900);
                return;
            case 2:System.out.println("큐브 스테이크 와퍼 장바구니 담기 완료!");
                cart("큐브 스테이크 와퍼",8900);
                break;
            case 3:System.out.println("콰트로 치즈 와퍼 장바구니 담기 완료!");
                cart("콰트로 치즈 와퍼",7900);
                break;
            case 4:System.out.println("몬스터 와퍼 장바구니 담기 완료!");
                cart("몬스터 와퍼",9300);
                break;
            case 5:System.out.println("통새우 와퍼 장바구니 담기 완료!");
                cart("통새우 와퍼",7900);
                break;
            case 6:System.out.println("블랙바베큐 와퍼 장바구니 담기 완료!");
                cart("블랙바베큐 와퍼",9300);
                break;
            default:System.out.println("다시 선택해주세요!");

        }
    }




    public static void side(int s){
        switch (s){
            case 0:
                return;
            case 1:System.out.println("너겟킹 장바구니 담기 완료!");
                cart("너겟킹",2500);
                break;
            case 2:System.out.println("해쉬브라운 장바구니 담기 완료!");
                cart("해쉬브라운",1800);
                break;
            case 3:System.out.println("치즈스틱 장바구니 담기 완료!");
                cart("치즈스틱",1200);
                break;
            case 4:System.out.println("어니언링 장바구니 담기 완료!");
                cart("어니언링",2400);
                break;
            case 5:System.out.println("바삭킹 장바구니 담기 완료!");
                cart("바삭킹",3000);
                break;
            case 6:System.out.println("감자튀김 장바구니 담기 완료!");
                cart("감자튀김",2000);
                break;
            default:System.out.println("다시 선택해주세요!");


        }
    }



    public static void drink(int d){
        switch(d){
            case 0: System.out.println("=====홈=====\n" +
                    "\n" +
                    "1. 햄버거\n" +
                    "2. 사이드\n" +
                    "3. 음료\n" +
                    "4. 장바구니\n" +
                    "5. 종료\n" +
                    "\n" +
                    "메뉴선택:");
                break;
            case 1:System.out.println("코카콜라 장바구니 담기 완료!");
                cart("코카콜라",2000);
                break;
            case 2:System.out.println("코카콜라 제로 장바구니 담기 완료!");
                cart("코카콜라 제로",2000);
                break;
            case 3:System.out.println("펩시 장바구니 담기 완료!");
                cart("펩시",2000);
                break;
            case 4:System.out.println("펩시 제로 장바구니 담기 완료!");
                cart("펩시 제로",2000);
                break;
            case 5:System.out.println("스프라이트 장바구니 담기 완료!");
                cart("스프라이트",2000);
                break;
            case 6:System.out.println("스프라이트 제로 장바구니 담기 완료!");
                cart("스프라이트 제로",2000);
                break;
            default:System.out.println("다시 선택해주세요!");
        }
    }


    public static void cart(String menu, int menuPrice){
        int flag = 0;
        for(int i = 0; i < name.size(); i++){
            if(name.get(i).equals(menu)) {
                counts.set(i, counts.get(i) + 1);
                flag = 1;
            }
        }
        if(flag==0) {
            name.add(menu);
            price.add(menuPrice);
            counts.add(1);
        }
        int sum=0;
        System.out.println("장바구니에 담겼습니다!");
        for (int i = 0; i<name.size(); i++) {
            System.out.println("-" + name.get(i) + " "
                    + counts.get(i) + "개");
            sum += price.get(i)*counts.get(i);
        }
        System.out.println("총" + " " + sum + "원");

        System.out.println("====================\n" +
                "1. 주문하기 \n" +
                "2. 수량 조절하기\n" +
                "3. 삭제하기 \n" +
                "메뉴선택 (0을 선택 시 홈으로):");


        int cart = sc.nextInt();
        switch (cart) {
            case 0:
                return;
            case 1:
                System.out.println("이용해주셔서 감사합니다!");
                System.exit(0);
            case 2:
                quantity();
                break;
            case 3:
                remove();
                break;
        }
    }




    public static void carts (){
        int sum = 0;
        for(int i = 0; i < name.size(); i++) {
            sum += price.get(i)*counts.get(i);
            System.out.printf("%d. %s %d개\n", i+1, Application.name.get(i), counts.get(i));

        }
        System.out.printf("총 %d원\n",sum);
    }



    static Scanner s =  new Scanner(System.in);

    public static void quantity(){
        System.out.println("===== 수량 조절하기 =====\n" +
                "\n" +
                "현재 장바구니");
        carts();
        System.out.println("수량을 조절할 메뉴 번호를 선택하세요 (0을 선택 시 홈으로): ");

        int choice = s.nextInt();
        if(choice == 0)
            return;
        System.out.println("변경할 수량을 입력하세요:");
        int choiceCount = s.nextInt();
        switch(choice){
            case 1 : counts.set(choice-1,choiceCount);
            case 2 : counts.set(choice-1,choiceCount);
            case 3 : counts.set(choice-1,choiceCount);
        }//장바구니에 바뀐것을 넘겨주어야함..
    }




    public static void remove(){
        System.out.println("===== 삭제하기 =====\n" +
                "\n" +
                "현재 장바구니");
        carts();
        System.out.println("삭제할 메뉴 번호를 선택하세요 (0을 선택 시 홈으로): ");
        int num = s.nextInt();
        if(num == 0)
            return;
        switch (num){
            case 1 : name.remove(0);
                price.remove(0);
                counts.remove(0);
                break;
            case 2 : name.remove(1);
                price.remove(1);
                counts.remove(1);
                break;
            case 3 : name.remove(2);
                price.remove(2);
                counts.remove(2);
                break;
        }//왜 삭제하면 오류가 나는가..
    }

}