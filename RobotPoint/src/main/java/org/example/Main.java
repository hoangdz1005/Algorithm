package org.example;

import java.util.Scanner;

public class Main {
    static class Point{
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static Point queuePoint[];
    static int start =0;
    static int end = -1;
    static void push(int x, int y) {
        end++;
        Point point = new Point(x, y);
        queuePoint[end] = point;
    }
    static Point pop() {
        Point point = queuePoint[start];
        start++;
        return point;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int beginX = scanner.nextInt();
        int beginY = scanner.nextInt();
        int arr[][] = new int[n+2][n+2];
        queuePoint = new Point[1000];
        for(int i =1;i<=n;i++) {
            for(int j =1;j<=n;j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int count = arr[beginX][beginY];
       int max = arr[beginX][beginY];
       push(beginX, beginY);
        while (true) {
            int i=0,j=0;
            if(arr[beginX+1][beginY]>max) {
                max = arr[beginX+1][beginY];
                i = beginX+1;
                j = beginY;
            }
            if(arr[beginX-1][beginY]> max) {
                max = arr[beginX-1][beginY];
                i = beginX-1;
                j = beginY;
            }
            if(arr[beginX][beginY+ 1]> max) {
                max = arr[beginX][beginY+ 1];
                i = beginX;
                j = beginY + 1;
            }
            if(arr[beginX][beginY - 1]> max) {
                max = arr[beginX][beginY -1];
                i = beginX;
                j = beginY - 1;
            }
            if(arr[beginX][beginY]==max) {
                break;
            }
            count+=max;
            push(i,j);
            beginX = i;
            beginY= j;
        }
        System.out.println(count);
        while (end>=start) {
            Point point = pop();
            System.out.print("[" + point.x + "," + point.y + "]");
        }

    }
}