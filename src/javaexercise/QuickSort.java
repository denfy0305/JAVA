package javaexercise;

public class QuickSort {
	
	public void qSort(Integer[] x,int low,int high){
		if(low<high)
		{
			int mid=getMiddle(x,low,high);
			qSort(x,0,mid);
			qSort(x,mid+1,high);
		}
	}
	
	public int getMiddle(Integer[] x,int low,int high)
	{
		int temp=x[low];
		while(low<high)
		{
			while(low<high && x[high]>temp)
			{
				high--;
			}
			x[low]=x[high];
			while(low<high && x[low]<temp)
			{
				low++;
			}
			x[high]=x[low];
		}
		x[low]=temp;
		return low;
	}

}
