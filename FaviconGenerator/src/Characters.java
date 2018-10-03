
public enum Characters {
	
	ZERO(new String[] {
		CharacterManager.ZERO_COLOR + CharacterManager.ZERO_COLOR + CharacterManager.ZERO_COLOR,
		CharacterManager.ZERO_COLOR + CharacterManager.BACKGROUND_COLOR + CharacterManager.ZERO_COLOR,
		CharacterManager.ZERO_COLOR + CharacterManager.BACKGROUND_COLOR + CharacterManager.ZERO_COLOR,
		CharacterManager.ZERO_COLOR+ CharacterManager.BACKGROUND_COLOR + CharacterManager.ZERO_COLOR,
		CharacterManager.ZERO_COLOR + CharacterManager.ZERO_COLOR + CharacterManager.ZERO_COLOR
	}, 3),
	
	ONE(new String[] {
			CharacterManager.BACKGROUND_COLOR + CharacterManager.ONE_COLOR + CharacterManager.BACKGROUND_COLOR,
			CharacterManager.BACKGROUND_COLOR + CharacterManager.ONE_COLOR + CharacterManager.BACKGROUND_COLOR,
			CharacterManager.BACKGROUND_COLOR + CharacterManager.ONE_COLOR + CharacterManager.BACKGROUND_COLOR,
			CharacterManager.BACKGROUND_COLOR + CharacterManager.ONE_COLOR + CharacterManager.BACKGROUND_COLOR,
			CharacterManager.BACKGROUND_COLOR + CharacterManager.ONE_COLOR + CharacterManager.BACKGROUND_COLOR
	}, 3),
	
	META_ONE(new String[] {
			CharacterManager.BACKGROUND_COLOR + CharacterManager.ZERO_COLOR + CharacterManager.BACKGROUND_COLOR,
			CharacterManager.BACKGROUND_COLOR + CharacterManager.ZERO_COLOR + CharacterManager.BACKGROUND_COLOR,
			CharacterManager.BACKGROUND_COLOR + CharacterManager.ZERO_COLOR + CharacterManager.BACKGROUND_COLOR,
			CharacterManager.BACKGROUND_COLOR + CharacterManager.ZERO_COLOR + CharacterManager.BACKGROUND_COLOR,
			CharacterManager.BACKGROUND_COLOR + CharacterManager.ZERO_COLOR + CharacterManager.BACKGROUND_COLOR
	}, 3),
	
	SPACE(new String[] {
		CharacterManager.BACKGROUND_COLOR,
		CharacterManager.BACKGROUND_COLOR,
		CharacterManager.BACKGROUND_COLOR,
		CharacterManager.BACKGROUND_COLOR,
		CharacterManager.BACKGROUND_COLOR
	}, 1);
	
//	TWO(new String[] {
//			"111",
//			"001",
//			"111",
//			"100",
//			"111",
//	}, 3),
//	
//	THREE(new String[] {
//			"111",
//			"001",
//			"111",
//			"001",
//			"111",
//	}, 3),
//	
//	FOUR(new String[] {
//			"101",
//			"101",
//			"111",
//			"001",
//			"001"
//	}, 3),
//	
//	FIVE(new String[] {
//			"111",
//			"101",
//			"111",
//	}, 3),
//	
//	TWO(new String[] {
//			"111",
//			"101",
//			"111",
//	}, 3),
//	
//	TWO(new String[] {
//			"111",
//			"101",
//			"111",
//	}, 3),
//	
//	TWO(new String[] {
//			"111",
//			"101",
//			"111",
//	}, 3),
//	
//	TWO(new String[] {
//			"111",
//			"101",
//			"111",
//	}, 3);
	
	private String[] chars;
	private int width;
	
	Characters(String[] chars, int width) 
	{
		this.chars = chars;
		this.width = width;
	}
	
	String[] getChars() 
	{
		return chars;
	}
	
	int getWidth()
	{
		return width;
	}
}
