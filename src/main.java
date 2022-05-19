public class main {
    public static void main(String[] args){
        int width = 2;
        int height = 3;
        int depth = 4;
        int[][][] threeDMatrix = new int[width][height][depth];
        int[] oneDVector = new int[width*height*depth];

        int value = 0;
        for(int i=0;i<width;i++)
            for(int j=0;j<height;j++)
                for(int k=0;k<depth;k++) {
                    threeDMatrix[i][j][k] = ++value;
                    System.out.print(threeDMatrix[i][j][k] + " ");
                }
        System.out.println();
        for(int i=0;i<width;i++)
            for(int j=0;j<height;j++)
                for(int k=0;k<depth;k++) {
                    int index = i*height*depth + j*depth + k;
                    oneDVector[index] = threeDMatrix[i][j][k];
                }
        for(int i=0;i<width*height*depth;i++) {
            System.out.print(oneDVector[i] + " ");
        }
    }

}
