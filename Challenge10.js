// Repeat a gven string num times

function repeatStringNumTimes(str, num) {
  
  var result = "";
  var i = 0;
  
  while(num > i){
    result += str;
    i++;
  }
  return result;

}

repeatStringNumTimes("abc", 3);
