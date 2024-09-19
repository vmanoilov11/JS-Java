function solve(array) {
    let result = []
    for(let i = 0; i < array.length; i++){
        if(i % 2 !== 0){
            result.push(array[i]*2)
        }
    }
    console.log(result.reverse().join(" "))
    
}
