let marks = [95, 98, 94, 92, 91];
console.log(marks);
console.log(marks.length); //Property
console.log(typeof marks, marks[0], marks[10]);

marks[3] = 88;
console.log(marks);

let heros = [
  "IronMan",
  "Hulk",
  "SpiderMan",
  "Thor",
  "Marvel",
  "AntMan",
  "CapitanAmerica",
];
console.log(heros.length, typeof heros, heros);

//For Loop
for (let idx = 0; idx < heros.length; idx++) {
  console.log(heros[idx]);
}
//For of loop
for (const el of heros) {
  console.log(el);
}

let cities = ["Delhi", "Mumbai", "Hyderabad", "Kolkutta"];

for (let val of cities) {
  console.log(val.toUpperCase());
}

//Array Methods
let veggies = ["potato", "garlic", "carrot", "beatroot"];
veggies.push("spegati", "capsicum", "cucumber");
console.log(veggies);

console.log(veggies.pop());
console.log(veggies);

console.log(marks.toString());

let heross = ["batman", "Superman", "Aquaman"];
let hers = ["Shkthiman", "Krish"];

let Heros = heros.concat(heross);
console.log(Heros);
console.log(heros);
console.log(heross);
console.log(hers.concat(Heros));

let arr = [1, 2, 3, 4, 5, 6, 7, 8];
console.log(arr.splice(2, 1));

let companies = ["Bloomberg", "Microsoft", "Uber", "Google", "Netflix", "IBM"];

// console.log(companies.shift(), companies);

console.log(companies.splice(2, 1, "Ola"), companies);

console.log(companies.push("Amazon"), companies);
