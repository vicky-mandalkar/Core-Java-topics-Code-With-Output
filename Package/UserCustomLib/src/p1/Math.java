package p1;

import com.mylib.MathUtils;

public class Math {

    public static void main(String[] args) {

        System.out.println("ADD : "+MathUtils.add(11,22));
        System.out.println("SUB : "+MathUtils.subtract(11,22));
        System.out.println("MUL : "+MathUtils.multiply(11,22));
        System.out.println("DIV : "+MathUtils.divide(11,22));

    }
}
/*
**first peast math.jar file in lab folder . this math.jar is present in MathUtils java classs

COMPILE AND RUN :

		C:\Java Practice Program (VM)\Package\UserCustomLib>javac -cp ./lib/math.jar -d bin src/p1/Math.java
		C:\Java Practice Program (VM)\Package\UserCustomLib>java -cp ./bin;./lib/math.jar p1.Math
		ADD : 33
		SUB : -11
		MUL : 242
		DIV : 0.5
tree /f
C:.
├───bin
│   └───p1
│           Math.class
│
├───lib
│       math.jar
│
└───src
    └───p1
            Math.java
*/