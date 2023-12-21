// userName -> @ + fullname "remove spaces" + fullname.length

let fullName = prompt("Enter your Full Name with out space.");

let userName = `@${fullName.replaceAll(" ", "")}${fullName.length}`;

console.log(userName.toLowerCase());
