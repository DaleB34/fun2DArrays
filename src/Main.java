
public class Main
{
    public static void main(String[] args)
    {

        int[][] fun = new int[5][5];


        System.out.println("Problem 1/2\n");
        for (int row = 0; row < fun.length; row++)
            for(int col = 0; col < fun[0].length; col++)
                //fun[row][col] = col; // problem 1
                //fun[row][col] = row; //problem 2

        for (int r = 0; r < fun.length; r++)
        {
            for (int c = 0; c < fun[0].length; c++)
                System.out.print(fun[r][c] + " ");
            System.out.println();
        }


        System.out.println("Problem 3\n");
        for (int row = 0; row < fun.length; row++)
            for(int col = 0; col < fun[0].length; col++)
                fun[row][col] = ((row + 1) * 5) - col;

        for (int r = 0; r < fun.length; r++)
        {
            for (int c = 0; c < fun[0].length; c++)
                System.out.print(fun[r][c] + " ");
            System.out.println();
        }

        System.out.println("Problem 9\n");
        for (int row = 0; row < fun.length; row++)
            for(int col = 0; col < fun[0].length; col++)
                fun[row][col] = col +1;

        for (int r = 0; r < fun.length; r++)
        {
            for (int c = 0; c < fun[0].length; c++)
                System.out.print(fun[r][c] + " ");
            System.out.println();
        }



    }//end main method
}//end class