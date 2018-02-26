// Change first letter of each word to Capital in a string

function titleCase(str) {

    /* Solution 1
    var toArray = str.toLowerCase().split(' ');

    var result = toArray.map(function(text){
      return text.replace(text.charAt(0), text.charAt(0).toUpperCase());
    });

    return result.join(' ');
    */

   // Solution 2
 
    let arr = str.toLowerCase().split(' ');
    let result = [];

    for(let x of arr){

        let y = x.replace(x.charAt(0), x.charAt(0).toUpperCase());
        result.push(y);
    }
    return result.join(' ');
}

titleCase("sHoRt AnD sToUt");
