public class Astring {
    public static void main(String[] args) {

        String string = "today is good day";
        int count = 0;

        //counts each character except space
        for (int i = 0; i < string.length(); i++)
        {
            if (string.charAt(i) != ' ')
                count++;
        }
        //displays the total number of characters present in the given string
        System.out.println("Total number of characterin a string: " + count);
    }
}

