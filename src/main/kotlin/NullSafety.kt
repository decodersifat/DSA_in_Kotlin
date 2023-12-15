fun main(){


    // 1st way

    val name:String ? = null
    //2nd way
    var len :Int ? = name?.length ?: 1

    //3rd way
    val length = name!!.length

    //4th way

        if (name == null){
            len = -1
        }
        else{
            len = name.length
        }




    println(length)

}