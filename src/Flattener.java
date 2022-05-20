public class Flattener {
    private final int width;
    private final int height;
    private final int depth;

    Flattener(int width, int height, int depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    int[] get1dArray(){
        return  new int[width*height*depth];
    }

    int[][][] create3dMatrix(){
        int[][][] matrix = new int[width][height][depth];
        int value = 0;
        for(int i=0;i<width;i++)
            for(int j=0;j<height;j++)
                for(int k=0;k<depth;k++) {
                    matrix[i][j][k] = ++value;
                }
        return  matrix;
    }

    int get1dVectorIndex(int x, int y, int z){
        return x*height*depth + y*depth + z;
    }

    void convertTo1dVector(int[][][] matrix, int[] vector){
        for(int i=0;i<width;i++)
            for(int j=0;j<height;j++)
                for(int k=0;k<depth;k++) {
                    int index = get1dVectorIndex(i, j, k);
                    vector[index] = matrix[i][j][k];
                }
    }

    void print3dMatrix(int[][][] matrix){
        for(int i=0;i<width;i++)
            for(int j=0;j<height;j++)
                for(int k=0;k<depth;k++) {
                    System.out.print(matrix[i][j][k] + " ");
                }
        System.out.println();
    }

    void printVector(int[] vector){
        for(int i=0;i<width*height*depth;i++) {
            System.out.print(vector[i] + " ");
        }
    }
}
