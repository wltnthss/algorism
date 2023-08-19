package data_structure;

class CloneArray{
    // 배열 복제는 clone 메서드를 호출하여 생성 가능.
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = a.clone(); 

        b[2] = 9;

        System.out.print("a = ");
        for(int i=0; i<a.length; i++){
            System.out.print(" " + a[i]);
        }

        System.out.print("\nb = ");
        for(int j=0; j<b.length; j++){
            System.out.print(" " + b[j]);
        }
        System.out.println();
    }
}