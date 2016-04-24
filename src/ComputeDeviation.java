import java.util.Scanner;

public class ComputeDeviation {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double[] values = new double[10];
    System.out.print("Enter ten numbers: ");
    for (int i = 0; i < 10; i++)
      values[i] = input.nextDouble(); 
    
    System.out.printf("The mean is %.2f\n", mean(values));
    System.out.printf("The standard deviation is %.5f\n", deviation(values));
  } // main
  
  public static double deviation(double[] x){
    double sum = 0;
    for (int i = 0; i < 10; i++){
      sum += ((x[i] - mean(x)) * (x[i] - mean(x)));  
    } // for i
    
    return Math.pow((sum/9), 0.5);
  } // deviation
  
  public static double mean(double[] x){
    double sum = 0;
    for (int i = 0; i < 10; i++){
      sum += x[i];  
    }
    
    return sum / 10; 
  } // mean
} // class ComputeDeviation
