console.log([1, 2, 3].push(4));
console.log("abc".toUpperCase());
console.log("XyZ".toLowerCase());

function myFunction(pray) {
  console.log(pray);
}

myFunction("RadheKrishna");

//Function -> 2 numbers, sum
function sum(x, y) {
  //Local variable -> Scope
  s = x + y;
  return s;
}
// sum(2794, 1682);
// console.log(s);
console.log(sum(2794, 1682));

// Modern JS
const arrowMult = (a, b) => {
  return a * b;
};

console.log(arrowMult(2, 3));

function countVowels(str) {
  //"Radhaekrishna", count =0
  let count = 0;
  for (const char of str) {
    console.log(char);
    if (
      char === "a" ||
      char === "e" ||
      char === "i" ||
      char === "o" ||
      char === "u"
    ) {
      count++;
    }
  }
  console.log(count);
}
countVowels("Radhaekrishna");
const countVow = (str) => {
  //"Radhaekrishna", count =0
  let count = 0;
  for (const char of str) {
    console.log(char);
    if (
      char === "a" ||
      char === "A" ||
      char === "e" ||
      char === "E" ||
      char === "i" ||
      char === "I" ||
      char === "o" ||
      char === "O" ||
      char === "u" ||
      char === "U"
    ) {
      count++;
    }
  }
  console.log(count);
};

countVow("AmmaNanna");

const printHello = () => {
  console.log("Hello");
};
printHello();
printHello();

console.log("AmmaNanna".toUpperCase());

"AmmaNanna".toUpperCase();

//forEach array method
let arr = [1, 2, 3, 4, 5];

arr.forEach(function printVal(val) {
  console.log(val);
});

arr.forEach((val) => {
  console.log(val);
});

let nums = [742, 23532, 6274, 2742, 2472];

let calSquare = (num) => {
  console.log(num * num);
};

nums.forEach(calSquare);

//Map method
let newArr = nums.map((val) => {
  return val * val;
});
console.log(newArr);

//Filter method

let oneDigit = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0];

let evenArr = oneDigit.filter((value) => {
  return value > 3;
});
console.log(evenArr);

//Reduce Method
const output = evenArr.reduce((res, curr) => {
  return res > curr ? prev : curr;
});
console.log(output);

//Practise question
let marks = [97, 64, 32, 49, 99, 96, 86];
let toppers = marks.filter((val) => {
  return val > 90;
});
console.log(toppers);

//Practice
let n = 5;
let arrr = [];
for (let i = 1; i <= n; i++) {
  arrr[i - 1] = i;
}
console.log(arrr);

let aarrr = arrr.reduce((req, res) => {
  return req + res;
});
console.log(aarrr);

let aaarrr = arrr.reduce((req, res) => {
  return req * res;
});
console.log(aaarrr);
