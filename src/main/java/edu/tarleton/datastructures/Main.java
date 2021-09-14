package edu.tarleton.datastructures;

import java.util.Scanner;

/**
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Queue queue = new Queue(100);
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        while (m != 0) {
            queue.append(m);
            m = sc.nextInt();
        }
        while (!queue.isEmpty()) {
            int p = queue.get();
            System.out.printf("Queue: %d%n", p);
        }
    }
}
