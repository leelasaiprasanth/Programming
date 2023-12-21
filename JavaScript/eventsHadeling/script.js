let btn1 = document.querySelector("#btn1");

// btn1.onclick = (event) => {
//   console.log("Radhae");
//   let a = 25;
//   a++;
//   console.log(a);
//   console.log(event.type);
//   console.log(event.target);
//   console.log(event.clientX, event.clientY);
//   console.log(event);
// };

btn1.addEventListener("click", () => {
  console.log("RadhaeKrishna..");
});

const handler = (event) => {
  console.log(event.type);
  console.log(event.target);
  console.log(event.clientX, event.clientY);
  console.log(event);
};

btn1.addEventListener("click", handler);

btn1.removeEventListener("click", handler);

//Create a toggle button that changes the screen to dark-mode when clicked & lightmode when clicked again.

let modeBtn = document.querySelector("#mode");
let body = document.querySelector("body");
let currMode = "light"; // dark

modeBtn.addEventListener("click", () => {
  if (currMode === "light") {
    currMode = "dark";
    body.classList.add("dark");
    body.classList.remove("light");
  } else {
    currMode = "light";
    body.classList.add("light");
    body.classList.remove("dark");
  }
  console.log(currMode);
});

// Div Hover
let boxBtn = document.querySelector("#box");
let bodyBtn = document.querySelector("div");

let currDiv = "green"; //Purple

boxBtn.addEventListener("mouseover", () => {
  if (currDiv === "green") {
    currDiv = "purple";
    body.classList.add("green");
    body.classList.remove("purple");
  } else {
    currDiv = "green";
    body.classList.add("purple");
    body.classList.remove("green");
  }
  console.log(currDiv);
});
