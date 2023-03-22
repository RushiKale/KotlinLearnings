package com.kotlin.basic

import kotlin.math.*

data class Point2D(val x : Int,val y : Int) {

    /***
     * Create a  class Point2D  , for representing a point in x-y co-ordinate system.

    4.1 Create a parameterized constructor to accept x & y co-ords.

    4.2 Add  show() method  --to return point's x & y co-ords
    eg : public String show() {.....}

    4.3 Add a non static  , isEqual method to Point2D class : boolean returning method : must return true if both points are having same x,y co-ords or false otherwise.
    eg : public boolean isEqual(Point2d anotherPoint)
    {
    return this.x == anotherPoint.x && ....;
    }

    eg : p1.isEqual(p2);
    OR
    p2.isEqual(p1)

    4.4 Add a non static method , calculateDistance , to calc distance between 2 points
    Hint : use distance formula.
     */


    fun show() : String{
        return "X : $x and Y : $y"
    }

    fun isEqual(point : Point2D) : Boolean{
        return this == point
    }

    fun calculateDistance(point: Point2D) : Double{
        val ans : Double = (Math.pow((this.x - point.x).toDouble(), 2.0)+ Math.pow((this.y - point.y).toDouble(),2.0))
        return sqrt(ans)
    }

    /**
     * Question 1 :
     *  fun Point2D.calculateDistance(point: Point2D) : Double{ ... }
     *  what is meaning of this ?
     *
     */
}