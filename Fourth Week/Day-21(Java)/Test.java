public class Test {
    //parse method is present inside every wrapper class except Character wrapper class 
    //toString inside the Object class will return the address 
    //but toString method is overridden in Wrapper classes
    public static void main(String[] args) {
        String str = "10";
        int i = Integer.parseInt("20");
        System.out.println(i);
        Integer j= Integer.parseInt(str);
        System.out.println(j);

        Integer n =30;
        String s = n.toString();//here toString will return the value
        //return type of toString is String
        System.out.println(s);
        



    }
}