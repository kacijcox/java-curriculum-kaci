import React from 'react';
import { useNavigate } from 'react-router-dom';
import authService from '../services/authService';

const Dashboard = () => {
    const navigate = useNavigate();
    const username = authService.getUsername();

    const handleLogout = () => {
        authService.logout();
        navigate('/login');
    };

    return (
        <div>
            <h1>Welcome, {username}!</h1>
            <button onClick={handleLogout}>Logout</button>
            <h2>Crypto Dashboard</h2>
            <p>Select your cryptocurrencies here</p>
        </div>
    );
};

export default Dashboard;