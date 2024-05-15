public class Main {
    public static void main(String[] args) {
        int[][] array = new int [5][3];
        array[0][0]=1;
        array[0][1]=75;
        array[0][2]=10;
        array[1][0]=2;
        array[1][1]=87;
        array[1][2]=13;
        array[2][0]=3;
        array[2][1]=95;
        array[2][2]=15;
        array[3][0]=4;
        array[3][1]=103;
        array[3][2]=18;
        array[4][0]=5;
        array[4][1]=110;
        array[4][2]=19;

        int[][] array2 = new int[][]{
                {1,75,10},
                {2,87,13},
                {3,95,15},
                {4,103,18},
                {5,110,19}
        };
        System.out.println(array2[0][2]);



        for(int i = 0; i<array.length; i++){
            for(int j = 0; j<array[0].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


        for(int[] column : array){
            for(int value : column){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}