import java.util.*;

class Solution
{
    public void rotate(int[][] array,int r,int c)
    {
        int result[][] = new int[array[0].length][array.length];
        for (int i = 0 ; i < array[0].length ; i++)
        {
            for (int j = 0 ; j < array.length ; j++)
            {
                result[i][j] = array[j][i];
            }
        }

        for (int i = 0 ; i < result.length ; i++)
        {
            int start = 0 ,end = result.length - 1;
            while (start < end)
            {
                int temp = result[i][start];
                result[i][start] =result[i][end];
                result[i][end] = temp;
                start++;
                end--;
            }
        }
        System.out.println(Arrays.deepToString(result));
    }
}

class RotateMatrix
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();
        int columns=scanner.nextInt();
        int[][] array=new int[rows][columns];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                array[i][j]=scanner.nextInt();
            }
        }
        Solution solution =new Solution();
        solution.rotate(array,rows,columns);
    }
}
