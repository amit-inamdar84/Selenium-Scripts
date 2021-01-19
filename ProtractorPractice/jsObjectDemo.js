/**
 * 
 */

function car(){
	this.color = "Red";
	this.brand = "BMW";
	
	this.getModel = function(){
		console.log("This is 2012 model");
	};
};

//We can create object in same file as well as in other file.
var obj = new car();
obj.getModel();
console.log(obj.color);

//Below code will help to export code to other JS files.
//i.e. object is exported to be used in other files.
module.exports = new car();