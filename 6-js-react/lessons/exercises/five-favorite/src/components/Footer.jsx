import React from 'react'
import '../App.css'

export default function Footer() {
    const currentYear = new Date().getFullYear();


    return (
        <footer className="page-footer">
            <h3 className="footer-text">©{currentYear} this is my website, all right reserved.</h3>
        </footer>
    );

}