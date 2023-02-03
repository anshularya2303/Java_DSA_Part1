//print numbers from 5 to 1
public class recurssion {
    public static void PrintNumb(int n){
        if(n==0)
        return;
        System.out.println(n);
        PrintNumb(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        PrintNumb(n);
    }
    
}
