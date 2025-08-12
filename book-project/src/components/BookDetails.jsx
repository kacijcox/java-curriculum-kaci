import React, {useContext, useState} from "react";
import { BooksContext } from "../contexts/BooksContext.jsx";
const { bookId : string } = useParams();

// find method will return the first book that matches the boolean condition given
const book = books.find(book => book.id === parseInt(bookId));

useEffect(() => {
    console.log(book, bookId);
});

if(!book === 0) {
    return <h1>loading...</h1>
}

if (!book) {
    return <h1>loading...</h1>
}

return (
    <div>
        <h1>{book.title}</h1>
        <h2>by {book.author}</h2>
        <p>{book.description}</p>
    </div>
)