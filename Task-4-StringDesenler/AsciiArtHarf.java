package JavaLab3.gorev4metinvestring;

public class ASCIIArt {
	public static void main(String[] args) {
		String[] art = new String[] {
			"#   #   ###   #     #####  #   #   #####  #   #",
			"#   #  #   #  #     #      #   #   #      #   #",
			"#####  #   #  #     ###    #####   ###    #####",
			"#   #  #####  #     #      #   #   #      #   #",
			"#   #  #   #  #     #      #   #   #      #   #",
			"#   #  #   #  ##### #####  #   #   #####  #   #",
			"",
			"  #   #    ###    #     #   #",
			"  #   #   #   #   #     #   #",
			"  #####   #   #   #     #####",
			"  #   #   #####   #     #   #",
			"  #   #   #   #   #     #   #",
			"  #   #   #   #   ##### #   #",
		};

		// Print ASCII art with a small header
		System.out.println("--- Halenaz ASCII Art ---\n");
		for (String line : art) {
			System.out.println(line);
		}
	}
}
