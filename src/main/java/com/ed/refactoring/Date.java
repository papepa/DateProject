/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.ed.refactoring;

/**
 *
 * @author elena
 */
public class Date {

    private int day, month, year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Checks if given day is between 1 and 31
    public boolean validateDay() {
        return day >= 1 && day <= 31;
    }

    // Checks if given month is between 1 and 12
    public boolean validateMonth() {
        return month >= 1 && month <= 12;
    }

    // Returns the number of days in the month
    public int numberOfDays() {
        return switch (month) {
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear() ? 29 : 28;
            default -> 31;
        };
    }

    // Determines if the year is a leap year
    private boolean isLeapYear() {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

    // Validates if the date is correct
    public boolean validate() {
        if (!validateMonth() || !validateDay()) {
            return false;
        }
        return day <= numberOfDays();
    }
}

