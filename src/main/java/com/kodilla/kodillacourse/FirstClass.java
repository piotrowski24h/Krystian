package com.kodilla.kodillacourse;

import java.sql.SQLOutput;

 class FirstClass {
public static void main (String[] args) {
int result = number(12,18);
System.out.println(result);

result = number(18,24);
System.out.println(result);

    result = number(220 ,310);
    System.out.println(result);

}
public static int number (int a,int b) {
while (a != b) {
    if (a > b) {
        a = a - b;
    } else {
        b=b -a;
    }
}
 return a;
}
 }