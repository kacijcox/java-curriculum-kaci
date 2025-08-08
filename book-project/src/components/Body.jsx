import React, {useState, useEffect} from 'react';
import '../App.css';
import Booster from './Expansion.jsx';

export default function Body() {
    const [books, setBooks] = useState([]);

    useEffect(() => { setBooks ( [
        {
            "id": 1,
            "title": "To Kill a Mockingbird",
            "author": "Harper Lee",
            "description": "A novel about the serious issues of rape and racial inequality."
        },
        {
            "id": 2,
            "title": "1984",
            "author": "George Orwell",
            "description": "A dystopian social science fiction novel and cautionary tale about the dangers of totalitarianism."
        },
        {
            "id": 3,
            "title": "Moby-Dick",
            "author": "Herman Melville",
            "description": "A story about Captain Ahab's obsessive quest to kill the white whale, Moby Dick."
        },
        {
            "id": 4,
            "title": "Pride and Prejudice",
            "author": "Jane Austen",
            "description": "A romantic novel that charts the emotional development of the protagonist, Elizabeth Bennet."
        },
        {
            "id": 5,
            "title": "The Great Gatsby",
            "author": "F. Scott Fitzgerald",
            "description": "A novel that critiques the disillusionment and moral decay of society during the Roaring Twenties."
        }
    ])
    }, []);

    const bookList = [];
    return (
        <div>
            <h1>Hello, World!</h1>
            <ul>
                {
                    books.map((book) => (
                        <Book id ={book.id} title={book.title} author={book.author} description={book.description} />
                    ))}
            </ul>
        </div>
    );
}


