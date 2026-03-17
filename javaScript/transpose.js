input = [[2,3,5],[1,6,9],[1,2,3]]
// output = [[2,1], [3,6], [5,9]]
function transpose(input){
    newArray = [[],[],[]] 
    arr = []
    dict = []
    for (let count = 0; count < input.length; count++){
        for (let counter = 0; counter < input[count].length; counter++){
            dict.push(input[count][counter])
            newArray[counter][count] = input[count][counter]
        }
    }
    console.log(newArray)
    console.log(dict)
}
transpose(input)
