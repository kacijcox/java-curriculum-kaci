import React, {useState, useEffect, useContext} from 'react';
import '../App.css';
import Book from './Book';

// import BooksContext so this component has access to global data
import { BooksContext } from '../contexts/BooksContext.jsx'



export default function Books() {
    // useContext a hook for accessing the stored context
    const books = useContext(BooksContext);
    return (
        <div>
            <h1>All Books</h1>
            {books.map((book) => (
                <Book key={book.id}
                      title={book.title}
                      author={book.author}
                      description={book.description}
                />
            ))}
        </div>
    );
}