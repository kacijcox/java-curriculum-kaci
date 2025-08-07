// Adding properties to JS objects
const firstName = "John";
const lastName = "Doe";
const username = "JOHN_THE_DOE"
const email = "JDOE@gmail.com";

const user = {
    firstName: firstName,
    lastName: lastName,
    username: username,
    contactInfo: {
        email: email,
        phoneNumber: "555-555-5555",
        address: "1234 Address St",
    }
};

const userCompact = {
    firstName,
    lastName,
    email,
    username,
};
console.log(user);
console.log(userCompact);

// Object Destructuring
const { username: login, firstName: fname, lastName: lname} = user;
console.log(login + " " + fname + " " + lname);
console.log(user.username + " " + user.firstName + " " + user.lastName);

const { contactInfo: {email: userEmail, phoneNumber, address}} = user;
console.log(userEmail, phoneNumber, address);

// Assign method and spread operator

const me = {
    name: "My Name",
    age: 36,
    weight: 270,
    isLying: false,
};

const you = {
    name: "Your Name",
    myOwnKey: "key",
};

const someoneElse = {
    name: "Unknown",
    age: 500,
};


// Object.assign(you, me, someoneElse);

function printUs() {
    console.log("Me: ", me);
    console.log("You: ", you);
    console.log("Someone Else: ", someoneElse);
}

// const anotherPerson = Object.assign({}, you, me, someoneElse);
const anotherPerson = {...you, ...me, ...someoneElse};

printUs();
console.log(anotherPerson);

// spread operator with arrays
const colors = ["red", "green", "yellow", "blue"];
const moreColors = ["orange", "purple", ...colors];
console.log(moreColors);


// Copying a JavaScript Object
const userCopy = structuredClone(user);
userCopy.firstName = "Jane";
console.log(userCopy);
console.log(user);


// Array Methods
async function getBooks() {
    try {
        const response = await fetch("books.json");
        return response.json();
    } catch (error) {
        console.log(error);
    }
}

let bookList = {};
getBooks().then(data => {
    bookList = data;
    //console.log(bookList);
    // .find() to get a single element from an array, based on some boolean condition
    const getThirdBook = bookList.find(book => book.id === 3);
    console.log(getThirdBook);

    // .filter() to get an array from an existing array, based on some boolean condition
    const tolkienBooks = bookList.filter(book => book.author.includes("Tolkien"));
    console.log(tolkienBooks);

    // .map() allows us to modify every element in an array
    // I want to add a checkedOut boolean property to all books, defaulted to false
    const libraryBooks = bookList.map(book => ({...book, checkedOut: false}));
    console.log(libraryBooks);


});

console.log(colors.join("-"));

/*
EXERCISES
 */

// OBJECT SHORTHAND

const title = "Software Engineer";
const company = "Tech Corp";
const location = "New York";

const job = {
    title,
    company,
    location,
};
console.log(job);

//OBJECT DECONSTRUCT
const book = {
    title: "The Great Gatsby",
    author: "F. Scott Fitzgerald",
    year: 1925,
};
console.log(book.title, book.author, book.year);

// const { title, author: bookAuthor, year: bookYear } = book;
console.log(book);

// OBJECT ASSIGN AND SPREAD
const userInfo = {
    name: "Alice",
    age: 28,
};
const jobInfo = {
    title: "Software Engineer",
    company: "Tech Corp",
};
const locale = {
    city: "New York",
    country: "USA",
};

const userprofile = objectAssign( userInfo, jobInfo, locale);

const userProfile = {
    ...userInfo,
    ...jobInfo,
    ...location,
};
console.log(userProfile);
