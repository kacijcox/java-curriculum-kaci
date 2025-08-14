import React from 'react';
import { Navigate } from 'react-router-dom';
import authService from '../services/authService';

const ProtectedRoute = ({ children }) => {
    return authService.isLoggedIn() ? children : <Navigate to="/login" />;
};

export default ProtectedRoute;