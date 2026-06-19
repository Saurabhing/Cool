//Find the Greatest Common Divisor (GCD) and Least Common Multiple (LCM) of two numbers.
public class GdcLcm {

    public static void main(String[] args) {
        int number1= 20, number2 = 100;
        int gratest = number1;
        while(gratest>=1){
            if(number1 % gratest == 0 && number2 % gratest == 0){ //% becuse muja reminder find nhi kerna hai
                System.out.println(gratest + " is the GCD");
                break;//agar brake nhi kya to progrm baar baar run hoja withoutmp
            }else{
                gratest--;
            }
        }
        int LCM = (number1*number2)/gratest; //lcm ka formula hai
        System.out.println(LCM + " is the LCM");
    }
}
