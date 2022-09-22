public class Car5 {
    public String name;
    public String type;
    public String size;
    public String color;

//    this() : 생성자가 자신의 다른 생성자를 호출하는 명령어
    public Car5(String carName, String carType, String carSize, String carColor) {
        name = carName;
        type = carType;
        size = carSize;
        color = carColor;
    }

    public Car5(String carName, String carType, String carSize) {
        this(carName, carType, carSize, "검정색");
    }

    public Car5(String carName, String carType) {
        this(carName, carType, "대형");
    }

    public Car5(String carName) {
        this(carName, "세단");
    }

    public Car5() {
        this("그랜저");
    }


    public void getInfo() {
        System.out.println("이름 : " + name + "\n차종 : " + type + "\n크기 : " + size + "\n색상 : " + color);
    }


}
