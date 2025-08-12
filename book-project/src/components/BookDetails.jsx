import React, {useContext, useEffect, useState} from "react";
import {useParams} from "react-router-dom";
import { BooksContext} from "../contexts/BooksContext.jsx";


export default function BookDetails() {

    const books = useContext(BooksContext);

    // localhost:3000/books/2
    // use object destructuring to get the int "bookId" from the url
    const { bookId } = useParams();

    // find method will return the first book that matches the boolean condition given
    const book = books.find(book => book.id === parseInt(bookId));

    useEffect(() => {
        console.log(books, bookId);
    });

    if(books.length === 0) {
        return <h1>Loading...</h1>;
    }

    if(!book) {
        return <h1>Book not found.</h1>;
    }

    return (
        <div className="book details">
            <h1>{book.title}</h1>
            <h2>by {book.author}</h2>
            <p>{book.description}</p>
        </div>
    )
}

