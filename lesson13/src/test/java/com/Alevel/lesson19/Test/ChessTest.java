package com.Alevel.lesson19.Test;

import mainTest.Chess;
import org.junit.Assert;
import org.junit.Test;

public class ChessTest {
    @Test
    public void chessTest1(){
        int [][] desk = new int[10][10];
        int firstPos = 3;
        int secPos = 1;
        int nextStep1 = 4;
        int nextStep2 = 3;
        Assert.assertEquals(true, new Chess().chess(firstPos,secPos,nextStep1,nextStep2));
    }
    @Test
    public void chessTest2() {
        int[][] desk = new int[10][10];
        int firstPos = 2;
        int secPos = 1;
        int nextStep1 = 5;
        int nextStep2 = 2;
        Assert.assertEquals(false, new Chess().chess(firstPos, secPos, nextStep1, nextStep2));
    }
    @Test
    public void chessTest3() {
        int[][] desk = new int[10][10];
        int firstPos = 8;
        int secPos = 2;
        int nextStep1 = 11;
        int nextStep2 = 2;
        Assert.assertEquals(false, new Chess().chess(firstPos, secPos, nextStep1, nextStep2));
    }
}
