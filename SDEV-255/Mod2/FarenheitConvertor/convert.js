window.addEventListener("DOMContentLoaded", domLoaded);


function domLoaded() {
   // TODO: Complete the function
    cInput.addEventListener('input', () => {
        if (fInput.value) {
            fInput.value = ""
        }
    })

    fInput.addEventListener('input', () => {
        if (cInput.value) {
            cInput.value = ""
        }
    })

    convertButton.addEventListener('click', () => { 
        if (!cInput.value && fInput.value) {
            convertFtoC(fInput.value);
        }
        else if (!fInput.value && cInput.value) {
            convertCtoF(cInput.value);
        }
    })
}



function convertCtoF(degreesCelsius) {
    // TODO: Complete the function
    let degreesFahrenheit = degreesCelsius * 9 / 5 + 32;
    fInput.value = degreesFahrenheit;

    console.log(typeof fInput.value);
    // if (typeof fInput == string)
    if (degreesFahrenheit < 32) {
        weatherImage.src = "cold.png"
    }
    else if (degreesFahrenheit > 50) {
        weatherImage.src = "warm.png"
    }
    else if (degreesFahrenheit > 31 && degreesFahrenheit < 51){
        weatherImage.src = "cool.png"
    }
    return degreesFahrenheit;
}

function convertFtoC(degreesFahrenheit) {
    // TODO: Complete the function
    let degreesCelsius = (degreesFahrenheit - 32) * 5 / 9;
    cInput.value = degreesCelsius;

    if (degreesFahrenheit < 32) {
        weatherImage.src = "cold.png"
    }
    else if (degreesFahrenheit > 50) {
        weatherImage.src = "warm.png"
    }
    else if (degreesFahrenheit > 32 && degreesFahrenheit < 50){
        weatherImage.src = "cool.png"
    }
    return degreesCelsius;
}
