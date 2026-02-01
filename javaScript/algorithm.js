function getUniqueNumber(userInput){
    let repeat = [];
    let uniqueNumbers = [];
    for (let loop = 0; loop < userInput.length; loop++){
        let element = userInput[loop];
        let isExist = false;
        for (let check = 0; check < uniqueNumbers.length; check++){
            if(uniqueNumbers[check] === element) {
                isExist = true;
                repeat[check]++;;
            }
        }

        if(!isExist) {
            uniqueNumbers[uniqueNumbers.length] = element;
            repeat[repeat.length] = 1;
        }
    }
    return `${repeat}  \n${uniqueNumbers}`;
}

let input = [11,11,0,20,0,1,1,2,3,3,3,4,4,10,5,1,111,11,99,6,20, 111,111];
console.log(getUniqueNumber(input))