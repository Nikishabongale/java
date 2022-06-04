class selection
{
	public static void main(String[] args)
	{
		int arr[]={4,6,9,1,100};
		int i, j,temp=0;
		for (i=0;i<arr.length-1;i++)
		{
			int smallest=i;
			for (j=i+1;j<arr.length;j++)
			{
				if(arr[smallest] > arr[j])
				{
				smallest=j;
				}
			}
			temp = arr[smallest];
                        arr[smallest] = arr[i];
                        arr[i] = temp;
		} 
	
		for(i=0;i<arr.length;i++)
		 System.out.print(arr[i] + " ");
}
}

