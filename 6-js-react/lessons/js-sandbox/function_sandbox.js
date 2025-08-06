function helloWorld() {
    alert("Hello World!");
}

helloWorld();

function nameGreeting(name = "anony") {
    console.log(`hello, ${name}. `);
}

nameGreeting("Bobbert");
nameGreeting();

function average() {
    let sum = 0;
    for (let i = 0; arguments.length; i++) {
        sum += arguments[i];
    }
    return sum / arguments;
}

console.log(nameGreeting("Bobbert" + average()));

let test = null;
let test2 = undefined;

let test3 = Number.isNaN;
let test4 = Number.POSITIVE_INFINITY;

function getInput(string = ""){
    let input= null;
    do {
        input = window.prompt(prompt);
    } while(input === null || input === undefined || input.length === 0)
    console.log(input);
    return input;
}

let userInput: null = getInput("Enter some text");
console.log(userInput);


function getCatFact() {
    fetch("https://catfact.ninja/fact")
        .then(res => res.json())
        .then(data => console.log(data))
        .catch(err => console.log(err));
}

getCatFact();

function getBooks() {
    fetch("books.json")
    .then(res => res.json())
    .then(data => console.log(data))
    .catch(err => console.log(err));
    }
    getBooks();