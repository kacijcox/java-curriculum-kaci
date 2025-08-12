import React, { useContext } from "react";
import '../App.css';

export default function Book(props) {
    return (
        <div className="book">
            <h4>{props.title}</h4>
            <p>{props.description}</p>
            <p>{props.author}</p>
        </div>
    );
}

