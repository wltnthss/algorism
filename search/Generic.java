package search;

public class Generic {
    
    static class GenericClass<T> {
        private T xyz;

        GenericClass(T t){
            this.xyz = t;
        }
        T getxyz(){
            return xyz;
        }
    }

    public static void main(String[] args) {
        GenericClass<String> s = new GenericClass<String>("ABC");
        GenericClass<Integer> i = new GenericClass<Integer>(15);

        System.out.println(s.getxyz());
        System.out.println(i.getxyz());
    }
}
