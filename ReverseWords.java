import  java.util.*;
class Student{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String arr[]=str.split(" ");
        for(int i=0;i<arr.length;i++){
            String k=arr[i];
        StringBuilder str2=new StringBuilder(k);
        System.out.print(str2.reverse()+" ");}
    }
}
