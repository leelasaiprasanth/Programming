// console.log("RadhaeKrishna...Barsana");
//Access the element

// let concate = document.querySelector("h1");
// console.log(concate.innerText);

// concate.innerText = concate.innerText + "Barsana";
// console.log(concate.innerText);

let divs = document.querySelectorAll(".box");

for (div of divs) {
  console.log(div.innerText);
}

divs[0].innerText = "kannaya";
divs[1].innerText = "Radhama";
divs[2].innerText = "Kanama";

let newBtn = document.createElement("button");
newBtn.innerText = "Harekrishna";
console.log(newBtn.innerText);

let newDiv = document.querySelector(".box");
newDiv.before(newBtn);

let newHeading = document.createElement("h1");
newHeading.innerHTML = "<b>RadhaeKrishna...</b>";

document.querySelector("body").prepend(newHeading);
