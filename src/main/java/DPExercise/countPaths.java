package DPExercise;
//TC-->0(2^n),   SC-->0(1)
public class countPaths {
    public static void main(String[] args) {
        System.out.println(matrixPath(3,3));
    }

    private static int matrixPath(int i, int i1) {

        if((i==1)||(i1==1))
        {
            return 1;
        }
        return (matrixPath(i-1,i1)+matrixPath(i,i1-1));
    }
}
