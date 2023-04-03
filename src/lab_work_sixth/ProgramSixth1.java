package lab_work_sixth;

public class ProgramSixth1 {
	public static void main(String[] args) {

		int[][] arr =  {
				{0,2,3},
				{1,3,4},
				{2,-1,5},
				{3,4,5}			
		};

		boolean ok = false;
		int max = arr[0][0];
		int maxIndexCol = 0;


		for(int i = 0; i < arr.length; i++)
		{
			int[] tempArr = arr[i];
			for(int j = 0; j < tempArr.length; j++)
			{
				int elem = tempArr[j];
				if(max < elem)
				{
					maxIndexCol = j;
					max = elem;
				}
			}
		}

		for(int i = 0; i < arr.length; i++)
		{
			int[] tempArr = arr[i];
			for(int j = 0; j < tempArr.length; j++)
			{
				ok = j == maxIndexCol;
				int elem = tempArr[j];
				if(ok)
					continue;
				System.out.print(elem + "\t");
			}
			System.out.println();
		}

	}	
}

