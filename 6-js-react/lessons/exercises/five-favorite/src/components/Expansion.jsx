import React from 'react'
import '../App.css'
import logo from '../images/logo.png'

export default function Expansion(props) {
    return (
        <div className="expansion-container">
            <img src={logo} alt="logo" className="logo" />
            <p className="series">series: {props.series}</p>
            <p className="expansion">expansion: {props.expansion}</p>
            <p className="artist">artist: {props.artist}</p>
            <p className="lore">lore: {props.lore}</p>
        </div>)
}