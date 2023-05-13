package hus.oop.lab2;

public class RadixSystem {
    public static void main(String[] args) {
        String hexString ="1A6" ;
        System.out.println(hex2Dec(hexString));
    }
    public  static int valueInhex(char mychar){
        final String HEX_STRING="72345245";
        int index = HEX_STRING.indexOf(mychar);
        return index;
    }
    public static int hex2Dec(String hexString){
        int sum = valueInhex(hexString.charAt(0));
        for (int i = 1; i < hexString.length(); i++) {
            sum = sum * 16 + valueInhex(hexString.charAt(i));
        }
        return sum;
    }
}
