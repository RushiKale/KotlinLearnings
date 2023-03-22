package com.kotlin.basic

fun main() {
    /***
     * eg : In Tester :
    double distance=p1.calculateDistance(p2);

    public double calculateDistance(Point2d anotherPoint)
    {
    return sqrt(pow(this.x-anotherPoint.x,2),......);
    }
     */

    val p1: Point2D = Point2D(3, 2)
    val p2: Point2D = Point2D(9, 7)
    val p3: Point2D = Point2D(3, 2)


    println(p1.show())
    println(p2.show())
    println()
    if(p1.isEqual(p2))
        println("P1 and P2 are same")
    else
        println("Distance between points P1 and P2 is : ${p1.calculateDistance(p2)}")

    if(p1.isEqual(p3))
        println("P1 and P3 are same")
    else
        println("Distance between points P1 and P3 is : ${p1.calculateDistance(p2)}")

}