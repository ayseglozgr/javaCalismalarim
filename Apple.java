/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apple;

import java.util.Scanner;

class Apple {

    int number_of_items;
}

class Banana extends Apple {

    int number_of_items;

    public Banana(int x, int y) {

        
       super.number_of_items = x;
        number_of_items = y;
    }

    public void show() {
        System.out.println("Number of apples:" + super.number_of_items);
        System.out.println("Number of bananas:" + number_of_items);

    }

}

class Challenge {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter the number of apples:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the number of bananas:");
        int num2 = scanner.nextInt();
        Banana obj = new Banana(num1, num2);
        obj.show();

    }

}
