import java.util.Scanner;
public class ALEDO_ACTIVITY_I{
public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    
    int length = getLength();
    int width = getWidth();
    int area = length * width;
    System.out.println("Area: " + area);

}

 static int getLength(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length:");
    
    return sc.nextInt();
}

static int getWidth(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter width:");
    return sc.nextInt();
}
}



