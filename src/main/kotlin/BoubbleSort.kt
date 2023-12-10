
fun main(){

    val myarr = arrayOf(3,56,2,10,40,33)

    println("Array before Sorting : ${myarr.contentToString()}")

    val len = myarr.size

    for (i in 0..len-1){

        for (j in 0..len-1){

            if (myarr[i] < myarr[j]){
                //Swap
                var temp:Int = myarr[i]
                myarr[i] = myarr[j]
                myarr[j] = temp

            }
        }
    }
    println("Array after Sorting : ${myarr.contentToString()}")
}