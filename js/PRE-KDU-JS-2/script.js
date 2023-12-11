    const num1Input = document.getElementById('num1');
    const num2Input = document.getElementById('num2');
    const resultElement = document.getElementById('result');


    const addButton = document.querySelector('#funct button:nth-child(1)');
    const subtractButton = document.querySelector('#funct button:nth-child(2)');
    const multiplyButton = document.querySelector('#funct button:nth-child(3)');
    const divideButton = document.querySelector('#funct button:nth-child(4)');


    addButton.addEventListener('click', function () {
        performOperation((num1, num2) => num1 + num2);
    });

    subtractButton.addEventListener('click', function () {
        performOperation((num1, num2) => num1 - num2);
    });

    multiplyButton.addEventListener('click', function () {
        performOperation((num1, num2) => num1 * num2);
    });

    divideButton.addEventListener('click', function () {
        performOperation((num1, num2) => (num2 !== 0 ? num1 / num2 : "Cannot divide by zero"));
    });

    function performOperation(operation) {
        const num1 = parseFloat(num1Input.value);
        const num2 = parseFloat(num2Input.value);
            const result = operation(num1, num2);
            resultElement.innerText = `Result: ${result}`;
        
    }

