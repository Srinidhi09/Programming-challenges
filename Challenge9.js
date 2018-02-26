// Check if a string ends with the given target string

function confirmEnding(str, target) {
  
  return str.substr(-target.length) === target;
}

confirmEnding("He has to give me a new name", "name");
