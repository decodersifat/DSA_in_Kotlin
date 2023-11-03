
//Creating a function for partition, and it will return the index of exact location of pivot which will be j
//partition function wil take 3 parameter: high, low and the array we have to sort.
fun partition(l:Int,h:Int,arr:IntArray):Int{
    var i = l
    var j = h
    var pivot = arr[l]

    while (i<j){
        while (arr[i]<pivot){
            i++
        }
        while (arr[j]>pivot){

            j--
        }
        if (i>j){
            return j
        }
        // Swap
        var temp = arr[i]
        arr[i] = arr[j]
        arr[j] = temp

        //Increasing low element index
        i++
        //Decreasing upper element index
        j--


    }

    return j

}


fun main (){
    //Creating an array
    var arr = intArrayOf(3,4,1,5,6,7,9,8,2)
    var low = 0
    var high = arr.size -1

}