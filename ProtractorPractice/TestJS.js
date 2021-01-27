/**
 * 
 */
function test1() {
	var str = 0;
	this.getModel = function() {
		str = str + 1;
		console.log("Total: " + str);
		return str;
	}

}

var obj = new test1();
var str = obj.getModel();
console.log(str);