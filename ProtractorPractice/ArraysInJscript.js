/**
 * Array is a collection of values or objects.
 */
var a = [ 10, "Test", true, 20 ];

for (var i = 0; i < 4; i++) {
	console.log(a[i]);
}
console.log("Length of array: " + a.length);

for (var i = 0; i < a.length; i++) {
	console.log(a[i]);
}

var b = new Array();
b[0] = "Welcome";
b[1] = "To";
b[2] = "Javascript";

for (var j = b.length - 1; j >= 0; j--) {
	console.log(b[j]);
}