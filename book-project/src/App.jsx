import './App.css'

import Header from './components/Header.jsx'
import Footer from './components/Footer.jsx'
import Books from './components/Books.jsx'
import {BrowserRouter as Router, Routes, Route, Link, Navigate}  from "react-router-dom";
import BookDetails from './components/BookDetails.jsx'

//importing the BooksProvider from our context
// so that we can give a global state to child components

import {BooksContext, BooksProvider} from "./contexts/BooksContext.jsx";

function App() {

    return (
        <>
            <BooksProvider>
                <Header />
                <Router>
                    <Routes>
                        <Route path="/" element={<Books />} />
                        <Route path="/books" element={<Navigate to="/" />} />
                        <Route path="/books/:bookId" element={<BookDetails />} />
                    </Routes>
                </Router>
                <Footer />
            </BooksProvider>
        </>
    );
}

export default App
