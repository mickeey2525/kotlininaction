//not includes 5 in the result
for (i in 1 until 5) {print("$i,")}

// skip a value in the iteration
for (i in 1 until 10 step 3) {print("$i, ")} //1,4,7,
for (i in 10 downTo 3 step 3) {print("$i,")} //10,7,4,1,

// filter function filters values
for (i in (1..9).filter { it % 3 ==0 || it %5 ==0 }){
    print("$i, ") //3,5,6,9
}
