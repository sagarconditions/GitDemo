
public class arraypracticce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = {{1,13,5},{6,9,8}};
		int min = a[0] [0];
		
		for(int i= 0;i<2;i++)
		{
			
			for(int j=0;j<3;j++)
				
			{
				if(a[i][j]>min)
				{
					min=a[i][j];
				}
			}
			
		}
		
		System.out.println(min);
		
		
		
		
	}

}
