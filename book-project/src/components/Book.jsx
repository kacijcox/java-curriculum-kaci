import React from 'react'
import '../App.css'

export default function Book(props) {
    return (
        <div className="book">
            <h4>{props.title}</h4>
            <h5>by {props.author}</h5>
            <p>{props.description}</p>
        </div>)
}