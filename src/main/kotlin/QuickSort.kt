fun partition(l: Int, h: Int, arr: IntArray): Int {
    var i = l
    var j = h
    val pivot = arr[l]

    while (i < j) {
        while (arr[i] < pivot) {
            i++
        }
        while (arr[j] > pivot) {
            j--
        }

        // Break if we have crossed each other
        if (i >= j) {
            break
        }

        // Swap the elements
        val temp = arr[i]
        arr[i] = arr[j]
        arr[j] = temp

        //Incrementing the swapping lower Index
        i++
        //Decrementing the swapping upper Index
        j--
    }

    return j
}

fun QuickSort(l: Int, h: Int, arr: IntArray) {
    if (l < h) {
        val pivotIdx = partition(l, h, arr)
        QuickSort(l, pivotIdx, arr)
        QuickSort(pivotIdx + 1, h, arr)
    }


}

fun main(args: Array<String>) {
    // Creating an array
    val arr = intArrayOf(3, 4, 1, 5, 6, 7, 9, 8, 2)

    // Unsorted array
    println("Unsorted array is:")
    arr.forEach { print("$it ") } // Add a space after each number
    println()

    // Perform quicksort
    QuickSort(0, arr.size - 1, arr)

    // Sorted array
    println("Sorted array is:")
    arr.forEach { print("$it ") } // Add a space after each number
}







