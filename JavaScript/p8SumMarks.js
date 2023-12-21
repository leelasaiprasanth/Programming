let marks = [85, 97, 44, 37, 76, 60];

let sum = 0;

for (let val of marks) {
  //we track value
  sum += val;
}
console.log(sum);
console.log(sum / marks.length);

let items = [250, 645, 300, 900, 50];
let idx = 0;
for (let val of items) {
  console.log(idx, val);
  let offer = val / 10;
  items[idx] = items[idx] - offer;
  console.log(items[idx]);
  idx++;
}

for (let i = 0; i < items.length; i++) {
  let offer = items[i] / 10;
  items[i] -= offer;
}
console.log(items);
