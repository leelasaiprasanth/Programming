// Object-Oriented Programing

// Encalpsulation, Abstraction, Inheritance, Polymorphism, Reusability;

const cie = {
  radius: 1,
  location: {
    x: 1,
    y: 1,
  },
  draw: function () {
    console.log("draw");
  },
};

// Object has behaviour Factory or constructor function

function createCircle() {
  return {
    radius,
    draw() {
      console.log("draw");
    },
  };
}

const circle = createCircle(1);

class Circle {
  constructor(radius) {
    this.radius = radius;
    let defaultLocatioon = { x: 0, y: 0 };
    this.draw = function () {
      console.log("draw");
    };
  }
}

const another = new Circle(1);

// Primitives are coppied by value
// Objects are copied by refernece

circle.location = { x: 1 };

for (const key in circle) {
  console.log(key, circle[key]);
}

// Inheritance

// Classical Vs Prototipical Inheritance

// Objects Created by a given constructor will have same proptotypes
