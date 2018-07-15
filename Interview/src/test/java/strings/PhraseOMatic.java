package strings;

public class PhraseOMatic {
	public static void main(String[] args) {
		String[] wordListOne = { "24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", "front-end", "web-based",
				"pervasive", "smart", "six-sigma", "critical-path", "dynamic" };
		String[] wordListTwo = { "empowered", "sticky", "value-added", "oriented", "centric", "distributed",
				"clustered", "branded", "outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned",
				"targeted", "shared", "cooperative", "accelerated" };
		String[] wordListThree = { "process", "tipping-point", "solution", "architecture", "core competency",
				"strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission" };
		int oneLength = wordListOne.length;
		System.out.println(oneLength);
		int twoLength = wordListTwo.length;
		System.out.println(twoLength);
		int threeLength = wordListThree.length;
		System.out.println(threeLength);
		int rand1 = (int) (Math.random() * oneLength);
		System.out.println("Random number one is: " + rand1);
		int rand2 = (int) (Math.random() * twoLength);
		System.out.println("Random number two is: " + rand1);
		int rand3 = (int) (Math.random() * threeLength);
		System.out.println("Random number three is: " + rand1);

		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		System.out.println("What we need is a " + phrase);
	}
}
