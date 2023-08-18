package data_structure;

public class IntArray {
    public static void main(String[] args) {
        
        int[] a = new int[5];
        
        a[1] = 21;
        a[2] = 34;
        a[4] = 23;

        for(int i=0; i<a.length; i++){
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
