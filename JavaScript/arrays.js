let numbers = [3, 4];

numbers.push(5, 6);

numbers.unshift(1, 2);

numbers.indexOf(5);

console.log(numbers);

const courses = [
  { id: 0, name: "Node.js" },
  { id: 1, name: "JavaScript" },
];

const course = courses.find((c) => console.log(c));

numbers = [];
numbers.length = 0;

while (numbers.length > 0) numbers.pop();

console.log(numbers);

const first = [1, 2, 3];
const second = [4, 5, 6];

const combined = [...first, "AB", ...second];

console.log(combined);

combined.forEach((num, idx) => console.log(idx, num));

const number = [1, 2, 3, 4, 1];

const output = move(number, 3, 1);

console.log(output);

function move(array, index, offset) {
  const position = index + offset;
  if (position >= array.length) {
    console.error("Invalid Offset.");
    return;
  }
  const output = [...array];
  const element = output.slice(index, 1)[0];
  output.splice(index + offset, 0, element);
  return output;
}

const count = countOccurences(number, 1);
console.log(count);

function countOccurences(array, searchElemet) {
  console.log(arguments.length);
  let count = 0;
  array.reduce((accumulator, current) => {
    const occurence = current === searchElemet ? 1 : 0;
    return accumulator + occurence;
  });
}

function sum(discout, ...prices) {
  const total = prices.reduce((a, b) => a + b);
  return total * (1 - discout);
}
console.log(sum(0.1, 20, 30));
