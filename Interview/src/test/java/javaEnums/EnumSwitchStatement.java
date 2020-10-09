package javaEnums;

public class EnumSwitchStatement {

	EnumConstructor enumConstructor;

	//When this is invoked it initializes instance variable enumConstructor.
	EnumSwitchStatement(EnumConstructor enumConstructor) {
		this.enumConstructor = enumConstructor;
	}

	public void enumSwitch() {
		switch (enumConstructor) {
		case APPLE:
			System.out.println("Eating APPLE");
			break;
		case BANANA:
			System.out.println("Eating BANANA");
			break;
		case POMEGRANATE:
			System.out.println("Eating POMEGRANATE");
			break;
		default:
			System.out.println("On a diet");
			break;
		}

	}

	public static void main(String[] args) {
		String str = "APPLE";
		//Invokes default constructor of EnumConstructor enum class and with the value specified in str invokes current class constructor.
		EnumSwitchStatement obj = new EnumSwitchStatement(EnumConstructor.valueOf(str));
		obj.enumSwitch();//invoke switch method and print matching case value.
	}

}
