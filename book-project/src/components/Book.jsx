import React, {useState, useEffect} from 'react';
import '../App.css';
import {BooksContext} from "../contexts/BooksContext.jsx";

export default function Body() {

    return (
        <BooksContext.Provider value={} >
            {children}
        </BooksContext.Provider>
    );
}


