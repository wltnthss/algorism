package data_structure;

public class Int2DArray {
    
    // int[][] x = new int[2][4];
    // 2행 4열 의 2차원 배열.

    public static void main(String[] args) {
        int[][] x = new int[2][4];

        x[0][1] = 11;
        x[0][3] = 24;
        x[1][2] = 31;

        for(int i=0; i<2; i++){
            for(int j=0; j<4; j++){
                System.out.println("x[" + i + "][" + j + "] = " + x[i][j]);
            }
        }
    }
}
