function solve(matrix) {
    let max = -Infinity;
    for (let i = 0; i < matrix.length; i++){
        for(let j = 0; j < matrix[i].length; j++){
            if (matrix[i][j] > max) {
                max = matrix[i][j];
            }
        }
    }
    console.log(max)
}
