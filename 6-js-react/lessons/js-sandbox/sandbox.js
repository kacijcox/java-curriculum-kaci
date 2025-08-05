let awesome_variable = 1.5;

const final_variable = 2;

console.log(awesome_variable + final_variable);

let x = 7;
let y = 100;

console.log(`${x} + ${y}  = ${x+y}`);

let string_var = 'STRING'; // String
let number_var = 1.9
let binary_var = 0b0111;
let e_notation_var = .2e12
console.log(e_notation_var);

let red = 0x00;
let green = 0xFF;
let blue = 0x99;

string_var = 12;
console.log(string_var);

let boolean_var = true;

if(8.0 == 8) {
    console.log("8.0 == 8 is true")
} else {
    console.log("8.0 == 8 is false");
}

let die1 = Math.floor (Math.random() * 6) + 1;

console.log(die1);

looping

let die1 = 0;
let counter = 0;

while (die1 !==6) {
    diet1 = Math.floor(Math.random() * 6) + 1;
    counter++;
    console.log(die1, " -", counter);
}

for (let i =1; i <= 10; i++) {
    console.log("num i" + i)
}

let testString = "long test string to test length"
for (let i = 0; i <= testString.length; i++) {
    console.log("char" + i + ": " + testString[i]);
}

let diceRolls = [1,2,3,4,5,5,4,1,1, "blue", true]
console.log(diceRolls);

diceRolls[0] = 5;
diceRolls[diceRolls.length-1] = false;
let words = testString.split("");
console.log(words);

diceRolls.push();