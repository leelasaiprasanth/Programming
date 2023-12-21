const student = {
  fullname: "RadhaeKrishna",
  marks: 94.4,
  printMarks: function () {
    console.log("marks =", this.marks); //Student.marks
  },
};
// console.log(student, student.printMarks);

const employee = {
  calcTax() {
    console.log("Tax rate is 10%");
  },
};

const karanArjun = {
  salary: 50000,
};

karanArjun.__proto__ = employee;

//Template
class ToyotaCar {
  constructor(brand, mileage) {
    this.brand = brand;
    this.mileage = mileage;
  }
  start() {
    console.log("start");
  }
  stop() {
    console.log("stop");
  }
  // setBrand(brand) {
  //   this.brandName = brand;
  // }
}

//Creating object
let fortuner = new ToyotaCar("fortuner", 10);
console.log(fortuner);
// fortuner.setBrand("fortuner");
let lexus = new ToyotaCar("lexus", 12);
console.log(lexus);
// lexus.setBrand("lexus");

class Parent {
  hello() {
    console.log("hello");
  }
}

class Child extends Parent {}

let obj = new Child();
console.log(obj.hello());

class Person {
  constructor(name) {
    console.log("homosapiens");
    this.name = name;
  }
  eat() {
    console.log("eat");
  }
  // sleep() {
  //   console.log("Sleep");
  // }
  // work() {
  //   console.log("Do nothing..");
  // }
}

class Engineer extends Person {
  constructor(branch) {
    super(); //To invoke parent class constructor
    this.branch = branch;
  }
  work() {
    console.log("Solve problem, build something");
  }
}

let engObj = new Engineer("chemical Engg");
console.log(engObj, engObj.work());
