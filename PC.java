public class PC{
    public static void main(String[] args){
        System.out.println(
            parantheses("({[()]}())")
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

        int loc = 0;

        while (str.isEmpty() == false){
            if (str.charAt(str.length()-1) == arcOne || str.charAt(str.length()-1) == curlOne || str.charAt(str.length()-1) == sqOne){
                end = "Not Valid";
                break;
            }

            for (int i = str.length() - 1; i >= 0; i--){
                if (str.charAt(i) == arcOne || str.charAt(i) == curlOne || str.charAt(i) == sqOne){
                    loc = i;
                    i = -1;
                }
            }
            
            if (str.charAt(loc) == arcOne){
                if (str.charAt(loc+1) == arcTwo){
                    if (str.length() == 2){
                        end = "Valid";
                        break;
                    }
                    str = str.substring(0, loc) + str.substring(loc+2);
                }
                else{
                    end = "Not Valid";
                    break;
                }
            }

            if (str.charAt(loc) == curlOne){
                if (str.charAt(loc+1) == curlTwo){
                    if (str.length() == 2){
                        end = "Valid";
                        break;
                    }
                    str = str.substring(0, loc) + str.substring(loc+2);
                }
                else{
                    end = "Not Valid";
                    break;
                }
            }

            if (str.charAt(loc) == sqOne){
                if (str.charAt(loc+1) == sqTwo){
                    if (str.length() == 2){
                        end = "Valid";
                        break;
                    }
                    str = str.substring(0, loc) + str.substring(loc+2);
                }
                else{
                    end = "Not Valid";
                    break;
                }
            }

            System.out.println(str);
        }
        return end;
    }
    


}