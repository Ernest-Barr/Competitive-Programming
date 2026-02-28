package util

import kotlin.math.sign

data class Point(val x: Int, val y: Int)

data class PointF(val x: Double, val y: Double)

fun orientation(a: Point, b: Point, c: Point): Int =
    (a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y)).sign

fun inDisk(c: Point, p: Point, r: Int): Boolean = ((c.x - p.x) * (c.x - p.x) + (c.y - p.y) * (c.y - p.y)) <= r * r

fun distSquared(a: Point, b: Point): Int = (a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y)

//TODO Add manhattan distance and other equations
