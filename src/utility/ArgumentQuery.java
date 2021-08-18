package utility;

/**
 * 
 * @author Ben Talbot
 * A class that holds incoming arguments from the user.
 */
public class ArgumentQuery {

	private String filePath;
	private char compareType;
	private char sortType;
	
	public ArgumentQuery(String filePath, char compareType, char sortType) {
		super();
		this.filePath = filePath;
		this.compareType = compareType;
		this.sortType = sortType;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public char getCompareType() {
		return compareType;
	}

	public void setCompareType(char compareType) {
		this.compareType = compareType;
	}

	public char getSortType() {
		return sortType;
	}

	public void setSortType(char sortType) {
		this.sortType = sortType;
	}

	@Override
	public String toString() {
		return "";
	}
	
	
	
}
