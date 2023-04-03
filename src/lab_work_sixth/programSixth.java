package lab_work_sixth;

public class programSixth {

	public static void main(String[] args) {

		int[][] arr =  {
				{0,2,3},
				{1,3,4},
				{2,-1,5},
				{3,4,5}			
		};

		boolean ok = false;
		int min = arr[0][0];
		int minIndexRow = 0;

		for(int i = 0; i < arr.length; i++) 
		{
			int[] tempArr = arr[i];
			for(int j = 0; j < tempArr.length; j++) 
			{
				int elem = arr[i][j];
				if(min > elem) 
				{
					min = elem;
					minIndexRow = i;
				}
			}
		}

		for(int i = 0; i < arr.length; i++) 
		{
			int[] tempArr = arr[i];
			ok = i == minIndexRow;
			for(int j = 0; j < tempArr.length; j++)   
			{
				if(ok)
					break;
				int elem = arr[i][j];
				System.out.print(elem + "\t");
			}
			if(!ok)
				System.out.println();
		}
	}			
}
