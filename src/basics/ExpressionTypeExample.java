/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basics;

public class ExpressionTypeExample {

    public static void main(String[] args) {
        byte b = 1;
        short s = 1;
        int i = 1;
        long l = 1;

        float f = 1.0F;
        double d = 1.0;

        char c = 1;

        int intExpressionType = b + b;
        int intExpressionType2 = s + s;
        int intExpressionType3 = b + i + c;

        long longExpressionType = i + l;

        float floatExpressionType = l + f;

        double doubleExpressionType = f + d;

        System.out.println(10 / 3); // 3
        System.out.println(10.0 / 3); // 3.3333333333333335

        System.out.println("Hello " + 1); // Hello 1
        System.out.println("Hello " + null); // Hello null

    }
}
