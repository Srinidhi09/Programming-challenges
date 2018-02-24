// Change first letter of each word to Capital in a string

function titleCase(str) {
 
  var toArray = str.toLowerCase().split(' ');
   
  var result = toArray.map(function(text){
    return text.replace(text.charAt(0), text.charAt(0).toUpperCase());
  });
  
  return result.join(' ');
}

titleCase("I'm a little tea pot");
