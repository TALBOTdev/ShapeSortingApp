package utility;

/**
 * 
 * @author Ben Talbot
 * Parses the users incoming arguments into a convenient query object.
 */
public class ArgumentParser {
	
	private String FILE_PATH;
	private char shapeType;
	private char sortType;
	private ArgumentQuery arguementQuery = null;

	public ArgumentQuery parseArgument(String[] args) {
		for (int i = 0; i < args.length; i++) {
			if (args[i].charAt(0) == '-') {
				if (Character.toUpperCase(args[i].charAt(1)) == 'F') {
					FILE_PATH = args[i].substring(2, args[i].length());
				}
				else if (Character.toUpperCase(args[i].charAt(1)) == 'T') {
					shapeType = Character.toUpperCase(args[i].charAt(2));
				}
				else if (Character.toUpperCase(args[i].charAt(1)) == 'S') {
					sortType = Character.toUpperCase(args[i].charAt(2));
				}
				else {
					System.out.println("Bad arguement(s), please try again.");
					System.exit(0);
				}
			} 
			else {
				System.out.println("Bad arguement(s), please try again.");
				System.exit(0);
			}
			
			//https://stackoverflow.com/questions/9909333/whats-the-default-value-of-char
			if (FILE_PATH != null && shapeType != '\u0000' && sortType != '\u0000') {
				arguementQuery = new ArgumentQuery(FILE_PATH, shapeType, sortType);
			}
		}
		return arguementQuery;
	}
	
	

}
