package com.ruthtech.strings;

/** Java code to illustrate how to reverse an array without affecting special characters.
 * 
 * @author ishma
 *
 */
class ReverseStringSpecialChar
{
    public static String reverse(String inputStr)
    {
    	
    	
    	char str[]=inputStr.toCharArray();
    	
        // Initialize left and right pointers
        int r = str.length - 1, l = 0;
 
        // Traverse string from both ends until
        // 'l' and 'r'
        while (l < r)
        {
            // Ignore special characters
            if (!Character.isAlphabetic(str[l]))
                l++;
            else if(!Character.isAlphabetic(str[r]))
                r--;
            else
            {
            	// Both str[l] and str[r] are not spacial
                char tmp = str[l];
                str[l] = str[r];
                str[r] = tmp;
                l++;
                r--;
            }
        }
        
        return str.toString();
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        String str = "a!!!b.c.d,e'f,ghi"; 
        System.out.println("Input string: " + str);  
        System.out.println("Output string: " + reverse(str));
    }
}
 