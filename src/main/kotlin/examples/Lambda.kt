package examples

import models.Car
import models.Truck

fun main() {
    lambdaFunDemo()

    downloadFunctions()
}

private fun lambdaFunDemo() {
    val printMessage = {message: String -> println(message)}

    printMessage("Hi!")

    val sumA = {x: Int, y: Int -> x + y}

    println(sumA(4,5))

    val sumB : (Int, Int) -> Int = {x,y -> x + y}

    println(sumB(4,5))
}

private fun downloadFunctions() {
    downloadData("fakeUrl.com") {
        println("The code in this block will only run after the completion()")
    }

    downloadCarData("fakeUrl.com"){ car ->
        println(car.color)
    }

    downloadCarData("fakeUrl.com"){
        println(it.color)
    }

    downloadTruckData("fakeUrl.com") { truck, success ->
        if(success) {
            truck?.tow()
        } else {
            println("Error!")
        }
    }
}

private fun downloadData(url: String, completion: () -> Unit) {
    // sent a download request
    // we got back data
    // there were no network errors
    completion()
}

private fun downloadCarData(url: String, completion: (Car) -> Unit) {
    val car = Car("Telsa", "ModelX", "Blue")
    completion(car)
}

private fun downloadTruckData(url: String, completion: (Truck?, Boolean) -> Unit) {
    val truck = Truck("Toyota", "F-452")
    val webRequestSuccess = true

    if(webRequestSuccess) {
        completion(truck, webRequestSuccess)
    } else {
        completion(null, false)
    }
}