import java.util.*;   
   
public class J08020 {   
     
    @SuppressWarnings({ "rawtypes", "unchecked" })   
    public static boolean balancedParenthesis(String inputStr) {    
        Stack stack = new Stack();   
        char[] charArray = inputStr.toCharArray();     
        for (int i = 0; i < charArray.length; i++) {      
            char current = charArray[i];      
            if (current == '{' || current == '[' || current == '(') {     
                stack.push(current);   
                continue;   
            }     
            if (stack.isEmpty()) {    
                return false;   
            }     
            char popChar;   
            switch (current) {   
                case ')':   
                popChar = (char) stack.pop();   
                if (popChar == '{' || popChar == '[')   
                    return false;   
                break;   
                case '}':   
                popChar = (char) stack.pop();   
                if (popChar == '(' || popChar == '[')   
                    return false;   
                break;   
                case ']':   
                popChar = (char) stack.pop();   
                if (popChar == '(' || popChar == '{')   
                    return false;   
                break;   
            }   
        }   
        return (stack.isEmpty());   
    }     
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String inputStr;   
            inputStr = sc.nextLine();      
            if (balancedParenthesis(inputStr))   
                System.out.println("YES");   
            else   
                System.out.println("NO");
        }     
    }   
}  