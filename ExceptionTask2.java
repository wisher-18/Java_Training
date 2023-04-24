package practice;

import java.util.ArrayList;
import java.util.Scanner;

class CustomException extends Exception
{
	public CustomException(String s) {
		super(s);
	}
}
class LanguageSet
{
	ArrayList <String> languages = new ArrayList<String>();
	LanguageSet(String language)
	{
		this.languages.add("Java");
		this.languages.add("Python");
		this.languages.add("Javascript");
		this.languages.add("C++");
		try {
			addLanguage(languages, language);
		} catch (CustomException e) {
			e.printStackTrace();
		}
		System.out.println(languages);
	}
	
	public void addLanguage(ArrayList<String> languages, String language) throws CustomException
	{
		if(languages.contains(language))
		{
			throw new CustomException("Language "+language+" already exists.");
		}
		else
		{
			languages.add(language);
			System.out.println("Language "+language+" has been added to the List.");
		}
	}
	
}
public class ExceptionTask2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter language with first letter capital:");
		String lang = sc.next();
		LanguageSet l1 = new LanguageSet(lang);
		
		

	}

}
