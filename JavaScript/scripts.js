//Artimetic operator
let a = 5;
let b = 2;

console.log("a + b = ", a + b, a - b, a * b, a / b);

//Uniary operator
console.log(a, b);
console.log(a++, a--, ++a, --a); //6

//Camparison Operator
let p = 5; //number
let q = "5"; //string -> number
console.log("p == q", p == q); //true

for (var i = 1; i <= 5; i++) {
  console.log(i);
  console.log("Radhekrishna");
}
console.log("Loop Ended.");
console.log(i);

//Calculate sum of 1 to 5
let sum = 0;
let n = 5;
for (let i = 1; i <= n; i++) {
  sum = sum + i;
  console.log(sum);
}
console.log(sum); //Sum =

while (i <= 10) {
  console.log("Radhakrishna");
  i++;
}

let j = 1;
do {
  console.log("j =", j);
  j++;
} while (j <= 10);

//For-of loop
let str = "Radhaekrishna";
let size = 0;

for (let val of str) {
  //Iterator -> Charecters
  console.log(val); //StringSplit =
  size++;
}
console.log(size); //String Size =

//Creating student (Object)
let student = {
  name: "RadhaeKrishna",
  age: 20,
  cggpa: 7.5,
  isPass: true,
};
// Iterating the object
for (let key in student) {
  console.log(key); //Keys =
  console.log(student[key]); //Keys.Value
}

//Strings
let str1 = "radheKrishna";
let str2 = "RadhaeKrishna";
console.log(str1, str2);

console.log(str1[11], str2[5]);
//Template literals
let sentence = `Radhae Krishna inthajar karrahae`;
console.log(typeof sentence);
console.log(sentence);

let obj = {
  item: "pen",
  price: 10,
};
let output = `The Cost of ${obj.item} is ${obj.price} rupees`;

console.log(output);
console.log(typeof output);

console.log(`1 + 2 + 3 \t= \n${1 + 2 + 3}`);

console.log(str, str.toUpperCase(), str.toLowerCase(), str.trim());

console.log(str.concat(str.slice(0, 6) + str.slice(6, 13)));

console.log(str.charAt(0) + str.charAt(6));
