/**
 * ajax1.js
 * Asynchronous Javascript And Xml.
 */
/*setTimeout(function() {
	console.log("1");
}, 1000);
setTimeout(function() {
	console.log("2");
}, 1000);
setTimeout(function() {
	console.log("3");

}, 1000);
console.log("1");
console.log("2");
console.log("3");*/

let xhtp = new XMLHttpRequest(); //비동기방식처리.
xhtp.open('get', 'memberJson.do');
xhtp.send();
let data = [];
xhtp.onload = function() {
	let obj = JSON.parse(xhtp.responseText);
	//console.log(xhtp.responseText);
	console.log(obj);
	data = obj;
	console.log('1', data);
	for (let i = 0; i < data.length; i++) {
		console.log(data[i]);
	}
}
console.log('2', data);//비동기방식 순서 중요함