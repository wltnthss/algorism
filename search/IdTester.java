package search;

public class IdTester {
    public static void main(String[] args) {
        Id id1 = new Id();
        Id id2 = new Id();

        System.out.println("id1의 아이디 : " + id1.getId());
        System.out.println("id2의 아이디 : " + id2.getId());

        System.out.println("부여한 아이디의 개수 : " + Id.getCounter());
    }
}

class Id{
    private static int counter = 0;     
    private int id;

    public Id(){
        id = ++counter;
    }

    public int getId(){
        return id;
    }
    
    // 클래스 메소드
    public static int getCounter(){
        return counter;
    }
}
