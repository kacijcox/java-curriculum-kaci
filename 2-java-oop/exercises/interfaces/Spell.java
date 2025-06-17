package interfaces;
import java.util.Scanner;
import java.util.ArrayList;

public interface Spell {
	void cast();
	String getIncantation();
}

class ExitSpell implements Spell {
	public void cast() {
		System.out.println("A portal opens beneath your feet. Goodbye, wizard!");
		System.exit(0);
	}

	public String getIncantation() {
		return "quit";
	}
}

class SpellBook {
	private ArrayList<Spell> spell = new ArrayList<>();

	public void addSpell(Spell spell) {
		this.spell.add(spell);
	}

	public void tryIncantation(String incantation) {
		for (Spell s : spell) {
			if (s.getIncantation().equals(incantation)) {
				s.cast();
				return;
			}
		}
		System.out.println("the spell fizzled out! try again");
	}

	class magicSpellOne implements Spell {
		@Override
		public void cast() {
			System.out.println("this is spell one");
		}

		@Override
		public String getIncantation() {
			return "abracadabra spell one";
		}

		class magicSpellTwo implements Spell {
			@Override
			public void cast() {
				System.out.println("this is spell two");
			}

			@Override
			public String getIncantation() {
				return "abracadabra spell two";
			}
		}

		class magicSpellThree implements Spell {
			@Override
			public void cast() {
				System.out.println("spell three");
			}

			@Override
			public String getIncantation() {
				return "abracadabra spell three";
			}
		}

		class magicSpellFour implements Spell {
			@Override
			public void cast() {
				System.out.println("spell four");
			}

			@Override
			public String getIncantation() {
				return "abracadabra spell four";
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SpellBook spellBook = new SpellBook();

		SpellBook.magicSpellOne spellOne = spellBook.new magicSpellOne();
		SpellBook.magicSpellOne.magicSpellTwo spellTwo = spellOne.new magicSpellTwo();
		SpellBook.magicSpellOne.magicSpellThree spellThree = spellOne.new magicSpellThree();
		SpellBook.magicSpellOne.magicSpellFour spellFour = spellOne.new magicSpellFour();

		ExitSpell exitSpell = new ExitSpell();

		spellBook.addSpell(spellOne);
		spellBook.addSpell(spellTwo);
		spellBook.addSpell(spellThree);
		spellBook.addSpell(spellFour);
		spellBook.addSpell(exitSpell);

		System.out.println("welcome to the spell book");
		System.out.println("available spells:");
		System.out.println("spell one");
		System.out.println("spell two");
		System.out.println("spell three");
		System.out.println("spell four");
		System.out.println("quit");
		System.out.println();

		while (true) {
			System.out.print("pick a spell: ");
			String userInput = scanner.nextLine().trim();

			spellBook.tryIncantation(userInput);
			System.out.println();
		}
	}
}
