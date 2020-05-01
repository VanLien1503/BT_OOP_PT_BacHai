package BT_OOP_PT_BacHai;

import java.util.Scanner;

public class PT_BacHai {
    private int a,b,c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    public int  getDiscriminant(int a,int b, int c){
        int denta;
        denta=b*b-(4*a*c);
        System.out.println("denta = "+denta);
        return denta;
    }
    public int getRoot(){
        int x=0;
            x=( -this.b)/2*this.a;
        return x;
    }
    public int getRoot1(){
        int x1;
        x1 = (int) ((-b + Math.sqrt(getDiscriminant(this.a,this.b,this.c))) / (2*a));
        return x1;
    }
    public int getRoot2(){
        int x2 ;
        x2 = (int) ((-b - Math.sqrt(getDiscriminant(this.a,this.b,this.c))) / (2*a));

        return x2;
    }
    public void checkDenTa(){
        if (getDiscriminant(this.a,this.b,this.c)>0){
            System.out.println("PT_Có 2 Nghiệm Phân biệt:");
            System.out.println("x1 = "+getRoot1());
            System.out.println("x2 = "+getRoot2());
        }else if (getDiscriminant(this.a,this.b,this.c)==0){
            System.out.println("PT_có 1 nghiệm Kép");
            System.out.println("x1=x2 = "+getRoot());
        }else {
            System.out.println("PT Vô Nghiệm");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       PT_BacHai pt_bacHai=new PT_BacHai();
        System.out.println("Nhập Số a");
       pt_bacHai.setA(scanner.nextInt());
        System.out.println("Nhập Số b");
       pt_bacHai.setB(scanner.nextInt());
        System.out.println("nhập Số c ");
        pt_bacHai.setC(scanner.nextInt());
        pt_bacHai.checkDenTa();

    }

}
