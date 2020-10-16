package Practise5.RLE_decoder;

public class Application {
    public static void main( String[] args )
    {
        if(args.length > 0) {
            String old_string = args[0] + ".";
            StringBuilder new_string = new StringBuilder();

            if (Character.isDigit(old_string.charAt(0))) {
                System.out.println("");
                return;
            }

            new_string.append(old_string.charAt(0));

            for(int i=1; i < old_string.length() - 1; i++) {
                char c1 = old_string.charAt(i);
                char c2 = old_string.charAt(i + 1);
                if (c1 == c2) {
                    System.out.println("");
                    return;
                }
                if(Character.isDigit(c1)){
                    if(Character.isDigit(c2)) {
                        System.out.println("");
                        return;
                    }
                    for(int j=1; j < Character.getNumericValue(c1); j++) {
                        new_string.append(old_string.charAt(i-1));
                    }
                }
                else{
                    new_string.append(c1);
                }
            }
            System.out.println(new_string);
        }
    }
}
