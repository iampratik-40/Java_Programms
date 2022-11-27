import java.util.*;

class TwoD
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List<Integer[][]> ls = new ArrayList<>();

        System.out.println("Enter count of 2d arrays");
        int count = sc.nextInt();

        for(int i = 0;i<count;i++)
        {
            System.out.println("Enter number of rows");
            int rows = sc.nextInt();
            System.out.println("Enter number of columns");
            int columns = sc.nextInt();
            Integer[][] arr = new Integer[rows][columns];

            System.out.println("Enter elements in array");
            for(int j = 0;j<arr.length;j++)
            {
                for(int k = 0;k<arr[j].length;k++)
                {
                    arr[j][k] = sc.nextInt();
                }
            }
            ls.add(arr);
        }
        int m = 1;
        for(Integer[][] arr : ls)
        {
            System.out.println("array no."+m);
            for(int i = 0;i<arr.length;i++)
            {
                for(int j = 0;j<arr[i].length;j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            m++;
            System.out.println();
        }
        System.out.println();
    }

}
