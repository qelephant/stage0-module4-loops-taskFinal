package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        int i, j;
        for(i=0; i<cathetusLength; i++)
        {
            for(j=2*(cathetusLength-i); j>=0; j--)
            {
                System.out.print(" ");
            }
            for(j=0; j<=i; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
