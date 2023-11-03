class QueueY (n:Int){

   val arr:IntArray
   val size = n
    var rear = -1

    //Initialize Array using QueueY Class Constructor
   init {
       arr = IntArray(n)
   }
    //Checking if the array is Empty or Not
   fun isEmpty() :Boolean {
       return rear == -1
   }
    //Pushing Data into Queue also Known as Enqueue
    fun add(data:Int) {
        if (rear == size - 1) {
            println("Queue is full")
        }
        rear++
        arr[rear] = data
    }

    //Removing Data from Queue
    //Dequeue
    fun remove():Int{
         if (isEmpty()) {
             return -1
         }
         val front = arr[0]
        for (i in 0 until arr.size - 1) {
              arr[i] = arr[i+1]
         }
        rear--
        return front
    }

    //Now let's peek on Array
    fun peek():Int {
        if (isEmpty()) {
            return -1
        }
        return arr[0]
    }
}
fun main(){
    val obj = QueueY(5)
    obj.add(10)
    obj.add(15)
    obj.add(20)

    while (!obj.isEmpty()){
        print("${obj.peek() } ")
        obj.remove()
    }

}