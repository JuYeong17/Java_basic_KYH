package static2.ex;

public class Car {
    private String name;
    private static int count;

    public Car(String name){
        System.out.println("차량 구입, name:"+name);
        this.name=name;
        count++;
    }

    public static void showTotalCars(){
        System.out.println("구매한 차랑수:"+count);
    }


}
