import java.lang.String;

public class valid_anaagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean result = checkAnagram(s,t);
        System.out.println("The strings are anagrams: " + result);
        
    }

    public static boolean checkAnagram (String s, String t)
    {
        if(s.length() != t.length())
        {
            return false;
        }

        int [] freq = new int[26];

        for(int i=0; i < s.length(); i++)
        {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for(int j=0; j < freq.length; j++)
        {
            if(freq[j] != 0)
            {
                return false;
            }
        }
        return true;
    }
}