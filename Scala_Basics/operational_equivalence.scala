// Define two functions that calculate the area of a rectangle

// Program 1: Using width and height directly
def areaProgram1(width: Double, height: Double): Double = width * height

// Program 2: Using a helper function to calculate area
def calculateArea(width: Double, height: Double): Double = width * height
def areaProgram2(width: Double, height: Double): Double = calculateArea(width, height)

// Input values
val width = 5.0
val height = 3.0

// Calculate areas using both programs
val result1 = areaProgram1(width, height)
val result2 = areaProgram2(width, height)

// Output results
println(s"Area using Program 1: $result1") // Output: Area using Program 1: 15.0
println(s"Area using Program 2: $result2") // Output: Area using Program 2: 15.0
