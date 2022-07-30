package sample;
import java.util.Scanner;
public class PMS_project {
int AV[] = new int[15];//AV is actual value.
int OV[] = new int[15];//OV is observed value.
int E,EP,IN,OUT;//E is error, EP is error percentage, IN 
is input values given to the system, OUT is output values from 
the system.
public void AV_input() {
Scanner AV_inputv = new Scanner(System.in);
for(int i=0;i<15;i++) {
AV[i]=AV_inputv.nextInt();
}
}
public void OV_input() {
Scanner OV_inputv = new Scanner(System.in);
for(int i=0;i<15;i++) {
OV[i]=OV_inputv.nextInt();}
}
public void error_percentage(int av[],int ov[]){
 int mean,acc;
 int dup=0;
 int value[] = new int[15];
 for(int i=0;i<15;i++)
 value[i]=(av[i]-ov[i])/ov[i]*100;
 dup=dup+value[i];
 
 mean=dup/15;
 
 System.out.println("The error percentage is: "+
 mean);
}
public void error(double in,double out) {
double e;
e= out -in;
System.out.println(e);
}
public static void main(String[] args) {
// TODO Auto-generated method stub
PMS_project obj = new PMS_project();
System.out.println("enter your Actual values");
obj.AV_input();
System.out.println("enter your Observed values");
obj.OV_input();
obj.error_percentage(obj.AV,obj.OV);
System.out.println("The error value is:");
 obj.error(10,9.5);
 obj.error_percentage(obj.AV,obj.OV);
}
}