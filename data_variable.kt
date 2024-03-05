public fun main() {
    // Decleration
  // var value can be change in future.
  // val value cannot be reassign in future.
  // this thing we normally don't do we directly declare and assign.
    var x: Int = 10;
    
    // Initialization (Reassignment, since x was already declared)
    x = 20;
    
    // Assignment (Reassignment)
    x = 20;
    
    // Usage (Assignment to result)
    val result = x * 2;
    
    // Updating (Reassignment)
    x = x + 5;
    
    // Printing the updated value of x
    println(x);
}

