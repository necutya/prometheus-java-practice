package Practise5.RLE;

public class Application {
    public static void main( String[] args )
    {
        if(args.length > 0) {
            StringBuilder new_string = new StringBuilder();
            String old_string = args[0] + ".";
            int counter = 1;
            for(int i=0; i < old_string.length() - 1; i++) {
                if(old_string.charAt(i) == old_string.charAt(i + 1)) {
                    counter++;
                }
                else {
                    new_string.append(old_string.charAt(i));
                    if(counter != 1) {
                        new_string.append(counter);
                        counter = 1;
                    }
                }

                if(counter >= 9) {
                    new_string.append(old_string.charAt(i));
                    new_string.append(counter);
                    counter = 0;
                }
            }
            System.out.println(new_string);
        }
    }
}