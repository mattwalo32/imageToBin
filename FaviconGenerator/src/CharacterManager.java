import java.util.ArrayList;
import java.util.List;

public class CharacterManager {

	private int width;
	private int height;
	
	private static final int CHARACTER_HEIGHT = 5;
	private static final String FILLER_COLOR = "AAA";
	
	public static final String BACKGROUND_COLOR = FILLER_COLOR;
	public static final String ZERO_COLOR = "F00";
	public static final String ONE_COLOR = "FF0";
	
	public CharacterManager(int width, int height) 
	{
		this.width = width;
		this.height = height;
	}
	
	public Characters[] createCharArray(String text) {
		char[] charArray = text.toCharArray();
		List<Characters> output = new ArrayList<>();
		Characters[] chars;
		
		for(char character : charArray)
		{
			switch(character) 
			{
				case '0':
					System.out.println("ADDED 0");
					output.add(Characters.ZERO);
					break;
				case '1':
					System.out.println("ADDED 1");
					output.add(Characters.ONE);
					break;
				case '2':
					output.add(Characters.META_ONE);
				default:
					output.add(Characters.SPACE);
			}
			
			output.add(Characters.SPACE);
		}
		
		chars = output.toArray(new Characters[output.size()]);
		
		return chars;
	}
	
	public String createString(Characters[] chars) {
		String output = addLineBreak("");
		
		int lineLength = 1;
		int lineIndexStart = 0;
		int lineIndexEnd = 0;
		
		for(int i = 0; i < chars.length; i++)
		{
			lineLength += chars[i].getWidth();
			
			
			if(lineLength > width/* || i == chars.length - 1*/)
			{
				lineLength -= chars[i].getWidth();
				lineIndexEnd = i;
				
				System.out.println("USING INDEX " + lineIndexStart + " - " + lineIndexEnd);
				
				for(int j = 0; j < CHARACTER_HEIGHT; j++)
				{
					output += FILLER_COLOR;
					
					for(int k = lineIndexStart; k < lineIndexEnd; k++)
					{
						output += chars[k].getChars()[j];
					}
					
					for(int k = 0; k < (width - lineLength); k++)
					{
						output += FILLER_COLOR;
						System.out.println("Adding filler to row" + j);
					}
					
				}
				
				output = addLineBreak(output);
				
				lineLength = 1;
				lineIndexStart = i;
				
				i-= 1;
			}
		}
		
		return output;
	}
	
	public String addLineBreak(String input) {
		for(int i = 0; i < width; i++)
		{
			input += FILLER_COLOR;
		}
		
		return input;
	}
	
}
