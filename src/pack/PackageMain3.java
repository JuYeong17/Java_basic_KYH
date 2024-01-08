package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args){
        User userA=new User();
        pack.b.User userB= new pack.b.User();//이름이 같으면 하나는 풀로 써줘야함
    }
}
