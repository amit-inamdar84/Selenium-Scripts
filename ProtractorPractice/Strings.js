/**
 * Same like in Java.
 */
var name = "Amit";

console.log(name.charAt(2));

var newname = name.concat("Inamdar");
console.log(newname);

console.log(name.indexOf("t"));

//Return substring of a string.
//slice(start)
//slice(start,end) return substring starting at index start and ending at index end-1;
var title = "This is a new selenium project";
console.log(title.slice(5, 13));
console.log(title.slice(5));

console.log(title.toUpperCase());
console.log(title.toLowerCase());

//trim removes white spaces from both ends of the string.
var sp = " Text ";
console.log(sp.trim());

//Ways to declare string just like in Java
var str1 = "String1";
var str2 = new String("String2");
console.log(str1);
console.log(str2);