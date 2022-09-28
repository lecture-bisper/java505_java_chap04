package subject;

import java.util.Scanner;

public class QuestionEx2 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
////        문제 1)
//        Song mySong = new Song("Nesson Dorma");
//        Song yourSong = new Song("공주는 잠 못 이루고");
//        System.out.println("내 노래는 " + mySong.getTitle());
//        System.out.println("너 노래는 " + yourSong.getTitle());
//
////        문제 2)
//        Phone phone1;
//        Phone phone2;
//
//        System.out.print("이름과 전화번호 입력 >> ");
//        phone1 = new Phone(scanner.next(), scanner.next());
//        System.out.print("이름과 전화번호 입력 >> ");
//        phone2 = new Phone(scanner.next(), scanner.next());
//
//        System.out.println(phone1.getName() + "의 번호 " + phone1.getTel());
//        System.out.println(phone2.getName() + "의 번호 " + phone2.getTel());
//
////        문제 3)
////        1. Rect 클래스의 배열 생성
////        2. 반복문으로 4번 데이터 입력 받기
////        3. 넓이의 전체 합을 출력 (반복문)
//        Rect rectArray[] = new Rect[4];
//
//        for (int i = 0; i < rectArray.length; i++) {
//            System.out.print((i + 1) + "너비와 높이 >> ");
//            int width = scanner.nextInt();
//            int height = scanner.nextInt();
//            rectArray[i] = new Rect(width, height);
//        }
//        System.out.println("저장하였습니다...");
//
//        int total = 0;
//
//        for (int i = 0; i < rectArray.length; i++) {
//            total += rectArray[i].getArea();
//        }
//
//        System.out.println("사각형의 전체 합은 " + total);


//        문제 4)
//        1. 사용자 입력을 통해서 전화번호를 저장할 배열 크기를 입력받음
//        2. 지정한 크기 만큼의 사용자 정보 입력받음
//        3. 사용자가 입력한 사용자 이름이 있는지 반복문을 통해서 배열 안의 내용과 비교
//        4. 있으면 정보 출력, 없으면 없습니다. 출력
//        5. exit를 입력 받으면 프로그램 종료

        System.out.println();
        System.out.print("인원수 >> ");
        int size = scanner.nextInt();

//        Phone2 클래스 타입의 배열 생성, 사용자가 입력한 크기 만큼
        Phone2 phoneBook[] = new Phone2[size];

        for (int i = 0; i < phoneBook.length; i++) {
            System.out.print("이름과 전화번호(번호는 연속적으로 입력) >> ");

//            지정한 위치에 Phone2 클래스 타입의 객체 생성하여 저장
            phoneBook[i] = new Phone2(scanner.next(), scanner.next());
        }
        System.out.println("저장되었습니다.");

//        사용자 이름 검색, 무한반복
        while (true) {
            System.out.print("검색할 이름 >> ");
            String searchName = scanner.next();
            int index = -1; // 배열의 index 번호를 저장할 변수, 검색 불가 : -1, 검색 완료 : 검색된 index번호

//            입력된 문자열이 exit와 같으면 프로그램 종료
            if (searchName.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            for (int i = 0; i < phoneBook.length; i++) {
//                검색어로 입력한 이름과 전화번호부에 저장된 이름이 같은지 확인
                if (searchName.equals(phoneBook[i].getName())) {
                    index = i; // 해당 index 번호를 변수 index에 저장
                    break;
                }
            }

//            검색어로 검색한 결과를 확인
            if (index > -1) {
//                저장된 index 번호를 기반으로 전화번호부에 있는 정보를 출력
                System.out.println(phoneBook[index].getName() + "의 번호 " + phoneBook[index].getTel());
            }
            else {
//                없을 경우 없다고 출력
                System.out.println(searchName + " 이 없습니다.");
            }
        }

//        문제 1) 사칙연산을 할 수 있는 클래스 Calculator을 생성하고 정수를 2개 입력받아 계산한 프로그램을 작성하세요
//        멤버 변수 : int num1, num2, result
//        멤버 메서드 : sum, sub, multi, div
//        모든 결과는 int 데이터 타입으로 사용, 메서드의 4가지 형태 중 아무꺼나 사용

//        문제 2) 1 ~ 45까지의 임의의 숫자 6개를 생성하여 그 결과를 출력하는 프로그램을 작성하세요
//        배열을 사용하여 램덤으로 생성된 데이터를 저장
//        Math.random() 사용

//        문제 3) 문제 2를 여러번 실행 시 배열에 저장되는 숫자가 중복되는 상황이 발생됨, 중복되는 숫자를 제외하고 총 6개의 숫자를 저장하고 출력하는 프로그램을 작성하세요
    }
}












