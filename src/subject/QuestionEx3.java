package subject;

import java.util.Arrays;

public class QuestionEx3 {
    public static void main(String[] args) {
//        문제 1) 사칙연산을 할 수 있는 클래스 Calculator을 생성하고 정수를 2개 입력받아 계산한 프로그램을 작성하세요
//        멤버 변수 : int num1, num2, result
//        멤버 메서드 : sum, sub, multi, div
//        모든 결과는 int 데이터 타입으로 사용, 메서드의 4가지 형태 중 아무꺼나 사용
        Calculator cal = new Calculator(10, 3);
        cal.sum();
        cal.sub();
        cal.multi();
        cal.div();


//        문제 2) 1 ~ 45까지의 임의의 숫자 7개를 생성하여 그 결과를 출력하는 프로그램을 작성하세요
//        배열을 사용하여 램덤으로 생성된 데이터를 저장
//        Math.random() 사용
        int lotto1[] = new int[7];

        for (int i = 0; i < lotto1.length; i++) {
            int rnd = (int)((Math.random() * 45) + 1);
            lotto1[i] = rnd;
        }

        for (int i = 0; i < lotto1.length; i++) {
            System.out.print(lotto1[i] + " ");
        }

        System.out.println("\n");

//        문제 3) 문제 2를 여러번 실행 시 배열에 저장되는 숫자가 중복되는 상황이 발생됨, 중복되는 숫자를 제외하고 총 6개의 숫자를 저장하고 출력하는 프로그램을 작성하세요

//      로또 번호를 저장할 배열
        int lotto2[] = new int[7];

//        로또 번호 생성
        for (int i = 0; i < lotto2.length;i++) {
//            랜덤 숫자 생성, 1 ~ 45
            int rnd = (int)((Math.random() * 45) + 1);

//            중복 제거
            for (int j = 0; j < i; j++) {
//                동일한 값이 있는지 확인
                if (rnd == lotto2[j]) {
//                    동일한 값이 있을 경우 현재 루프를 다시 한번 더 실행함
                    i--; // 나중에 자동으로 1 증가할 카운트 변수를 먼저 1 감소 시켜서 동일한 값이 나올 수 있도록 변경함, 동일한 번호 루프를 돌 수 있게 됨  
                    break;
                }
//                동일한 값이 아니면 배열에 저장
                lotto2[i] = rnd;
            }

//            첫번째 루프의 경우 중복 제거 루틴으로 빠지지 않기 때문에 데이터가 저장되는 부분이 없으므로 0번 루프때만 동작되는 if문을 실행함
            if (i == 0) {
                lotto2[i] = rnd;
            }
        }
        
        Arrays.sort(lotto2);
//        화면 출력
        for (int i = 0; i < lotto2.length; i++) {
            System.out.print(lotto2[i] + " ");
        }


    }
}
