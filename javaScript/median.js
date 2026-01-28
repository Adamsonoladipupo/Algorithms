
let input = [2, 5,1,9,8,9]
let input2 = [20, 15, 21, 16,17]
let input3 = [7,4,6,7,2,8]
let input4 = [1,2,3,4,5,6]

function getMedian(input){
    for(let count = 0; count < input.length; count++){
        for (let counter = 0; counter < count; counter++){
            if (input[counter] > input[count]){
                let temporaryVariable = input[counter];
                input[counter] = input[count]
                input[count] = temporaryVariable;
            }
        }
    }
    let middleNumber = 0;
    for (let median = 0; median < input.length; median++){
        if (input.length % 2 != 0) {
            middleNumber = Math.floor(input.length/2);
            if(median == middleNumber) return input[median];
        }
        else {
            middleNumber = Math.floor(input.length/2);
            if(median == middleNumber) {
                return (input[median-1] + input[median])/2;
            }
        }
    } 
    return 0;
}



console.log(getMedian(input));
console.log(getMedian(input2));
console.log(getMedian(input3));
console.log(getMedian(input4));