class Program
{
    public static void main(String[] args) {
        int number=123;
        // String strNum= String.valueOf(number);
        String strNumBinary = Integer.toBinaryString(number);
        System.out.println("Binary :"+strNumBinary);
        String strNumOctal = Integer.toHexString(number);
        System.out.println("Octal  :"+strNumOctal);
        String strNumHexa = Integer.toOctalString(number);
        System.out.println("Hexa   :"+strNumHexa);


    }
}