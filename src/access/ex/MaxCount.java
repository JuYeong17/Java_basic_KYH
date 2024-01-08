package access.ex;

public class MaxCount {
    private int count=0;
    private int max;
    public MaxCount(int max){
        this.max=max;
    }

    public  void increment(){
        if(max >count) {
            count += 1;
        } else{
            System.out.println("최대값을 초과할 수 없습니다.");
        }
    }
    public int getCount(){
        return count;
    }
}
