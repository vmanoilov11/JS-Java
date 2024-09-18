function solve(num1, num2, operator){
    const operators = {
        '+': (a, b) => a + b,
        '-': (a, b) => a - b,
        '*': (a, b) => a * b,
        '/': (a, b) => a / b,
        '%': (a, b) => a % b,
        '**': (a, b) => a ** b
    }
    const result  = operators[operator] ? operators[operator](num1, num2) : "Error: Invalid operator"
    console.log(result)

}
