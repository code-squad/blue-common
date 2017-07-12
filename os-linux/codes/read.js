var fs = require('fs');

var data = fs.readFileSync('hello.txt', 'utf-8');
console.log(data);
