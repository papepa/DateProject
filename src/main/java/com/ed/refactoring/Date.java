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

/**
* Constructor for Date object.
* @param day   the day of the month
* @param month the month of the year
* @param year  the year
*/
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

/**
* Checks if the given day is valid (between 1 and 31).
* @return true if the day is valid, false if the day is not valid
*/
    public boolean validateDay() {
        return day >= 1 && day <= 31;
    }

/**
* Checks if the given month is valid (between 1 and 12).
* @return true if the month is valid, false it the month id not valid.
*/
    public boolean validateMonth() {
        return month >= 1 && month <= 12;
    }

/**
* Returns the number of days in the given month, considering leap years.
* @return the number of days in the month.
*/
    public int numberOfDays() {
        return switch (month) {
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear() ? 29 : 28;
            default -> 31;
        };
    }

/**
* Determines if the given year is a leap year.
* @return true if the year is a leap year, false if not
*/
    private boolean isLeapYear() {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

/**
* Validates if the date is correct.
* @return true if the date is valid, false if the date us not valid
*/
    public boolean validateDate() {
        if (!validateMonth() || !validateDay()) {
            return false;
        }
        return day <= numberOfDays();
    }
}

