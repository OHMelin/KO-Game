

public class Map {
//##########Fields###########
	int playerRow = 3;
	int playerCol = 1;
	int enemyRow = 2;
	int enemyCol = 1;
	
//######Methods##########
	
	//DrawMap
	/*
	 * We have a two dimensional Array called "map" which contains data type of "char" which creates a matrix - row and column
	 * We use a nested for loop to go through each row and print it's columns.
	 * We start at row = 0, we keep looping until we have reached our number of rows in our Array --> row < map.length
	 * for every row we need another loop to go through its columns --> col < map[row].length
	 * We then make a variable called design to keep track of the rows and columns to print --> String design = map[row][col] + "";
	 * We print our rows and columns --> System.out.print(design);
	 */
	public void updateDrawMap() 
	{
		char[][] map = {
				{'#','#','#','#','#','#'}, 
				{'#','-','-','-','-'},
				{'#','-','-','-','-','#'},
				{'#','-','-','-','-','#'},
				{'#','-','-','-','-','#'},
				{'#','-','-','-','-','#'},
				{'#','-','-','-','-','#'},
				{'#','#','#','#','#','#'}};
		
		//Enemy & Player position
		map[playerRow][playerCol] = 'P';
		map[enemyRow][enemyCol] = 'E';
				
		//NestedForLoopToGoDrawMap
			for(int row = 0; row < map.length; row++) 
			{
				for(int col = 0; col < map[row].length; col++) 
				{
					String design = map[row][col] + " ";
					System.out.print(design);
				}	
				System.out.println();
			} 
		
		//Map Boundary Checks
			
		//Movement
	}
	
	
	
}


