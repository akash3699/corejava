class Program
{
    public static void main(String[] args) {
        int number=123;
        // String strNum= String.valueOf(number);
        String strNumBinary = Integer.toBinaryString(number);
        System.out.println("Integer Binary :"+strNumBinary);
        String strNumOctal = Integer.toHexString(number);
        System.out.println("Integer Hexa  :"+strNumOctal);
        String strNumHexa = Integer.toOctalString(number);
        System.out.println("Integer Octal   :"+strNumHexa);

        double fnumber=123.23d;
        // String strNum= String.valueOf(fnumber);
        // String strFNum   Binary = Double.toBinaryString(fnumber);
        // System.out.println("Double Binary :"+strFNumBinary);
        String strFNumOctal = Double.toHexString(fnumber);
        System.out.println("Double Hexa  :"+strFNumOctal);
        // String strFNumHexa = Double.toOctalString(fnumber);
        // System.out.println("Double Octal   :"+strFNumHexa);



    }
}