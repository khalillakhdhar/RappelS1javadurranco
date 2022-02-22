/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rappels1javadurranco.ex2;

/**
 *
 * @author khali
 */
public class Calculer {
    
    public String divisibilte(int x)
    {
        
        int c=x/100; // 398/100 = 3
        int d=(x%100)/10;        //  398 % 100= 98 /10 = 9 (x% 100)/10
        int u=x %10; // 389 %10= 9
        int somme=c+d+u;
        if(somme % 3==0)
            return "divisible ";
        else 
            return " n'est pas divisible";         
    }
    public void intervalle(int d,int f)
    {
    for(int i=d; i<=f;i++)
    {
    if(i % 2 ==0)
    {
        System.out.println(i);
    }
    }   
    }
    public int pgcd(int a,int b)
    {
    while(a!=b)
    {
    if(a>b)
        a=a-b;
    else
        b=b-a;
    
    }
    return a;
    /*
    a=16 ,b=12
    a=16-12=4
    b=12-4=8
    b=8-4=4
    
     */
       
    }
    public int ppcm(int a,int b)
    {
    return (a*b) / pgcd(a, b);
    
    
    }
    
}
