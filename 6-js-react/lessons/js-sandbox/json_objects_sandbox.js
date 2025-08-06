import fs from 'fs/promises';

// {
//     "id": 1,
//     "title": "To Kill a Mockingbird",
//     "author": "Harper Lee",
//     "description": "A novel about the serious issues of rape and racial inequality."
// }


let book = new Object();
book.id =1;
book.title = "to kill a mockingbird";
book.author = "harper lee";
book.description = "a novel about the serious issues of rape and racial inequality"
book.print = function () {
    console.log("id" + this.id + ", Title" + this.title);
};
console.log(book);
book.print();

function Book(id, title, author, description) {
    this.id = id;
    this.title = title;
    this.author = author;
    this.description = description;
    this.print= function(){
            console.log("id" + this.id + "title" + this.title)
    };
};

let book2 = new Book(2,"1984", "george orwell","A dystopian social science fiction novel and cautionary tale about the dangers of totalitarianism")
console.log(book2);
book2.print();

// "id": 3,
//     "title": "Moby-Dick",
//     "author": "Herman Melville",
//     "description": "A story about Captain Ahab's obsessive quest to kill the white whale, Moby Dick."


let book3 = {
    id: 3,
    title: "moby dick",
    author: "harper lee",
    description: "A story about Captain Ahab's obsessive quest to kill the white whale, Moby Dick",
    print: function () {
        console.log("id" + this.id + "title" + this.title)
    }
};
console.log(book3);
book3.print();

// inheritance in js
class Pet {
    constructor(eats, space, owner) {
        this.eats = eats;
        this.space = space;
        this.owner = owner;
    }
}

class Bunny extends Pet {
    constructor(eats, space, owner, cleanSchedule) {
        super(eats, space, owner);
        this.cleanSchedule = cleanSchedule;
    }
}

class Cat extends Pet {
    constructor(eats, space, owner, cleanSchedule, pettingSchedule) {
        super(eats, space, owner);
        this.cleanSchedule = cleanSchedule;
        this.pettingSchedule = pettingSchedule;
    }
}

let george = new Pet("steak", "large backyard", "jose");
let oliver = new Bunny("electrical cords", "private room", "ben", "weekly")
let garfield = new Cat("everything", "couch", "ben", "always", "all the time")

console.log(george);
console.log(oliver);
console.log(garfield);

console.log(george.eats);
console.log(oliver["cleanSchedule"]);

garfield.exercise = "daily";

console.log(garfield["exercise"]);

delete garfield.exercise;
console.log(garfield["exercise"]);

let bookJSON ='{\n' +
    '  "id": 4,\n' +
    '  "title": "Pride and Prejudice",\n' +
    '  "author": "Jane Austen",\n' +
    '  "description": "A romantic novel that charts the emotional development of the protagonist, Elizabeth Bennet"\n' +
    '}';


//json.parse(jsonString) to deserialize a JS object from JSON
let book4 = JSON.parse(bookJSON);
console.log(book4);

//serialize a JS ibject to a JSON string
console.log(JSON.stringify(book4));

async function getBooks() {
    try {
        const response = await fetch("books.json")
        return await response.json();
    } catch (error) {
        console.log(error);
    }
}
getBooks().then(data => {
    console.log(data);
});

let bookList = {};
getBooks().then(data => {
    bookList = data;
    console.log(bookList);
});

// async function putBooks() {
//   try {
//     const response = await fetch("https://some-endpoint", {
//       method: "POST",
//       headers: new Headers({"Content-Type": "application/json"}),
//       body: JSON.stringify(book3)
//     });
//     return response.json();
//   } catch (error) {
//     console.log(error);
//   }
// }

// Optional Chaining


function cleanToday(pet, today) {
    if(pet.cleanSchedule) {
        for (let i = 0; i < pet.cleanSchedule?.length; i++) {
            if (today === pet.cleanSchedule[i]) {
                console.log("Clean this creature");
                return;
            }
        }
        console.log("Don't clean this creature");
    }
    else{
        console.log("no cleaning schedule");
    }
}


cleanToday(garfield, "WED");
cleanToday(oliver,"WED");
cleanToday(george, "WED");

//json objects exercise practice writing json
// pull it in and convert it to objects


/// ---> JSON AND OBJECTS EXERCISE <--- \\\

// task 1
let car = new Object();
car.make = "toyota";
car.model = "corolla";
car.year = "2021";
car.color = "red";
car.drive = function(){
    console.log('the car is driving');
};
console.log(car);
car.drive();

// task 2
car.color = "blue";
car.fuelType = "gasoline";
delete car.year;

console.log(car);

// task 3

let driver = new Object();
driver.name = "john";
driver.licenseNumber = "abc123456";
driver.age = "30";

car.driver = driver;
console.log(car);

console.log(car.driver.name);

// task 4
let carStringify = (JSON.stringify(car));
console.log(carStringify);

// task 5
let carParse = JSON.parse(carStringify);
console.log(carParse);


// async function putBooks() {
//     try {
//         const jsonData = JSON.stringify(car, null, 2);
//
//         await fs.writeFile('books.json', jsonData, `utf8`);
//         console.log("success");
//         return { success: true };
//     } catch (error) {
//         console.log(error);
//     }
// }
//
// putBooks();

