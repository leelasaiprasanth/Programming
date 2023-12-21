let DATA = "Secret Information";

class User {
  constructor(name, email) {
    this.name = name;
    this.email = email;
  }
  viewData() {
    console.log("Data =", DATA);
  }
}

class Admin extends User {
  constructor(name, email) {
    super(name, email);
  }
  editData() {
    DATA = "Some new Value";
  }
}

let student1 = new User("Radhae", "radha@email.com");
let student2 = new User("krishna", "krishna@email.com");

console.log(student1, student2);

let teacher1 = new User("Balaram", "balaram@email.com");

console.log(teacher1);

let Admin1 = new Admin("admin", "admin@college.com");
