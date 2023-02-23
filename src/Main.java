
public class Main
{
    public static void main(String[] args)
    {

        int[][] fun = new int[5][5];


        System.out.println("Problem 1/2\n");
        for (int row = 0; row < fun.length; row++)
            for(int col = 0; col < fun[0].length; col++)
                //fun[row][col] = col; // problem 1
                fun[row][col] = row; //problem 2

        printString(fun);


        System.out.println("Problem 3\n");
        for (int row = 0; row < fun.length; row++)
            for(int col = 0; col < fun[0].length; col++)
                fun[row][col] = ((row + 1) * 5) - col;

        printString(fun);


        System.out.println("Problem 9\n");

        int counter = 1;
        for (int row = 0; row < fun.length; row++)
        {
            for (int col = row; col < fun[0].length; col++)
            {
                fun[row][col] = counter;
                counter++;
            }
        }

        for (int row = 1; row < fun.length; row ++)
        {
            for(int col = 0; col < row; col++)
            {
                fun[row][col] = counter;
                counter++;
            }
        }
        printString(fun);
        //resetArray(fun);

///////////////////end problem 9\\\\\\\\\\\\\\\\\\\\

        counter = 1;
        System.out.println("Problem 10\n");

        for (int row = 0; row < fun.length; row++)
        {
            for (int col = row; col < fun[0].length; col++)
            {
                fun[row][col] = counter;
                counter++;
            }
            counter += row;
        }
        printString(fun);

    }//end main method

    public static void printString(int[][] fun)
    {
        for (int r = 0; r < fun.length; r++)
        {
            for (int c = 0; c < fun[0].length; c++)
                System.out.print(fun[r][c] + " ");
            System.out.println();
        }
    }//end printString
    public static void resetArray(int[][] fixed)
    {
        for (int r = 0; r < fixed.length; r++)
            for (int c = 0; c < fixed[0].length; c++)
                fixed[r][c] = 0;
    }

}//end class