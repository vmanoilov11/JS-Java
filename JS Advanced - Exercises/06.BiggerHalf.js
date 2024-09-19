function solve(array) {
    array.sort((a,b) => a - b)
    let biggerPart = array.slice(array.length/2, array.length)
    return biggerPart
}
