import java.util.*;
class SpecialCharacters {
    	public static int numberOfSpecialChars(String word) {
        	int[] lowercase=new int[26];
        	int[] uppercase=new int[26];
        	for(int i=0;i<26;i++)
        	{
            		lowercase[i]=-1;
            		uppercase[i]=-1;
        	}
        	for(int i=0;i<word.length();i++)
        	{
            		char ch=word.charAt(i);
            		if(Character.isLowerCase(ch))
            		{
                		lowercase[ch-'a']=i;
            		}
            		else
            		{
                		int idx=ch-'A';
                		if(uppercase[idx]==-1)
                		{
                   			uppercase[idx]=i;
                		}	
            		}
        	}
        	int count=0;
        	for(int i=0;i<26;i++)
        	{
            		if(lowercase[i]!=-1 && uppercase[i]!=-1 && lowercase[i]<uppercase[i])
            		{
                		count++;
            		}
            
        	}
        	return count;
    	}
    	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String word=sc.nextLine();
		int result=numberOfSpecialChars(word);
		System.out.println("count "+result);
	}
}