console.log("First javascript program");
/**
Javascript is a dynamic type language, which means you dont need to specify type of the variable because it
is dynamically used by Jscript engine. We just need to specify var which can hold any data type.
To run a javascript program without protractor right click>>Run as>>Node.js Application
*/

var x = 20;
var name = "XYA";

console.log(x);
console.log(name);

//If else is same as Java. Execute some code based on a condition.
if(x == 10){
	console.log("if code executed");
}

else if(x == 20){
	console.log("else if code executed");
}

else {
	console.log("else code exected");
}

//for loop. Instead of return type we specify var.
for(var i=1; i<=100; i++){
	console.log(i);
}

for(var i=0; i<=100; i=i+5){
	console.log(i);
}

//while loop can be used to wait till an image/loader to disappears. In condition we can specify till image is displayed (true) 
//and in body we can write code to wait. Once condition is false we come out of loop and stop waiting.
//do while loop will execute at least once no matter if condition is false. In automation if we need to click on a button and then check if
//page is loaded or not and the click again on same button if it is not loaded, we use this loop.
var i=1;
while(i<5){
	console.log(i);
	i++;
}

var j = 10;
do{
	console.log(j);
	j++;
}while(j<6)
	
/*Javascript objects:
* JS is object based language rather than object oriented language.
* It is template based and not class based.
 * We dont create class to get objects but we directly create objects.
 * Everything is an object in Javascript.
 * 
 */

