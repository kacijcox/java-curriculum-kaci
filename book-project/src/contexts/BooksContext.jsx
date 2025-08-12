// this is the creation of the state
import {useState, useEffect, useContext, createContext} from "react";

export const BooksContext = createContext();

// BooksProvider is a component that we are wrapping children components
// in so that they can hook into our BooksContext
export const BooksProvider = ({ children }) => {
    const [books, setBooks] = useState([]);

    // a useEffect hook that triggers when the application loads
    useEffect(() => {
        fetch("/books.json")
            .then(response => response.json())
            .then(data => {
                console.log(data);
                setBooks(data)
            })
            .catch(error => {
                console.log(error);
            });
    }, []);

        return (
            <BooksContext.Provider value={books}>
                {children}
            </BooksContext.Provider>
        );
}

