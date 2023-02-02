import java.util.*;
class BubbleSort

{
    void bubbleSort(int arr[])
    {
        int n=arr.length;
        for(int i=0; i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    void display(int arr[])
    {
        int n=arr.length;
        for (int i=0;i<n;i++)
        {
            System.out.println(arr[i]+"  ");
        
        }
    }

    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int []arr=new int[x];

        for(int i=0;i<x;i++)
        {
            arr[i]=sc.nextInt();
        }

        BubbleSort obj =new BubbleSort();
        obj.bubbleSort(arr);
        obj.display(arr);
    }
}



