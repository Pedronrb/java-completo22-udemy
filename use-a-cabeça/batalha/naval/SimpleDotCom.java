package batalha.naval;

public class SimpleDotCom {
	private int[] locationCells;
	private int numOfHits = 0;
	
	public String checkYourself(String stringGuess) {
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		
		for(int cell : locationCells) {
			if(guess == cell) {
				result = "hit";
				numOfHits++;
				break;
			}
		}
		if(numOfHits == locationCells.length) {
			result = "kill";	
		}
		System.out.println(result);
		return result;
	}
	

	public int[] getLocationCells() {
		return locationCells;
	}

	public void setLocationCells(int[] locs) {
		this.locationCells = locs;
	}

	public int getNumOfHits() {
		return numOfHits;
	}

	public void setNumOfHits(int numOfHits) {
		this.numOfHits = numOfHits;
	}
	
	
}
