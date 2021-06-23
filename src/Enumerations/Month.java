/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enumerations;

public enum Month {
    JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30), MAY(31), JUNE(30), JULY(31),
    AUGUST(31), SEPTEMBER(30), OCTOBER(31), NOVEMBER(30), DECEMBER(31);

    private int daysAmount;

    private Month(int daysAmount) {
        this.daysAmount = daysAmount;
    }

    public int getDaysAmount() {
        return this.daysAmount;
    }
}