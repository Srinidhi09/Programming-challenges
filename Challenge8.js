// Return Largest numbers in arrays

function largestOfFour(arr) {

    let result = [] ;

    for(let x of arr){
        let max = 0;
        for(let y of x){
            if(y > max) {
                max = y;
            }
        }
        result.push(max);
    }
  return result;
}

largestOfFour([[13, 27, 18, 26], [4, 5, 1, 3], [32, 35, 37, 39], [1000, 1001, 857, 1]]);
