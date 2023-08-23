package com.company;
import java.util.Scanner;
public class pronix_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a=sc.nextInt();
        int y=0;
        for(int i=0;i<=a;i++){
            if(i*(i+1)==a){
                y=1;
                break;
            }
            else{
                continue;
            }
        }
        if(y==1){
            System.out.printf("%d is a pronix number.\n",a);
        }
        else{
            System.out.printf("%d is not a pronix number.",a);
        }
    }
}
