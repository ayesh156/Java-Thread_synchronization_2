package com;

class MyThread extends Thread {
    
    A a;
    
    public MyThread(A a){
        this.a = a;
    }

    @Override
    public void run() {
        a.m();
    }
    
}

class A{
    synchronized void m(){
        for (int j = 0; j < 10; j++) {
            System.out.print(j+" ");
        }
        System.out.println("");
    }
}

public class Test {
    public static void main(String[] args){
        
       A a = new A();
        
       MyThread mt1 = new MyThread(a);
       MyThread mt2 = new MyThread(a);
       MyThread mt3 = new MyThread(a);
       MyThread mt4 = new MyThread(a);

       mt1.start();
       mt2.start();
       mt3.start();
       mt4.start();
       
    }
}
