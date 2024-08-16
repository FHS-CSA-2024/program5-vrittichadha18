//import stuff here?

//Your code here
public class Program5 {
    public static void main(String[]args){
        int miles1 = 286;
        int miles2 = 412;
        int miles3 = 361;
        int miles4 = 161;
        int gallons1 = 9;
        int gallons2 = 40;
        int gallons3 = 18;
        int gallons4 = 11;
        double average1 = (double) miles1/gallons1;
        double average2 = (double) miles2/gallons2;
        double average3 = (double) miles3/gallons3;
        double average4 = (double) miles4/gallons4;
        //multiply by 10.0
        //cast to int
        //cast to double
        //multiply by 10.0
        average1 = Math.round(average1 * 10.0)/10.0;
        average2 = Math.round(average2 * 10.0)/10.0;
        average3 = Math.round(average3 * 10.0)/10.0;
        average4 = Math.round(average4 * 10.0)/10.0;
        System.out.println("Mushroom Cup Prix Racer Average Miles/Per Gallon:");
        System.out.println();
        System.out.println("Royale averaged " + average1 + " m/g");
        System.out.println();
        System.out.println("Koopa King averaged " + average2 + " m/g");
        System.out.println();
        System.out.println("Pipe Frame averaged " + average3 + " m/g");
        System.out.println();
        System.out.println("Badwagon averaged " + average4 + " m/g");
    }
}
//Paste console output below:
/*
Mushroom Cup Prix Racer Average Miles/Per Gallon:

Royale averaged 31.8 m/g

Koopa King averaged 10.3 m/g

Pipe Frame averaged 20.1 m/g

Badwagon averaged 14.6 m/g

*/
