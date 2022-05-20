public class Main {
    public static void main(String[] args){
         int width = 2;
         int height = 3;
         int depth = 4;
        Flattener flattener = new Flattener(width, height, depth);
        int[][][] threeDMatrix = flattener.create3dMatrix();
        int[] oneDVector = flattener.get1dArray();
        flattener.print3dMatrix(threeDMatrix);
        flattener.convertTo1dVector(threeDMatrix, oneDVector);
        flattener.printVector(oneDVector);
    }
}
