public class PC{
    public static void main(String[] args){
        System.out.println(
            parantheses("()")
            );
    }


    public static String parantheses(String str){
        char arcOne = '(';
        char arcTwo = ')';
        char curlOne = '{';
        char curlTwo = '}';
        char sqOne = '[';
        char sqTwo = ']';
        String end = "";

        while (str.isEmpty() == false){
            if (str.charAt(0) == arcOne || str.charAt(0) == curlOne || str.charAt(0) == sqOne){

            }
            else{
                end = "Not Valid";
                break;
            }
        }
        return end;
    }
    


}