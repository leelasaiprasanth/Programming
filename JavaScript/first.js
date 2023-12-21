full_name = "RadhaeKrishna";
age = 24;
price = 99.99;
radius = 14;
x = null;
y = undefined;
isFollow = false;

// fullName -> Camel case
// full_name -> Snake case
// full-name -> kebab case
// FullName -> Pascal case

console.log(fullName);

let name = "RadhaKrishna";
let age = 24;
let totalPrice = 1000;

let price = 150.56;
console.log(typeof price);

let full_name = "RadhaeKrishna";
console.log(typeof full_name);

let isFollow = false;
console.log(typeof isFollow);

let x;
console.log(typeof x);

let y = null;
console.log(typeof y);

let a = BigInt("123");
console.log(typeof a);

let b = Symbol("Hello!");
console.log(typeof b);

// Objects

const student = {
  fullName: "RadheKrishna",
  age: 20,
  CGPA: 8.2,
  isPass: true,
};
console.log(student["age"]);
console.log(student.age);

student["age"] = student["age"] + 1;
console.log(student["age"]);
