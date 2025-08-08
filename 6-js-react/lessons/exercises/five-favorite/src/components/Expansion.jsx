import React from 'react'
import '../App.css'

export default function Expansion(props) {
    return (
        <div className="expansion">
            <p>series: {props.series}</p>
            <p>expansion: {props.expansion}</p>
            <p>artist: {props.artist}</p>
            <p>lore: {props.lore}</p>
        </div>)
}