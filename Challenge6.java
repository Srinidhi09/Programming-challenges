
// Find the longest word in a string

function findLongestWord(str) {
  
  var word_array = str.split(' ');
  var max = 0;
 
  for( let word of word_array){
    
    if(word.length > max){
      max = word.length;
    }
  }
  
  return max;
}

findLongestWord("The quick brown fox jumped over the lazy dog");
