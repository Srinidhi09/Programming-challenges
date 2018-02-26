//Truncate a string if it is larger than the given maximum string length

function truncateString(str, num) {
  
  var result = "";
  
  if(str.length > num && num > 3){
    result = str.slice(0, num-3) + "...";
  }
  else if(str.length > num && num <= 3){
    result = str.slice(0, num) + "...";
  }
  else{
    result = str;
  }
  return result;
}

truncateString("A-tisket a-tasket A green and yellow basket", 11);
