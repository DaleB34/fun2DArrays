
public class Main
{
    public static void main(String[] args)
    {

        int[][] fun = new int[5][5];


        System.out.println("\nProblem 1/2");
        for (int row = 0; row < fun.length; row++)
            for(int col = 0; col < fun[0].length; col++)
                //fun[row][col] = col; // problem 1
                fun[row][col] = row; //problem 2

        printString(fun);


        System.out.println("\nProblem 3");
        for (int row = 0; row < fun.length; row++)
            for(int col = 0; col < fun[0].length; col++)
                fun[row][col] = ((row + 1) * 5) - col;

        printString(fun);


        System.out.println("\nProblem 9");

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
        System.out.println("\nProblem 10");

        for (int row = 0; row < fun.length; row++)
        {
            for (int col = row; col < fun[0].length; col++)
            {
                fun[row][col] = counter;
                counter++;
            }
            counter += row;
        }

        for (int row = 1; row < fun.length; row ++)
        {
            counter = fun[row][fun[0].length-1] + 1;
            for(int col = 0; col < row; col++)
            {
                fun[row][col] = counter;
                counter++;
            }
        }
        printString(fun);

//////////////end problem 10\\\\\\\\\\\\\\\\\\\\

        int newrow = 0;
        counter = 1;
        System.out.println("\nProblem 11");

        for (int row = 0; row < fun.length; row++)
        {
            newrow = row;
            for (int col = 0; col < row +1; col++)
            {
                fun[newrow][col] = counter;
                counter++;
                if(newrow > 0)
                {
                    newrow--;
                }
            }
        }

        for(int row = fun.length - 1; row > 0; row = fun.length -1)
        {
            newrow = row;
            for(int col = 1; col < row - 1; col++)
            {
                fun[newrow][col] = counter;
                counter++;
                if(newrow > col - fun[0].length)
                {
                    newrow--;
                }
            }
        }

        printString(fun);

    }//end main method

    public static void printString(int[][] fun)
    {
        for (int r = 0; r < fun.length; r++)
        {
            for (int c = 0; c < fun[0].length; c++)
                System.out.printf("%3d", fun[r][c]);
            System.out.println();
        }
    }//end printString

}//end class