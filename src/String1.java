public class String1 {
    public static void main (String[] args ){
        //To get string, we can create the object for string
        String name = new String("Sudhar");
        String x = "hello" + name; //new string is not required in java as keyword string alone create the new object for string class
        System.out.println(x);

        //charAt - character at the respective index number
        System.out.println(name.charAt(5));
        System.out.println(x.charAt(5));
        System.out.println(x.hashCode());

        // to overcome the immutable string we can use string buffer class as it provide extra space for the string
        StringBuffer buff = new StringBuffer("Sudhar");
        System.out.println(buff.length());

        //append any data in buffered String
        buff.append("man");
        System.out.println(buff.append("man"));

        // we  cant type cast string buffer to string, so use .toString()
        String sud = buff.toString();
        System.out.println(sud);

        // we can delete the String buffer by deletecharat
        System.out.println(buff.deleteCharAt((buff.length())-1));

        // we can insert using .insert
        System.out.println(buff.insert(0,"Java"));



    }
}
